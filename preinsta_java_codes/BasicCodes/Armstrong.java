package BasicCodes;

public class Armstrong {

    void armstrong(int n){
        int orig=n;
        int temp = n;
        int value=0;
        int digi=0;
        int num;
        int count;
        int k;
        if(n<0){
            System.out.println("Enter a valid number.");
        }
        else{
            while(temp!=0){
                temp=temp/10;
                digi++;
                
            }
            count= digi;
            temp=n;
            while(temp!=0){
                k = (int)Math.pow(10, digi-1);
                num = temp / k;
                value += Math.pow(num, count);
                temp = temp % k;
                digi--;

            }
            if(orig == value){
                System.out.println("It is a Armstrong Number.");
            }
            else{
                System.out.println("It is not a Armstrong Number.");
            }
        }

    }
    public static void main(String[] args) {
        Armstrong obj=new Armstrong();
        obj.armstrong(370);
    }
}


// Efficient way...................................................................................
// while(temp!=0){
//     r= temp/10;
//     sum += Math.pow(r, count);
//     temp = temp%10;
// }