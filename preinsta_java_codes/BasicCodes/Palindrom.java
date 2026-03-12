package BasicCodes;

import java.util.Scanner;

public class Palindrom {
    
        void palindrom(int n){
             int temp = n;
                int rev=0;

            if(n<0){
                System.out.println("Enter positive number.");
            }
            else{
                while(temp!=0){
                    int r = temp%10;
                    rev = (rev * 10) + r;
                    temp= temp/10;
                }

            }

            if ( n == rev){
                System.out.println(n + " is a palindrom number.");
            }else{
                System.out.println(n + " is not a palindrom number.");
            }

            
        }
        public static void main(String[] args) {
            try(Scanner sc=new Scanner(System.in)){
                int n=sc.nextInt();
                Palindrom obj=new Palindrom();
                obj.palindrom(n);
        }
    }
}
