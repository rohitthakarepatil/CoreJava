package June;

public class StringAlternateChar {
    public static void main(String[] args) {
        String str = "sagar";
        String alt= "";
        for (int i = 1; i <str.length(); i+=2){
           alt = alt +  str.charAt(i);
        }
        System.out.println(alt);
    }
}
