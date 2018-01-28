class Queue {

	int size, front, rear, max = 10;
	int queueArray[];

	queueArray = new Object[max]; // create an array for storage

	public void initialise() {
		size = 0; // set the size to 0 (empty)
		front = 1;
		rear = 0;
	}

	public boolean isEmpty() {
		return (size == 0); // return whether the queue is currently empty
	}

	public boolean isFull() {
		return (size == max); // return whether the queue is already full
	}

	public void enqueue(Object x) {
		if (size < max) {
			size++; // increase size by one because we will add an element
			rear = (rear % max) + 1; // add one to rear as an element was added
			queueArray[rear] = x; // set the rear value (last index in array) to the value given
		}
	} 

	public void dequeue(Object x) {
		if (size > 0) { // check whether it is not empty already
			size--; // decrease size by one as we will be removing an element
			x = queueArray[front]; 
			front = (front % max) + 1; // add one to the front because an element was removed (move to next element)
		}
	}
}