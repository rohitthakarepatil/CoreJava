package June;

public class StarPatternsRightTriangle {
    public static void main(String[] args) {
        System.out.println("hello world");

        int rows, column, noOfRows = 5;
        for(rows = 0; rows <=noOfRows; rows++){
            for(column = 0; column <=rows; column++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
