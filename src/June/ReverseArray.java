package June;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int [5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        for( int a : arr){
            System.out.println(a);
        }
        for(int i = arr.length -1; i >=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
