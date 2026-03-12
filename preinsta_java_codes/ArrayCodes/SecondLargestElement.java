package ArrayCodes;

public class SecondLargestElement {
    void secondlargestelement(){
        int arr[] = new int[] {2,23,1,45,6};
        int largest;
        int seclargest;
        if(arr.length<2){
            System.out.println("It is not possible");
            return ;
        }

        if(arr[0]>arr[1]){
            largest = arr[0];
            seclargest = arr[1];
        }
        else{
            largest = arr[1];
            seclargest = arr[0];
        }

        for(int i=2;i<arr.length;i++){
            if(arr[i]>largest){
                seclargest= largest;
                largest=arr[i];
            }
            else if(arr[i]!=largest && arr[i]>seclargest){
                seclargest = arr[i];
            }

        }
        System.out.println(seclargest);     
    }
    public static void main(String[] args) {
        SecondLargestElement obj=new SecondLargestElement();
        obj.secondlargestelement();
    }
}
