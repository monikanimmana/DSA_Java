package BasicCodes;

import java.util.Scanner;

public class SumOfNumbers{

    void sumofnumbers(int n){
        int sum=0;

        if(n>=0){
            for(int i=0;i<=n;i++){
                sum += i;

            }
            System.out.println("Sum of N numbers: " + sum);
        }
        else{
            System.out.println("Enter valid number.");
        }
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter a number: ");
            int n=sc.nextInt();
            SumOfNumbers obj=new SumOfNumbers();
            obj.sumofnumbers(n);
        }
    }
}