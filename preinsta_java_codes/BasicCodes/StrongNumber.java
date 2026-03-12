package BasicCodes;

public class StrongNumber {
    void strongnumber(int n){
        int original =n;
        int result=0;
        int digi;
        while(n!=0){
            int fact=1;
            digi = n%10;
            for(int i =1;i<=digi;i++){
                fact *=i;
            }
            result += fact;
            n=n/10;
        }
        if(original == result){
            System.out.println(original + " is a Strong Number.");
        }
        else{
            System.out.println(original + " is not a Strong Number.");
        }
    }
    public static void main(String[] args) {
        StrongNumber obj=new StrongNumber();
        obj.strongnumber(2);
    }
    
}
