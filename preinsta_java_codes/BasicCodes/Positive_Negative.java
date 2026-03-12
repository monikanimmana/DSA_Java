package BasicCodes;

import java.util.Scanner;

public class Positive_Negative {
    
    void positive_negative(int n){

        if(n==0){
            System.out.println("Zero");
        }
        else{
            String result =(n>0)? "Number is positive":"Number is negative";
            System.out.println(result);
        }
    }
    public static void main(String[] args) {
        
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter number to check: ");
            int n=sc.nextInt();
            Positive_Negative obj=new Positive_Negative();
            obj.positive_negative(n);
        }
        
    }
}
