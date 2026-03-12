package BasicCodes;

public class ArmStrongRange {
    void armstrong(int fn,int ln){
        int original;
        int temp;
        int num;

        for(int i=fn;i<=ln;i++){
                original=i;
                temp=i;
                int digi=0;
            
                while(temp!=0){
                    temp = temp /10;
                    digi++;
                    
                }
             
                temp=i;
                int sum =0;
    
                while(temp!=0){
                    num = temp % 10;
                    sum += (int)Math.pow(num,digi);
                    temp=temp/10;
                   
                }
                if(original == sum){
                    System.out.println(original);
                }

            }
        }
    public static void main(String[] args) {
        ArmStrongRange obj=new ArmStrongRange();
        
        obj.armstrong(10,1000);
       
    }
}
