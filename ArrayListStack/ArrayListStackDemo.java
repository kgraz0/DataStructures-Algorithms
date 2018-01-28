class ArrayListStackDemo {
	
	public static void main(String args[]) throws InterruptedException {

	ArrayListStack als = new ArrayListStack();

	System.out.println("Num. of elements: " + als.size());
	System.out.println("Is the stack empty? " + als.isEmpty() + "\n");
    Thread.sleep(2000);

    System.out.println("Adding 10 and 50...");
    als.push(10);
    als.push(50);
    Thread.sleep(2000);

    System.out.println("Element at the top: " + als.top());
    System.out.println("Is stack empty? " + als.isEmpty());
    System.out.println("Num. of elements: " + als.size() + "\n");
    Thread.sleep(2000);

    System.out.println("Removing the top element from the stack...");
    als.pop();
    Thread.sleep(2000);

    System.out.println("Element at the top: " + als.top());
    System.out.println("Num. of elements: " + als.size() + "\n");
    Thread.sleep(2000);

    System.out.println("Adding 200 and 300...");
    als.push(200);
    als.push(300);
    Thread.sleep(2000);

    System.out.println("Num. of elements: " + als.size());
    System.out.println("Is stack empty? " + als.isEmpty() + "\n");
    Thread.sleep(2000);

    System.out.println("Removing the top element from the stack...");
    als.pop();
    Thread.sleep(2000);

    System.out.println("Element at the top: " + als.top());
    System.out.println("Is stack empty? " + als.isEmpty());
    System.out.println("Num. of elements: " + als.size());
	}
}