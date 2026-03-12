package BasicCodes;

public class AutomorphicNumber {
    void automorphic(int n){
        int origi =n;
        int digi=0;
        while(n!=0){
            n=n/10;
            digi++;
        }
        
        int sqnum = origi*origi;
        int value = sqnum % (int)Math.pow(10,digi);
        if(origi == value){
            System.out.println("It is a automorphic number.");
        }
        else{
            System.out.println("It is not a automorphic number.");
        }

    }
    public static void main(String[] args) {
        AutomorphicNumber obj=new AutomorphicNumber();
        obj.automorphic(376);
    }
}
