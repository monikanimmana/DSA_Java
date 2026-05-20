public class Distanceinarray {
    public int find(int arr[]){
        int dist=Integer.MAX_VALUE;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                if(index!=-1){
                    dist = Math.min(dist, i-index);
                }
                index=i;  
            }           
        }if(dist == Integer.MAX_VALUE){
            return -1;
        }
        return dist;
        
    }
    public static void main(String[] args) {
        Distanceinarray obj=new Distanceinarray();
        int arr[]=new int[]{43,15,7,31,5};
        System.out.println(obj.find(arr));
    }
}
