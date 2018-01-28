public class Node {
    public String location, date, person; // data
    public Node next; // pointer
    
// Constructor for the final node in the list
public Node(String newLocation, String newDate, String newPerson) {
    location = newLocation;
    date = newDate;
    person = newPerson;
    next = null; // set pointer to null
} 

// Constructor for any other nodes other than final in the list
public Node(String newLocation, String newDate, String newPerson, Node nextNode) {
    location = newLocation;
    date = newDate;
    person = newPerson;
    next = nextNode; // set pointer to the next Node in the list
}

}
