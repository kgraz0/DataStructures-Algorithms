import java.util.*;

class experimentCount {
    boolean foundFirstX(int x, int Y[]) {
        int count = 1;
        boolean found = false;
        count++;
        int i = 0;
        count++;
        while ((!found) && (i < Y.length)) {
            count++;
            found = (x == Y[i]);
            count++;
            i++;
            count++;
        }
        System.out.println("Execution steps: " + count);
        return found;
    }
}

public class Test {

    public static void main(String[] args) {
        experimentCount acount = new experimentCount();
        
        Random ran = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Which number do you wish to find?");
        int enterX = input.nextInt();
        
        System.out.println("How many elements do you want in the array?");
        int enterA = input.nextInt();
        
        System.out.println("Set the maximum number allowed as a single element");
        int highNum = input.nextInt();
        
        int A[] = {9, 4, 5, 7, 1, 2};
        int B[] = {2, 4, 5, 7, 1, 2};
        int C[] = new int[enterA];
        
       for (int i = 0; i < enterA; i++) {
            C[i] = ran.nextInt(highNum+1);
       }
       
        System.out.println(acount.foundFirstX(2, A));
        System.out.println();
        System.out.println(acount.foundFirstX(2, B));
        System.out.println();
        System.out.println(acount.foundFirstX(enterX, C));
    }
}
