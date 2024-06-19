package June;

public class MaximumNumbers {

    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 40, max;

        // Compares num1 with num2, assigns max of num1 and num3 if num1>num2, else assigns max of num2 and num3
       // max = (num1>num2)?(num1>num3?num1:num3):(num2>num3?num2:num3);

        max= (num1>num2)?(num1>num3?num1:num3):(num2>num3?num2:num3);
        System.out.println("maximum number is " + max);
    //    System.out.println(Math.max(num1,num2));  // only for 2 numbers
    }
}
