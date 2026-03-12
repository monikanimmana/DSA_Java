package BasicCodes;
import java.util.*;

public class PrimeNumber {
    int count=0;
    void prime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                count ++;
                break;
            }
            
        }
        if(count==0){
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("It is not a prime number. ");
        }
    }
    
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter a number: ");
            int n=sc.nextInt();
            PrimeNumber obj=new PrimeNumber();
            obj.prime(n);
        }
    }
}
