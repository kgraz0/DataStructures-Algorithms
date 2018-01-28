class LinkedListStack {
	
	public Node top;

	public LinkedListStack() {
		top = null;
	}

boolean isEmpty() { // check if it's empty. Return true if empty
    return top == null;
}

void push(String input) { // method to push (add) an element 
	Node newNode = new Node(input, null);

	if (top == null) {
		top = newNode;
	} else {
		newNode.setNext(top);
		top = newNode;
	}
}

Object pop() { // method to pop (remove) an element 
    Node n = top;
    top = n.getNext();
    return n.getItem();
}
}