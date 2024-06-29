package June;

public class DescendingTriangle {
    public static void main(String[] args) {
        System.out.println("hello world");

        int rows, column, noOfRows = 5;
        for(rows = noOfRows; rows>=0; rows--){
            for(column =0; column<rows; column++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
