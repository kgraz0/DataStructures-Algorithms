class ArrayQueue {
	
	private int front, back; // declare the front and back variables
	private Object[] array; // declare the array
	public static final int max = 100; // initialize max to 100, this will be used for the amount of elements in the array

    /* Upon the call to the constructor, initialize front and back to 0, and set the number of elements in array to max (100)*/
	public ArrayQueue() {
		front = 0; // initialize front to 0
		back = 0; // initialize back to 0
		array = new Object[max];
	}
    
    /* check the first element of the queue */
	public Object head() {
		if (isEmpty()) { // check whether the queue is empty
			System.out.println("The queue is empty.");
		}
		return array[front]; // return the value of front variable
	}

    /* check the last element of the queue */
	public Object tail() { 
        return array[back-1]; // return the tail element value of the queue
	}
	

    /* Remove the first element from the queue */
	public void leave() {
		if (isEmpty()) { // check whether the queue is empty
			System.out.println("There is nothing to remove!");
		} else {
			back--;
			for (int i = 0; i < back; i++) { // shift all of the elements in the array left one position
				array[i] = array[i+1]; 
			}
            array[back] = null; // set the original value of the back which was now moved to the left to null
		}
    }
	

    /* Add an element into the queue*/
	public void join(Object obj) {
    array[back] = obj; // set the index position to the given value
    back++; // increase back by one since a new element is added
	}
    
    /* check whether the queue is currently empty */
	public boolean isEmpty() {
		return array[0] == null; // check whether the first value of the array is null, which means the array is empty
	}

    /* check how many elements the queue contains */
	public int size() {
        return array.length; // return the length of the array
	}
	
	public void printQueue() {
		String theQueue = "";

		for (int i = 0; i < back; i++) {
			theQueue = theQueue + array[i].toString() + " "; // add each array index value to the string to form a String of elements currently in the array
		}
		System.out.println(theQueue + "\n"); // print the queue
	}
	}
