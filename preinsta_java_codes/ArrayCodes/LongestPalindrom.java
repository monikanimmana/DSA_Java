package ArrayCodes;

public class LongestPalindrom {
    void longestpalindrom(){
        int arr[] = new int[]{121, 2322, 54545, 999990};
        int long_palin=0;
        int digit =0;
        int reverse =0;
        int count;
        for(int i=0;i<arr.length;i++){
            int original = arr[i];
            int n = arr[i];
            reverse =0;
            count =0;
            while(n>0){
                int rem = n % 10;
                reverse = reverse * 10 + rem;
                n = n/10;
                count++;
            }
            if(original == reverse){
                if(count > digit){
                    long_palin = original;
                    digit = count;

                }                
            }
        }
        System.out.println("Longest Palindrom : " + long_palin + " -> " + digit);
    }
    public static void main(String[] args) {
        LongestPalindrom obj=new LongestPalindrom();
        obj.longestpalindrom();
    }
    
}
