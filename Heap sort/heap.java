import java.util.Arrays;

class Heap {

	public Node[] heapArray; // declare the array 
	public int maxSize;

	public Heap(int newmaxSize) {
		maxSize = newmaxSize;
		heapArray = new Node[maxSize];
	}

	public void insert(int index, Node newData) {
		heapArray[index] = newData;
	}

    /*
    Fill the array with required values
    */
    public void fillArray() {
			insert(0, new Node(12));
			insert(1, new Node(8));
			insert(2, new Node(15));
			insert(3, new Node(5));
			insert(4, new Node(6));
			insert(5, new Node(14));
			insert(6, new Node(1));
			insert(7, new Node(10));
	}

	public void heapSort(int index, int maxNumber) {
		int largest;
		Node root = heapArray[index];

        /*
        As long as the index parameter is less than the maximum number of elements in array divided by 2,
        this while loop is active. 
        */
		while (index < maxNumber / 2) {
			int leftChild = 2 * index + 1; // initialize leftChild
			int rightChild = leftChild + 1; // initialize rightChild

            /* 
            1. Check whether the value of the right child is less than the maximum number
            of elements in the array AND whether the value of leftChild element is less than
            the value of rightChild element
            2. If it is true, set the largest child to the value of rightChild

            3. If it's not true, set the largest child to the value of left child 

            After if statement is completed, move the index value in the largest child index
            
            4. If the value in the root is greater or equals to the value of largest child,
            break out of the while loop and set the root value to the array index 
            */
			if (rightChild < maxNumber && heapArray[leftChild].data < heapArray[rightChild].data) {
				largest = rightChild;
			} else {
				largest = leftChild;
			}

			if (root.data >= heapArray[largest].data) {
				break;
			}

			System.out.println("Moving value " + heapArray[largest] + " to Index " + index);
			heapArray[index] = heapArray[largest];
			index = largest;
		}
		heapArray[index] = root;
	}
}