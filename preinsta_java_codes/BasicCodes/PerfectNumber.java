package BasicCodes;

public class PerfectNumber {
    void perfectnumber(int n){
        int original = n;
        int sum=1;
        int k = (int)Math.sqrt(n);
        for(int i=2;i<k;i++){
            if(n%i==0){
                sum += i;

                int other = n/i;
                if(other != i){
                    sum += other;
                }
            }

        }
        if(original == sum){
            System.out.println(n + " is a perfect number.");
        }
        else{
            System.out.println(n+ " is not a perfect number.");
        }
    }
    public static void main(String[] args) {
        PerfectNumber obj=new PerfectNumber();
        obj.perfectnumber(28);
    }
}

 
