package June;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,6,7};


        Set uniqueEles = new HashSet();

        Set dupliEles = new HashSet();

        for (int num : arr){
            if(!uniqueEles.add(num)){
                dupliEles.add(num);
            }
        }
        System.out.println(uniqueEles);
        System.out.println(dupliEles);
    }
}
