package BasicCodes;
import java.util.Scanner;
public class Digits_Print {
    public static void main(String [] args){

        try(Scanner scr = new Scanner(System.in))
        {
            int n = scr.nextInt();
            int temp=n;
            int nod=0;
            while(temp!=0){
                temp=temp/10;
                nod++;
            }
            int div=(int)Math.pow(10,nod-1);
            int q=n/div;
            System.out.println(q);
            n=n%div;
            div=div/10;
            

        }

    }
}
    

