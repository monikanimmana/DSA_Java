import java.util.Arrays;
public class ArrayAdding{
    public int[] arrayAdding(int arr1[] , int arr2[], int n , int m){
        int maxi=Math.max(n,m);
        int ans[] = new int[maxi+1];
        int i=n-1;
        int j=m-1;
        int k= ans.length-1;
        int carry=0;
        while(k>=0){
            int val1=(i>=0)?arr1[i]:0;
            int val2=(j>=0)?arr2[j]:0;
            int sum=val1+val2+carry;
            ans[k]=sum%10;
            carry=sum/10;
            i--;
            j--;
            k--;
        }
        int finalAns[]=new int[maxi];
        if(ans[0]==0){
            for(int l=1;l<=ans.length-1;l++){
                finalAns[l-1]=ans[l];    
            }
            return finalAns;
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayAdding obj=new ArrayAdding();
        int arr1[]=new int[]{1,2};
        int arr2[]=new int[]{1,2,3,4};
        int n=2;
        int m=4;
        System.out.println(Arrays.toString(obj.arrayAdding(arr1,arr2,n,m)));
    }
}