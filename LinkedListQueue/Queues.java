import java.util.Queue; // import Queue
import java.util.Scanner; // import Scanner for user input
import java.util.LinkedList; // import LinkedList for String storage

public class Queues {

    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in); // create a new Scanner object
        LinkedListQueues linkedQueue = new LinkedListQueues(); // create a new LinkedList object which will contain Strings
        
        System.out.println("Please enter a String, then press ENTER and enter another String.");
        System.out.println("Enter as many strings as you like. To end, type 'end-of-input'.");
        
        String userInput = console.nextLine(); // ask user to enter the first input
        linkedQueue.enqueue(userInput); // add the entered input into the queue (linked list)
        
        if (userInput.contains("end-of-input")) { // if user only enters "end-of-input", then that means the queue is empty
            System.out.println("The queue is empty. Please enter at least one String.");
            System.exit(0); // exit the program
        }
        
        while (!userInput.contains("end-of-input")) { // as long as the entered string is not "end-of-input", this condition is satisfied
            userInput = console.nextLine(); // ask user to enter another string
            linkedQueue.enqueue(userInput); // push that entered string into the top of the stack
            }
        
        LinkedListQueues queueTwo = removeFinal(linkedQueue); // call removeFinal function on first queue and initialize returned value to queueTwo
        
        while (!queueTwo.isEmpty()) { // as long as the queue is not empty, remove and print out each element
            System.out.println(queueTwo.dequeue());
            }
        }
    
    static LinkedListQueues removeFinal(LinkedListQueues a) {
        LinkedListQueues queue2 = new LinkedListQueues(); // create a new LinkedList object
        
        while(!a.isEmpty()) { // as long as the queue is not empty, this condition is satisfied 
        Object item = a.dequeue(); // initialize item variable to remove method
        if (!a.isEmpty()) {
        queue2.enqueue(item.toString()); // add the item to the second queue
        }
        }
        return queue2; // return the second queue (without the last element)
    }
    }
   

