class ArrayQueueDemo {
	
	public static void main (String args[]) throws InterruptedException {

		ArrayQueue aq = new ArrayQueue();

        System.out.println("Adding 10 and 20 to the queue...");
        aq.join(10);
        aq.join(20);
        Thread.sleep(2000);

        System.out.print("Current queue: "); 
        aq.printQueue();
        Thread.sleep(2000);
		
        System.out.println("Removing the first element from the queue...");
		aq.leave();
		Thread.sleep(2000);

		System.out.print("Current queue: ");
        aq.printQueue();
        Thread.sleep(2000);

        System.out.println("Adding 30 and 50 to the queue...");
        aq.join(30);
        aq.join(50);
        Thread.sleep(2000);

        System.out.print("Current queue: ");
        aq.printQueue();
        Thread.sleep(2000);

        System.out.println("The head is " + aq.head() + " and the tail is " + aq.tail() + ".\n");
        Thread.sleep(2000);

        System.out.println("Removing the first element from the queue...");
        aq.leave();

        System.out.print("Current queue: ");
        aq.printQueue();
        Thread.sleep(2000);

        System.out.println("The head is " + aq.head() + " and the tail is " + aq.tail() + ".");
	}
	}