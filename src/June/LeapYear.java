package June;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2019;

        if((year % 4 ==0) || (year % 400 == 0)){
            System.out.println(year + " is a leap year ");
        }
        else {
            System.out.println("not an leap year");
        }
    }
}
