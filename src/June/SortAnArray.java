package June;

import java.util.Collections;

public class SortAnArray {
    public static void main(String[] args) {
        int[] arr = new int [5];
        arr[0] = 1;
        arr[1] = 25;
        arr[2] = 34;
        arr[3] = 40;
        arr[4] = 5;

        int max = arr[0];
        for (int i = 0; i < arr.length-1; i ++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("maximum number is " + max);

    }
}
