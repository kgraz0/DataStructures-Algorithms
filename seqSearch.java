class SeqSearch {

	// create an array
	int location; // track the location within the array
	boolean isFound = false; // track whether the element has been found

	public boolean SeqSearch(List l, boolean found, element x, int location) {
		found = false; // set to false as element has not yet been found
		location = 0; // set the starting location of the array

		while (found == false && location < max) { // whilst the element has not been found and the location is within the array
			if (array[location] = x) { // if the index value equals to x, the element has been found 
				found = true; // set boolean to true (found)
				break;
			} else {
				location++; // move to the next location in the array
			}
			return found;
		}
	}

	public boolean SeqSearchll(LinkedList l, element x, boolean found, int location) {
		found = false;

		while (found == false && l != null) { // if the element has not been found yet and the list is not empty
			if (l.data = x) { // check whether the data in the node corresponds to x
				found = true; // the element was found, set to true
				location = l; // set the location to that node
			} else {
				l = l.next; // move to the next element in the linked list
			}
		}
		return found;
	}
}