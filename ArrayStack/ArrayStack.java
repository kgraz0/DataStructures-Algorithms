class ArrayStack {
	
	public Object[] array;
	private int count;
	public static final int max = 100;

	public ArrayStack() {
		array = new Object[max]; // create an array with maximum of 100 Object elements
		count = 0; // initialize count to 0
	}

    /* return the last added element */
	public Object top() {
    return array[count-1];
    }

    /* remove the last added element */
	public void pop() {
        if (!isEmpty()) {
        count--;
        } else {
        	System.out.println("The stack is currently empty. There is nothing to remove.");
        }
	}

    /* add an element to the stack */
	public void push(Object obj) {
    if (count < max) { // check whether the stack is not already full, to not cause arrayoutofbounds exception
    array[count] = obj; // set the next index with that value
    count++; // increase count by one to move to next index
    } else {
    	System.out.println("The stack is already full! Please pop before pushing.");
    }
	}

    /* return the current size of the stack (num. of elements) */
	public int size() {
		return count;
	}

    /* return whether the stack is currently empty (true) or not (false) */
	public boolean isEmpty() {
		return (count == 0); // if it's empty, return true
	}
}