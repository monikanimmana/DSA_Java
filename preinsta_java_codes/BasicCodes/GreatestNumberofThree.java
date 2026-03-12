package BasicCodes;

import java.util.Scanner;

public class GreatestNumberofThree {
    int greaternumber(int num1,int num2,int num3){
        if(num1==num2 && num1==num3){
            return num1;
        }
        else if(num1>num2 && num1>num3){
           return num1;
        }
        else if(num2>num2 && num2>num3){
            return num2;
        }
        else{
            return num3;
        }

    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        System.out.print("Enter first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter second number: ");
        int num2=sc.nextInt();
        System.out.print("Enter third number: ");
        int num3=sc.nextInt(); 
        GreatestNumberofThree obj=new GreatestNumberofThree();
        System.out.println("The Greatest Number between "+ num1 +" , "+ num2+ " and " + num3+ " is "+ (obj.greaternumber(num1, num2,num3)));  

        }
    }

}
