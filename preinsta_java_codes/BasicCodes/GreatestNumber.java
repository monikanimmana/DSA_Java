package BasicCodes;
import java.util.*;

public class GreatestNumber {
    int greaternumber(int num1,int num2){
        if(num1==num2){
            return num1;
        }
        else if(num1>num2){
           return num1;
        }
        else{
            return num2;
        }

    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        System.out.print("Enter first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter second number: ");
        int num2=sc.nextInt(); 
        GreatestNumber obj=new GreatestNumber();
        System.out.println("The Greatest Number between "+ num1 +" and " + num2+ " is "+ (obj.greaternumber(num1, num2)));  

        }
    }
}
