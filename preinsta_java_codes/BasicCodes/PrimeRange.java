package BasicCodes;

public class PrimeRange {
    int count=0;
    void prime(int n1,int n2){
        if(n1>1 && n2>1){
            for(int i=n1;i<=n2;i++){
                for(int j=2;j<=Math.sqrt(i);j++){
                    if(i%j==0){
                        count++;
                        break;
                    }

                }

                if(count==0){
                    System.out.println(i);
                }
               
            }
        }

    }
    public static void main(String[] args) {
        PrimeRange obj=new PrimeRange();
        obj.prime(2,10);
    }
}
