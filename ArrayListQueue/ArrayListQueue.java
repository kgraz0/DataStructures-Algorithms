import java.util.*;

class ArrayListQueue {
	
	private ArrayList arrayList; // declare the arrayList
	private int front, back; // declare the front and back variables
	public static final int max = 100; // set max to 100

	public ArrayListQueue() {
		arrayList = new ArrayList(max); // set arrayList to initial capacity of 100
		front = 0; // set front to 0
		back = 0; // set back to 0
	}

	/* check the first element of the queue */	
	public Object head() {
		if (isEmpty()) { // check whether the queue is empty
			System.out.println("The queue is empty.");
		}
		return arrayList.get(front); // return the first element of the queue
    }

    /* check the end element of the queue */
	public Object tail() {
		return arrayList.get(back-1); // return the last element of the queue

	}

    /* remove the first element from the queue */
	public void leave() {
		if (isEmpty()) { // check whether the queue is empty
			System.out.println("There is nothing to remove!");
		} else {
			arrayList.remove(front); // remove the first element from the queue
			back--; // decrease back by one because the first element was removed
		}

	}

    /* add an element to the queue */
	public void join(Object obj) {
		arrayList.add(back, obj); // add the element to the back of the queue 
		back++; // increase back by one since a new element was added
	}
	
	/* check whether the queue is empty */
	public boolean isEmpty() {
		return arrayList.size() == 0; // check whether the queue is empty
       
	}

    /* check the amount of elements in the queue */
	public int size() {
		return arrayList.size(); // check the amount of elements in the queue
	}

	public void printQueue() {
		String theQueue = "";

		for (int i = 0; i < back; i++) {
			theQueue = theQueue + arrayList.get(i).toString() + " "; // add each array index value to the string to form a String of elements currently in the array
		}
		System.out.println(theQueue + "\n"); // print the queue
	}
}