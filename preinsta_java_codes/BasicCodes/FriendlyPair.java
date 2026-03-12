package BasicCodes;

public class FriendlyPair {
    void friendlypair(int n1, int n2){
        int sum1=1;
        int sum2=1;
        for(int i=2;i<=(int)Math.sqrt(n1);i++){
            if(n1%i==0){
                sum1+=i;
                int other1 = n1/i;
                if(other1!=i){
                    sum1 += other1;
                }
            }
        }
        for(int j=2;j<=(int)Math.sqrt(n2);j++){
            if(n2%j==0){
                sum2+=j;
                int other2 =  n2/j;
                if(other2 != j){
                    sum2+= other2;
                }
            }
        }
        if(sum1 == n2 && sum2 == n1){
            System.out.println("There are friendly pair.");
        }
        else{
            System.out.println("There are not Friendly pair.");
        }
    }
    public static void main(String[] args) {
        FriendlyPair obj=new FriendlyPair();
        obj.friendlypair(220, 284);
    }
}
