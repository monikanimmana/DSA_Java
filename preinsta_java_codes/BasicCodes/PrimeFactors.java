package BasicCodes;
public class PrimeFactors {
    void primefactor(int n){
        for(int i=2;i<=n;i++){
                while(n%i==0){
                    System.out.println(i);
                    n=n/i;
                }
            }
    }
//     public int isprime(int i){
//         for(int j=2;j<=Math.sqrt(i);j++){
//             if(i%j==0){
//                 return 0;
//             }

//         }
//         return 1;

//     }
//     public void primefactor(int n){
//         for(int i=2;i<=n;i++){
//             if( isprime(i)==1){
//                 int x=n;
//                 while(x!=0){
//                     if(x%i==0){
//                         System.out.println(i + " ");
//                         x=x/i;
//                 }
//             }

//         }
//     }
        
            
// }
        

    public static void main(String[] args) {
        PrimeFactors obj=new PrimeFactors();
        obj.primefactor(8);
        
    }
}

// efficient way ............................................................................
//while(n%i==0 && isPrime(i))

