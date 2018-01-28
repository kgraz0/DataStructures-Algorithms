import java.util.Arrays;

class heapTest {
	
	public static void main(String[] args) {
		int maxNumber = 8;

		Heap h = new Heap(8); // create a new Heap object, and set maximum size of array to 6
		h.fillArray(); // fill array with numbers up to 50

        System.out.println("\n" + "Array before Heap Sort");
		System.out.println(Arrays.toString(h.heapArray) + "\n"); // print the array before sort

		for (int i = h.maxSize / 2 - 1; i >= 0; i--) {
			h.heapSort(i, maxNumber);
		}

		System.out.println("\n" + "Array after Heap Sort");
		System.out.println(Arrays.toString(h.heapArray)); // print the array after sort
	}
}