package BasicCodes;
public class PowerNumber {
    int result=1;
    void powernumber(int n,int p){
         for(int i=1;i<=p;i++){
            result *= n;
        
        }
        System.out.println(result);

    }
    public static void main(String[] args) {
        PowerNumber obj=new PowerNumber();
        obj.powernumber(13, 2);
    }
}


// Efficient way==============================================================
// int result = (int)Math.pow(2, 3);
