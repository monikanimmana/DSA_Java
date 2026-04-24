public class recursion_1 {
    public int sum(int n){
        if(n==0){
            return 0;
        }
        return n%10 + sum(n/10);
    }
    public static void main(String[] args) {
        recursion_1 obj=new recursion_1();
        int total=obj.sum(1234);
        System.out.println(total);
    }
}
