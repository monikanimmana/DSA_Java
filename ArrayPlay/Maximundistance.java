public class Maximundistance {
    static int find(int arr[]){
        int dist=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    dist=Math.max(dist,j-i);
                }
            }
        }
        if(dist == Integer.MIN_VALUE) return -1;
        return dist;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,2,1,3};
        System.out.println(find(arr));
        
    }
}
