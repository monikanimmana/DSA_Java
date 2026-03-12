package ArrayCodes;

public class SecondSmallestElement {
    void secsmallestelement(){
        int arr[] = new int[] {2,3,1,1};
        int secsmall=Integer.MAX_VALUE;
        int small=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                secsmall = small;
                small = arr[i];
            }
            else if(arr[i]>small && arr[i]<secsmall){
                secsmall = arr[i];

                }
        }
        System.out.println(secsmall);

    }
    public static void main(String[] args) {
        SecondSmallestElement obj=new SecondSmallestElement();
        obj.secsmallestelement();
    }

    
}
