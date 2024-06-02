package June;

import java.util.Arrays;

public class QA_001 {
    /*
     difference between println and print
     println will print the string and move to the next line
     print will print the string and stay in the same line
     */

    /*
    JVM look for main method to start the execution
    JVM will look for System.out.println() to print the output
    JVM -> load the class -> execute the main method --> execute the statement line by line.
     */

    public static void main(String[] args) {
        System.out.println("Hello World\n");
        System.out.print("Hello Rohit");
        System.out.println("args = " + Arrays.toString(args));
        System.out.println("HelloWorld.main");
        System.out.println("Hello world");
        System.out.println(2+2);
    }
}
