public class LC_42{
    public int RainWater(int height[]){
        int n=height.length;
        int leftMax[]=new int[n];
        int  rightMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]= Math.max(leftMax[i-1],height[i]);

        }
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1], height[i]);
        }
        int traped=0;
        for(int i=0;i<n;i++){
            traped += Math.min(leftMax[i],rightMax[i]) - height[i];
        }
        return traped;
    }
    public static void main(String[] args) {
        LC_42 obj=new LC_42();
        int height[]=new int[]{0,1,0,2,1,3,1,2,1};
        System.out.println(obj.RainWater(height));
    }
}