import java.util.ArrayList;
import java.util.List;
public class LC_60 {
    public String getPermutation(int n , int k){
        int fact=1;
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<n;i++){
            fact = fact*i;
            list.add(i);
        }
        list.add(n);
        String permutate="";
        k=k-1;
        while(true){
            permutate = permutate + list.get(k/fact);
            list.remove(k/fact);
            if(list.size()==0){
                break;
            }
            k=k%fact;
            fact=fact/list.size();
        }
        return permutate;
    }
    public static void main(String[] args) {
        LC_60 obj=new LC_60();
        int n=4;
        int k=17;
        System.out.println(obj.getPermutation(n,k));
    }
}
