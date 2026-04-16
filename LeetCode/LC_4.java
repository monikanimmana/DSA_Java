public class LC_4{
    public int twoSortedArray(int nums1[],int nums2[]){
        int n1=nums1.length;
        int n2=nums2.length;
        int total=n1+n2;
        int i=0,j=0;
        int curr=0;int prev=0;
        for(int k=0;k<=total/2;k++){
            prev=curr;
            if(i<n1 && (j>=n2 || nums1[i]<nums2[j])){
                curr=nums1[i++];
            }else{
                curr=nums2[j++];
            }
        }
        if(total%2==0){
            return (int)((curr+prev) / 2.0);
        }else{
            return curr;
        }
    }
    public static void main(String[] args) {
        LC_4 obj=new LC_4();
        int nums1[]=new int[]{1,3,7,10,13};
        int nums2[]=new int[]{2,8,13};
        System.out.println(obj.twoSortedArray(nums1, nums2));
    }
}