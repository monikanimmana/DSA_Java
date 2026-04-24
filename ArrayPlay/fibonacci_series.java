public class fibonacci_series {
    public int fibo(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        fibonacci_series obj=new fibonacci_series();
        System.out.println(obj.fibo(5));
    }
}
