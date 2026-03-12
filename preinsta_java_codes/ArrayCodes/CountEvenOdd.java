package ArrayCodes;

public class CountEvenOdd {
    void countevenodd(){
        int arr[] = new int[]{2,16,23,4,3,7,9,13,15};
        int even = 0;
        int odd = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("No of even elements : "+ even + "\nNo of odd elements : " + odd);
    }
    public static void main(String[] args) {
        CountEvenOdd obj = new CountEvenOdd();
        obj.countevenodd();
    }
}
