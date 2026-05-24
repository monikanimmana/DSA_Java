public class LC_1752{
    public boolean find(int arr[]){
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                count++;
            }
        }
        if(arr[arr.length-1]>arr[0]){
            count++;
        }

        return count<=1;
    }
    public static void main(String[] args) {
        LC_1752 obj=new LC_1752();
        int arr[]=new int[]{3,1,2,2,5};
        System.out.println(obj.find(arr));
    }
    
}