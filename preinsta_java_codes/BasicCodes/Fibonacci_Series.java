package BasicCodes;
public class Fibonacci_Series {
    void fibonacci(int n){
        int a=0;
        int b=1;
        int c=0;
        System.out.print("Fibonacci series: " );
        for(int i=0;i<=n;i++){
            c=a+b;
            a=b;
            b=c;

            
        }
        System.out.print(c);
    }

    public static void main(String [] args){

        Fibonacci_Series obj=new Fibonacci_Series();
        obj.fibonacci(10);
    }
    
}
