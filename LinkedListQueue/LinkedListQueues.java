class LinkedListQueues {
	
	public Node front, rear;

	public LinkedListQueues() {
		front = null;
		rear = null;
	}

boolean isEmpty() { // check if it's empty. Return true if empty
    return front == null;
}

void enqueue(String input) { // method to push (add) an element 
	Node newNode = new Node(input, null);

	if (rear == null) {
		front = newNode;
		rear = newNode;
	} else {
		rear.setNext(newNode);
		rear = rear.getNext();
	}
}

Object dequeue() { // method to pop (remove) an element 
    Node n = front;
    front = n.getNext();
    return n.getItem();
}
}