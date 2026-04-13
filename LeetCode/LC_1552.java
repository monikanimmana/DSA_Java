import java.util.Arrays;
public class LC_1552 {
    public int maxDistance(int position[], int m){
        Arrays.sort(position);
        int n=position.length;
        int low=0;
        int high=position[n-1]-position[0];
        while(low<=high){
            int mid=(low+high)/2;
            if(minMagnet(position, mid,m)){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return high;
    }
    public boolean minMagnet(int position[], int force , int m ){
        int prevball=position[0];
        int count_ball=1;
        for(int i=1;i<position.length;i++){
            if(position[i]-prevball>=force){
                count_ball++;
                prevball=position[i];
            }
            if(count_ball>=m){
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        LC_1552 obj=new LC_1552();
        int position[]=new int[]{1,2,3,4,7};
        int m= 3;
        System.out.println(obj.maxDistance(position, m));
    }
}
