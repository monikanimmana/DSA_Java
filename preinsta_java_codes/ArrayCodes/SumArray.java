package ArrayCodes;

public class SumArray {
    void sum(){
        int arr[] = new int[]{23,1,4,5,6,7};
        int sum=0;
        for(int i : arr){
            sum += i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        SumArray obj=new SumArray();
        obj.sum();
    }
}
