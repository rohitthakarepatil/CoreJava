package June;

public class CountCharacters {
    public static void main(String[] args) {
        String str = "Hello world";
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) != ' ')
           count++;
        }
        System.out.println(" Number of characters in String " + count);
    }
}
