public class LC_50{
    public double power(double x , long n){
        if(n==0) return 1;
        
        double half=power(x,n/2);

        double result=half * half;

        if(n%2==0){
            return result;
        }else{
            return x * result;
        }
    }
    public double mypow(long N , double x){
        if(N<0){
            x=1/x;
            N=-N;
        }
        return power(x, N);
    }
    public static void main(String[] args) {
        LC_50 obj=new LC_50();
        int x=2;
        int n=10;

        System.out.println(obj.power(x, n));
    }
}