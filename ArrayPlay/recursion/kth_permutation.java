import java.util.ArrayList;
import java.util.List;
public class kth_permutation {
    public void permutate(int n, int m){
        List<Integer> temp=new ArrayList<>();
        List<List<Integer>> list=new ArrayList<>();
        boolean[] used=new boolean[n+1];
        backtrack(n , m,temp,list,used);
        System.out.println(list.get(m-1));

        
    }
    public void backtrack(int n , int m , List<Integer> temp,List<List<Integer>> list,boolean[] used){
        if(temp.size()==n){
            list.add(new ArrayList<>(temp));
            return;
            
        }
        for(int i=1;i<=n;i++){
            if(!used[i]){
                used[i]=true;
                temp.add(i);
                backtrack(n, m,temp, list,used);
                temp.remove(temp.size()-1);  
                used[i]=false; 
            }
        }
    }
    public static void main(String[] args) {
        kth_permutation obj=new kth_permutation();
        int n=3;
        int m=3;
        obj.permutate(n, m);;
    } 
}
