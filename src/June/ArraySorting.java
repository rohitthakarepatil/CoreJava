package June;

import java.util.Arrays;
import java.util.Collections;

public class ArraySorting {

    public static void main(String[] args) {
        Integer [] arr = {15,2,73,4,65};

        Arrays.sort(arr);

        System.out.println("ascending" + Arrays.toString(arr));


        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println("descending" + Arrays.toString(arr));
    }
}
