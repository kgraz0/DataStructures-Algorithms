class ArrayListQueueDemo {
	
	public static void main(String args[]) throws InterruptedException {

	ArrayListQueue alq = new ArrayListQueue();

	System.out.println("Num. of elements: " + alq.size());
	System.out.println("Is the queue empty?: " + alq.isEmpty() + "\n");
	Thread.sleep(2000);

    System.out.println("Adding 5 and 10 to the queue...");
	alq.join(5);
	alq.join(10);
	Thread.sleep(2000);

    System.out.print("Current queue: ");
	alq.printQueue();
    Thread.sleep(2000);

    System.out.println("Removing the first element from the queue...");
    alq.leave();
    Thread.sleep(2000);
    System.out.print("Current queue: ");
	alq.printQueue();
    Thread.sleep(2000);

    System.out.println("Adding 50 to the queue...");
    alq.join(50);
    Thread.sleep(2000);
    System.out.print("Current queue: ");
    alq.printQueue();
    Thread.sleep(2000);

    System.out.println("The head of the queue is " + alq.head() + " and the tail is " + alq.tail() + "\n");
    Thread.sleep(2000);
 
    System.out.println("Removing the two elements from the queue...");
    alq.leave();
    alq.leave();
    Thread.sleep(2000);
    System.out.println("Num. of elements: " + alq.size());
	System.out.println("Is the queue empty?: " + alq.isEmpty() + "\n");
	}
}