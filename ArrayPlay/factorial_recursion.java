public class factorial_recursion {
    public int factorial(int n){
        if (n==1){
            return n;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        factorial_recursion obj=new factorial_recursion();
        int total= obj.factorial(5);
        System.out.println(total);
    }
}
