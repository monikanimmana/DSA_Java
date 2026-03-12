package BasicCodes;
public class Factorial_Number {
    void factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact *= i;

        }
        System.out.println(fact);
    }

    public static void main(String [] args){
        Factorial_Number obj=new Factorial_Number();
        obj.factorial(3);
    }
    
}
