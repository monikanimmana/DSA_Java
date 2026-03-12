package BasicCodes;

public class HarshadNumber {
    void harshadnumber(int n){
        int origi = n;
        int sum =0;
        while(n!=0){
            int num = n%10;
            sum += num;
            n = n/10;
        }
        if(origi % sum == 0){
            System.out.println("It is a Harshad number.");
        }
        else{
            System.out.println("It is not a Harshad Number.");
        }
    }
    public static void main(String[] args) {
        HarshadNumber obj=new HarshadNumber();
        obj.harshadnumber(25);
    }
}
