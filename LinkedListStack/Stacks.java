import java.util.Stack; // import Stack
import java.util.Scanner; // import Scanner for user input

public class Stacks {

    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in); // create a Scanner object
        LinkedListStack linkedStack = new LinkedListStack();
        //Stack<String> stack = new Stack<>(); // create a new stack object which will contain Strings
        
        System.out.println("Please enter a String, then press ENTER and enter another String.");
        System.out.println("Enter as many strings as you like. To end, type 'end-of-input'.");
        
        String userInput = console.nextLine(); // ask user to enter the first input
        linkedStack.push(userInput); // push the entered input into the stack
        
        while (!userInput.contains("end-of-input")) { // as long as the entered string is not "end-of-input", this condition is satisfied
            userInput = console.nextLine(); // ask user to enter another string  
            linkedStack.push(userInput); // push that entered string into the top of the stack
        }
        
        linkedStack.pop(); // once the user entered "end-of-input", remove that from the top of the stack so it's not included in the output
        
        if (linkedStack.isEmpty()) {
            System.out.println("The stack is empty. Please enter at least one String.");
        }

        while (!linkedStack.isEmpty()) { // as long as the stack is not empty, remove each element and print out from the top of the stack
            System.out.println(linkedStack.pop());
        }
    }
    } 