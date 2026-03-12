package BasicCodes;

public class AbundantNumber {
    void abundantnumber(int n){
        int sum =1;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                sum += i;

                int other = n/i;
                if(other != i){
                    sum += other;
                }
            }
        }
        if(n < sum){
            System.out.println("It is a Abundant Number.");
        }
        else{
            System.out.println("It is not a Abundant Number.");
        }
    }
    public static void main(String[] args) {
        AbundantNumber obj=new AbundantNumber();
        obj.abundantnumber(2);
    }
}
