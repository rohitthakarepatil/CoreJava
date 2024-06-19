package June;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String str = "hello world";
      //  System.out.println(str.trim());
      String removed =  str.replaceAll("\\s","");
        System.out.println(str);
        System.out.println(removed);
    }

}
