package BasicCodes;
import java.util.*;

public class LeapYear {
    String leapyear(int n){
        if(n>=0){
            if(n%4==0 && n%100!=0){
                return " is a Leap Year";
            }
            else if(n%400==0){
                return " is a leap year";
            }
            else{
                return " not a  Leap year";
            }
        }
        else{
            return " Enter valid year";
        }
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter a year : ");
            int n= sc.nextInt();
            LeapYear obj=new LeapYear();
            System.out.println(n + (obj.leapyear(n)));

        }
    }
}
