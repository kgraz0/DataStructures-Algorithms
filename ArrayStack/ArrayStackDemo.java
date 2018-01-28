class ArrayStackDemo {
	
	public static void main(String args[]) {

	ArrayStack as = new ArrayStack();

        System.out.println("Num. of elements: " + as.size());
	System.out.println("Is the stack empty? " + as.isEmpty());

	System.out.println("Adding 10 and 50");
        as.push(10);
	as.push(50);

        System.out.println("Element at the top: " + as.top());
        System.out.println("Is stack empty? " + as.isEmpty());
        System.out.println("Num. of elements: " + as.size());

        System.out.println("Removing the top element from the stack");
        as.pop();

        System.out.println("Element at the top: " + as.top());
        System.out.println("Num. of elements: " + as.size());

        System.out.println("Adding 200 and 300");
        as.push(200);
        as.push(300);


        System.out.println("Num. of elements: " + as.size());
        System.out.println("Is stack empty? " + as.isEmpty());

        System.out.println("Removing the two top elements from the stack");
        as.pop();
        as.pop();

        System.out.println("Element at the top: " + as.top());
        System.out.println("Is stack empty? " + as.isEmpty());
        System.out.println("Num. of elements: " + as.size());

        System.out.println("Removing the top element from the stack");
        as.pop();

        System.out.println("Is stack empty? " + as.isEmpty());
        System.out.println("Num. of elements: " + as.size());
	
        }
}