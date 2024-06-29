package June;

public class arrayProgram {
    public static void main(String[] args) {
//        Input:[1, 1, 1, 1, 1, 2,3, 2, 3,2, 3, 3, 4, 4, 4, 4, 4,1,4]
//        output:[1,4]

        int[] arr = {1, 1, 1, 1, 1, 2,3, 2, 3,2, 3, 3, 4, 4, 4, 4, 4,1,4};

        int min = arr[0];
        int max = arr [0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }else{
                max=arr[i];
            }
        }
        System.out.println(min  + " , " + max);

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);

        Integer[] array = {1, 1, 1, 1, 1, 2,3, 2, 3,2, 3, 3, 4, 4, 4, 4, 4,1,4};
        for (int i = 0; i < array.length; i++) {

        }

    }
}
