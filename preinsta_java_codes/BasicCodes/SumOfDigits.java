package BasicCodes;

public class SumOfDigits {
    void digit(int n){
        int count=0;
        if(n>0){
            while(n>0){
                int r=n%10;
                count += r;
                n=n/10;
            }
            System.out.println(count);

            
        }
        else{
            System.out.println("Enter valid number.");
        }

    }
    public static void main(String[] args) {
        SumOfDigits obj=new SumOfDigits();
        obj.digit(123456);
    }
}
