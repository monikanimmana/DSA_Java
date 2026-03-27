import java.util.HashMap;

public class LC_1124 {
    public int longestWPI(int arr[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int max_length=0;
        map.put(0,-1);
        for(int i=0;i<arr.length;i++){
            if(arr[i]>8){
                sum+=1;
            }else{
                sum+=-1;
            }
            if(sum>0){
                max_length=i+1;
            }else{
                
                if(map.containsKey(sum-1)){
                    max_length=Math.max(max_length,i-map.get(sum-1));
                }
            }

        }
        return max_length;
    }
    public static void main(String[] args) {
        LC_1124 obj=new LC_1124();
        int arr[] = new int[]{9,9,6,0,6,6,9};
        System.out.println(obj.longestWPI(arr));
    }
    
}
