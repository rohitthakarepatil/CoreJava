package June;



public class CharArrayToString {
    public static void main(String[] args) {
        char[] charArray = {'h','e','l','l','o'};
//        String str = charArray.toString();
//        System.out.println(str);
        String str = new String (charArray);
        System.out.println(str);
    }
}
