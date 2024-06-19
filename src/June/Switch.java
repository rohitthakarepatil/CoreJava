package June;

public class Switch {
    public static void main(String[] args) {
        char ch =  'a';
       int val = switch (ch) {
           case 'a':
            yield 12;
           case 'b':
               yield 13;

           default:
               System.out.println("default");
               throw new IllegalStateException("Unexpected value");
        };
    }
}
