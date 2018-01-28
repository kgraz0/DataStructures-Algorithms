import java.util.*;

public class List {

    public static String location, date, person; // declare variables for user input
    public static Node head = null; // declare head and set it to null
    public static boolean quitted = true; // set boolean to true, will be used in main method

    public static void main(String[] args) {
    	    
    	    Node n = new Node("Room 306", "29-07-2015 11:30AM", "Jack Fer"); // add the first node to the list
            n = new Node("Room 235", "02-08-2015 10:00AM", "Kelly Virnan", n); // add the second node to the list, and link it to the previous node (n)

    	    List l = new List(); // create a new list
            l.head =  n; // set the head of the list to Node n

             /* 
             the boolean variable was used to control so the user is able
             to check, add, delete or check if the list is empty as many
             times as they like until they enter any other string
             than the ones below

             If user enters:
             
             display - it will call the displayAll() method on the list and display all the current appointments
             
             add     - it will ask the user to enter the room number, date and the person and then
                       depending on whether the list is currently empty or not, it will add the 
                       data which user entered as a new entry into the list

             delete  - it will call removeOneNode(<node>) method on the list which will remove the last node in the list

             empty   - it will call isListEmpty() method  on the list which will return whether the list is empty or not and display it
             */

            while (quitted == true) {
    	    System.out.println("Enter one of the following commands: ");
            System.out.println("display             - display the current list"); 
            System.out.println("add                 - add a node to the list");
            System.out.println("delete              - delete the end node from the list");
            System.out.println("empty               - check if the list is empty");
            System.out.println("enter any other command to quit");
            
            Scanner console = new Scanner(System.in); // create scanner objects for user input where input will be "display, add, delete, empty"
            Scanner console2 = new Scanner(System.in); // create scanner objec for user input where input will be 'room' and the number
            Scanner console3 = new Scanner(System.in); // create scanner object  for user input where input will be the date
            Scanner console4 = new Scanner(System.in); // create scanner object for user input where input will be first and last name
            String userInput = console.next();

            if (userInput.contains("display")) { // if user entered "display", this condition is satisfied
            	System.out.println("");
            	l.displayAll(); // call the displayAll method on the List l
            } else if (userInput.contains("add")) { // if user entered "add", this condition is satisfied

                System.out.println("");

            	System.out.println("Please enter 'Room' and the number of the room");
            	location = console2.nextLine(); // ask the user to enter the room number

            	System.out.println("");

            	System.out.println("Please enter the date in the following format: dd-mm-yyyy hh:mmAM/PM");
                date = console3.nextLine(); // ask the user to enter the date

                System.out.println("");

                System.out.println("Please enter the first and last name of the person you are meeting");
                person = console4.nextLine(); // ask the user to enter the person name

                if (head == null) { // if the list is currently empty, this condition is satisfied
                    n = new Node(location, date, person); // data is based on user input
                    l.addOneNodeBeforeHead(n); // call the addOneNodeBeforeHead(<node>) method which will add the Node as head of the list (first)
                } else { // if the list is not currently empty, this condition is satisfied
                n = new Node(location, date, person, n); // data is based on user input, and n as parameter means it will be connected the latest node in the list
                l.addOneNode(l.head, n); // call the addOneNode(<link to head>, <link to next node>) method which will add the Node after the head of the list (second)
                }
            
            } else if (userInput.contains("delete")) { // if user entered "delete", this condition is satisfied
                System.out.println("");
            	l.removeOneNode(n); // call removeOneNode(<node>) method which will remove the node n

            } else if (userInput.contains("empty")) { // if user entered "empty", this condition is satisfied
            	System.out.println("");
            	boolean empty = l.isListEmpty(); // declare new boolean variable as isListEmpty() function will be returning either true or false
                System.out.println("Is list empty? " + empty); // if list is empty, true is returned. If list is not empty, false is returned
                System.out.println("");
            
            } else { // if anything else is entered other than available commands above, this condition is satisfied
            	quitted = false; // set boolean to false so while loop no longer 
            	System.out.println("Invalid command. Please restart and try again.");
            	System.exit(0); // quit the program
            }
        }
        }

// Set HEAD to n and whilst HEAD (n) is not empty, print out each item in the list
    public void displayAll() {
        Node n = head; // set Node n to the head of the list
        while (n != null) { // as long as the list is not empty, this condition is satisfied
            System.out.println("Meeting in " + n.location + " with " + n.person + " on " + n.date); // print each field of each node in the list
            n = n.next; // move onto the next item in the list
        }
        System.out.println("");
    }

// check if head is null, if head is null that means the list is empty and return true
    public boolean isListEmpty() {
        if (head == null) {
            return true; // return true if head is null, which means list is empty
        } else {
            return false; // otherwise return false (not empty)
        }
    }

// when this method is called, a new node (not head) is added into the list
    public void addOneNode(Node p, Node newNode) {
        newNode.next = p.next; // set the pointer of newNode to the pointer of p
        p.next = newNode; // set the pointer of p to the newNode
        System.out.println("");
    }

// when this method is called, a new node is added as the head of the list 
    public void addOneNodeBeforeHead(Node newNode) {
    	newNode.next = head; // set the pointer of newNode to head
    	head = newNode; // set head to the newNode
    }

// when this method is called, the latest node is deleted from the list    
    public void removeOneNode(Node p) {
        Node n = head; // set Node n to the head of the list
    	int length = nodeNum(p); // call the recursive nodeNum method to see how many nodes there are currently in the list

    	if (length == 1) { // if there are currently one node in the list, this condition is satisfied
    		head = null; // set head to null 
    		System.out.println("The list is now empty. Please add nodes before deleting again");
    	} else { // if there is more than one node in the list, this condition is satisfied
    		p.next = p.next.next; // skip a node (remove) and link it to the next node in the list
    		System.out.println("You have successfully deleted the end node");
    	}
    	System.out.println("");
    }

    public int nodeNum(Node n) {
    	if (n == null) { // if the list is empty, this condition is satisfied
    		return(0); // return 0 (empty)
    	} else { // if the list is not empty, this condition is satisfied

    		/*
    	    The following line is recursive and it calls itself over and over
    	    It begins with the first element in the list and returns 1
    	    if there is a node. Then the function calls itself once again
    	    but this time moves onto the next element in the list.
    	    This process is continued until it reaches the end of the list.
    	    */
    		
    		return (1 + nodeNum(n.next)); // n.next moves onto the next element in the list
    	}
    }
}
