
package LeetCode.LeetCodes.Arrays;

public class LC_67 {
    public void BinaryAddition(){
        int a = 1;
        int b= 1;
        int carry =0;
        int digit = 0;
        int sum =0;
        while(a>0 || b>0 || carry > 0){
            int bit_a = a % 10;
            a /= 10;
            int bit_b = b%10;
            b /=10;
            // if(bit_a == 1 && bit_b == 1){
            //     if(carry == 1){
            //         digit = 1;
            //         carry = 1;
            //         sum = sum * 10 + digit;    
            //     }
            //     else{
            //         digit = 0;
            //         carry = 1;
            //         sum = sum * 10 + digit;  
            //     }
            // }
            // else if(bit_a ==0 && bit_b == 0){
            //     if(carry == 1){
            //         digit = 1;
            //         carry = 0;
            //         sum = sum * 10 + digit;  
            //     }
            //     else{
            //         digit = 0;
            //         carry = 0;
            //         sum = sum * 10 + digit;  
            //     }
            // }
            // else{
            //     if(carry == 1){
            //         digit = 1;
            //         carry = 1;
            //         sum = sum * 10 + digit;  
            //     }
            //     else{
            //         digit = 1;
            //         carry = 0;
            //         sum = sum * 10 + digit;  
            //     }
            // }
            
        }


        if(carry == 1){
            sum = sum * 10 + 1;
            System.out.println(sum);
        }
        else{
            System.out.println(sum);
        }
        System.out.println(sum);
        
    }
    public static void main(String[] args) {
        LC_67 obj = new LC_67();
        obj.BinaryAddition();
    }
}
