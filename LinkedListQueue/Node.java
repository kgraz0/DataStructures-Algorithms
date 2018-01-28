// Node constructor
public class Node {
    public Object item; // data
    public Node next; // pointer
    
// Constructor for the final node in the list
public Node(Object newItem) {
    item = newItem;
    next = null; // set pointer to null
}

// Constructor for any of the nodes (not final) in the list
public Node(Object newItem, Node nextNode) {
    item = newItem;
    next = nextNode; // set pointer to the next Node in the list
}

public void setNext(Node nextNode) { // set the next field (pointer)
    next = nextNode;
}

public void setItem(String newItem) { // set the data field
       item = newItem;
}

public Object getItem() { // get the item field
    return item;
}

public Node getNext() { // get the next field (pointer)
    return next;
}
}