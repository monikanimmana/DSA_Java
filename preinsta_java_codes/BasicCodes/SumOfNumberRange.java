package BasicCodes;
import java.util.Scanner;

public class SumOfNumberRange {
    void sumofrange(int num1,int num2){
        int sum=0;
        if(num1>=0 && num2>=0){
            for(int i=num1;i<=num2;i++){
                sum += i;
            }
            System.out.println("Sum of numbers in range: " + sum);
        }
        else{
            System.out.println("Enter valid number.");
        }
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        System.out.print("Enter first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter second number: ");
        int num2=sc.nextInt();
        SumOfNumberRange obj=new SumOfNumberRange();
        obj.sumofrange(num1, num2);
        }
    }
}
