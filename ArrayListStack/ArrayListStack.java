import java.util.*;

class ArrayListStack {
	
	private ArrayList arrayList; // declare the arrayList
	private int count; // declare the count variable
	public static final int max = 100; // declare max and set it to 100

	public ArrayListStack() {
		arrayList = new ArrayList(max); // create a new arrayList with initial size of 100 elements 
		count = 0; // set count to 0
	}

	
	/* return the last added element */
	public Object top() {
		return arrayList.get(count-1); // get the count-1 position arrayList element value
    }

    /* remove the last added element */
	public void pop() {
		if (!isEmpty()) { // check if the arrayList is not already empty
			arrayList.remove(count-1); // remove the count-1 index value from the array
			count--; // decrease count by one since now the element is removed
		} else { // if the arrayList is indeed empty, this is true
			System.out.println("The stack is currently empty. There is nothing to remove.");
		}
	}

    /* add an element to the stack */
	public void push(Object obj) {
		if (count < max) { // check whether the amount of elements doesn't exceed the maximum number of elements
			arrayList.add(obj); // add the value to the arrayList
			count++; // increase count by one as there's a new value added
		} else { // if the arrayList is already full this is true
			System.out.println("The stack is already full! Please pop before pushing.");
		}
	}

    /* return the size of the stack (num. of elements) */
	public int size() {
		return count; // return the number of elements in the arrayList
	}
	
	/* check whether the stack is empty (true) or not (false) */
	public boolean isEmpty() {
        return (count == 0); // if the number of elements in the arrayList is 0, return true
	}	
}