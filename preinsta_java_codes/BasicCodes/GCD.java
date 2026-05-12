
import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums1=sc.nextInt();
        int nums2=sc.nextInt();
        int n=Math.min(nums1,nums2);
        int gcd;
        for(int i=1;i<=n;i++){
            if(nums1%i==0&&nums2%i==0){
                gcd=i;
            }
        }
        System.out.println("GCD "+ gcd);

        
    }
    
}
