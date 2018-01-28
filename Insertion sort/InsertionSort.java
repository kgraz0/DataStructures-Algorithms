public class InsertionSort {

    public static void main(String[] args) {
        int array[] = {2, 0, 5, 3, 9, 7, 5, 10, 3};
        
        for (int i = 0; i <= array.length-1; i++) {
        System.out.print(" " + array[i]);
        }
        System.out.println("\n");
        
        for (int i = 1; i <= array.length-1; i++) {
            int current = array[i];
            int position = i-1;
        
        while (position >= 0 && current < array[position]) {
            array[position+1] = array[position];
            position = position-1;
        }
        array[position+1] = current;
        }
        for (int i = 0; i <= array.length-1; i++) {
        System.out.print(" " +array[i]);
        }
    } 
}
