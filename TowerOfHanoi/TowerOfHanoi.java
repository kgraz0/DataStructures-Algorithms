import java.util.Scanner; // import Scanner for user input

// a) name of the program is TowerOfHanoi
public class TowerOfHanoi {

    public static void main(String[] args) {        
        Scanner console = new Scanner(System.in); // create scanner object for user input
        
        System.out.println("Please enter the number of disks");
        int numOfDisks = console.nextInt(); // ask the user to enter the number of disks, and store it in numOfDisks variable
        
        System.out.println("Please enter the start peg name");
        char startPeg = console.next().charAt(0); // ask user to enter name of starting peg, but choose the first character of the string as the name
        
        System.out.println("Please enter the spare peg name");
        char sparePeg = console.next().charAt(0); // ask user to enter name of spare peg, but choose the first character of the string as the name
        
        System.out.println("Please enter the last peg name");
        char lastPeg = console.next().charAt(0); // ask user to enter name of last peg, but choose the first character of the string as the name
        
        // d) input is number of disks, startPeg, sparePeg and lastPeg which is entered by the user
        move(numOfDisks, startPeg, lastPeg, sparePeg); // call the move() function with the parameters of what the user entered
    }
    
    /* 
    c) This is a recursive program that is used to solve the Tower of Hanoi problem
       of moving any amount of disks from the starting peg to the final peg
       where the larger peg cannot be on top of a smaller peg and only a single
       disk is moved at one time.

       The program takes in number of disks (n), name of the start peg, name of spare peg
       and name of last peg and uses n - 1 disk solution to move the disks other than the nth
       disk to the spare peg, then move the nth disk to the last peg and repeat
       the same n - 1 disk solution to move the remaining disks from the spare peg
       to the last peg.
    */ 
    public static void move(int n, char startPeg, char lastPeg, char sparePeg) {
         
    if (n == 1) { // if there's only a single disk, move the disk from A to C
        System.out.println("Moving disk " + n + " from " + startPeg + " to " + lastPeg);
    } else if (n <= 0) { // if user entered 0 or below, it's an invalid number of disks
    	System.out.println("Invalid number of disks. Please enter either 1 or above.");
    } else { // if there's more than one disk, this condition is satisfied
        move(n - 1, startPeg, sparePeg, lastPeg); // use n-1 disk solution to move the disks from start to spare peg
        // e) output of the program is the printing of where each disk moves
        System.out.println("Moving disk " + n + " from " + startPeg + " to " + lastPeg); // move the remaining nth disk to the last peg
        move(n - 1, sparePeg, lastPeg, startPeg); // use n-1 disk solution to move the disks from spare to last peg
    }
}
}
