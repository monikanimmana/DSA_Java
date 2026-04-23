public class recursion_1 {
    public int sum(int n){
        if(n==0){
            return 0;
        }
        return n + sum(n-1);
    }
    public static void main(String[] args) {
        recursion_1 obj=new recursion_1();
        int total=obj.sum(5);
        System.out.println(total);
    }
}
