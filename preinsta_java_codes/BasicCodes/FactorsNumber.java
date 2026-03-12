package BasicCodes;

public class FactorsNumber {
    void factornumber(int n){
        System.out.println("Factors of a number: ");
        for(int i=1;i<n;i++){
            if(n%i==0){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        FactorsNumber obj=new FactorsNumber();
        obj.factornumber(12);
    }
}
