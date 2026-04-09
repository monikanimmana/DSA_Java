public class nthroot {
    public int findroot(int x,int n){
        int low=1;
        int high=x;
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            long prod= rootcalc(mid,n,x);
            if(prod == x){
                result=mid;
            }else if(prod > x){

                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return result;
    }
    public long rootcalc(int mid,int n , int x){
        int i=1;
        long prod=1;
        while(i<=n){
            prod *= mid;
            i++;
            if(prod>x){
             return prod;
            }
        }
        
        return prod;
    }
    public static void main(String[] args) {
        nthroot obj= new nthroot();
        int x=69;
        int n=3;
        System.out.println(obj.findroot(x, n));

    }
}
