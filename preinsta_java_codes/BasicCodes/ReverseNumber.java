package BasicCodes;

public class ReverseNumber {
    void reversenumber(int n){
        int rev = 0;
        if(n>0){
            while(n!=0){
                int r=n%10;
                rev = (rev * 10) + r;
                n=n/10;
                
            }
            System.out.println(rev);
        }
        else{
            System.out.println("Enter valid number");
        }
    }
    public static void main(String[] args) {
        ReverseNumber obj=new ReverseNumber();
        obj.reversenumber(123);
    }
}
