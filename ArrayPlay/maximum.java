public class maximum {
    static int max(int []arr){
        int lar=arr[0];
        int index=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>lar){
                lar=arr[i];
                index=i;
            }   
        }
        for(int i=0;i<arr.length;i++){
            int res= arr[i]*2;
            if(i == index) continue;
            if(res > lar){
                return -1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{1,3,6,0};
        System.out.println(max(arr));
    }
}
