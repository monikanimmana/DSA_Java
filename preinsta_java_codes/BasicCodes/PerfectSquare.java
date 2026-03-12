package BasicCodes;

public class PerfectSquare {
        void perfectsquare(int n){
            int k = (int)Math.sqrt(n);
                if((k * k ) == n){
                    System.out.println("It is a perfect square.");
                }
                else{
                    System.out.println("It is not a perfect square.");
                }
    }
    public static void main(String[] args) {
        PerfectSquare obj=new PerfectSquare();
        obj.perfectsquare(9);
    }
}


