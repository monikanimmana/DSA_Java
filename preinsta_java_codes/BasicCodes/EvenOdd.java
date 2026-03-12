package BasicCodes;

import java.util.Scanner;

public class EvenOdd {
    String evenodd(int n){
        if(n<=0){
            return "Enter valid number";
        }
        else{
            return (n%2==0)? "Number is even":"Number is odd";
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number: ");
            int n=sc.nextInt();
            EvenOdd obj=new EvenOdd();
            System.out.println(obj.evenodd(n));
        }
    }
}
