class Node {

public Object data;
public Node next;

// define the end node
public Node(Object newData) {
	data = newData;
	next = null;
}

// define any node
public Node(Object newData, Node newNode) {
	data = newData;
	next = newNode;
}

// get the data
public Object getData() {
	return data;
}

// get the next node
public Node getNode() {
	return next;
}

// set the data
public void setData(Object newData) {
	data = newData;
}

// set the next node
public void setNode(Node newNode) {
	next = newNode;
}

public void initialise() {
	head = null; // set the head to null
}

public boolean isEmpty(Node newNode) {
	return (newNode == null); // check whether the head of the list is null
}

public void insertNodeAfter(Node nodeBefore, Node newNode) {
	newNode.next = nodeBefore.next; // link the pointer of new node to the node where node before was pointing
	nodeBefore.next = newNode; // point the pointer of the node before to the newly inserted node
}

public void insertNodeBefore(Node previous, Node nodeBefore, Node newNode) {
	newNode.next = nodeBefore; // point the pointer of new node to the node that was before
	previous.next = newNode; // point the node before newly inserted node to the newly inserted node
}

public void addNodeBeforeHead(Node newNode) {
	newNode.next = head; // point the pointer of the new node to the head of the list
	head = newNode; // the head of the list is now the new node
}

public void deleteNodeAfter(Node p) {
	p.next = p.next.next; // set the pointer of the node to the next next node to skip a node (delete)
}

public void constructListFront() {
	Scanner userInput = new Scanner(); // set up scanner
	int x = userInput.nextInt(); // ask user for a number
	Node p = new Node(x); // create a new node with that value

	while (x != 999) { // as long as the input is not 999, this is active
		addNodeBeforeHead(p); // add the node to the front of the list
		x = userInput.nextInt(); // ask user for another number
		p = new Node(x); // create another node based on user input
	}
}

public void constructListTail() {
	Scanner userInput = new Scanner(); // set up scanner
	int x = userInput.nextInt(); // ask user for a number
	Node p = new Node(x); // create a new node with that value
	Node t = tail(); // store the tail node

	while (x != 999) {
		insertNodeAfter(t, p); // add the new node that user entered after the tail
		t = t.next; // move the tail up because a new node was inserted
		int x = userInput.nextInt(); // ask user for another number
		Node p = new Node(x); // create another node based on user input
	}
}

public Node tail() {
	Node p = head; // set the node to the head of the list

	while (p.next != null) { // go through the list until the last node (pointer is set to null)
		p = p.next; // move to the next node
	}
	return p; // return the end node (tail)
}
}