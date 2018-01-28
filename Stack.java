class Stacks {

// implementation by an array
	Object top;
	int size = 0;
	int max = 10;
	Object stackArray[]; 

	stackArray[] = new Object[max];

	public void initialise() {
		top = 0; // set the top to 0 (first element of the array)
	}

	public boolean isEmpty() {
		return (size == 0); // return true or false on whether the size is 0
	}

	public boolean isFull() {
		return (size == max); // return true or false depending on whether the array reached maximum capacity
	}

	public void push(Object x) {
		if (stackArray != isFull()) { // if the array is not full, this is active
			top = top + 1; // add one to top
			stackArray[top] = x; // store the value at the index position of 'top'
		}
	}

	public void pop(Object x) {
		if (stackArray != isEmpty()) { // check whether the array is not empty
			x = stackArray[top]; // 
			top = top - 1; // decrease the index value (top) by one
		}
	} 
}