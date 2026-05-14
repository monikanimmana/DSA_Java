import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class M_colouring {
    public boolean m_colouring(List<List<Integer>> G, int n , int m){
        int[] color = new int[n];
        int node=0;
        if(colouring(G,n,m,node,color)) return true;
        return false;
    }
    public boolean colouring(List<List<Integer>> G,int n ,int m ,int node,int[] color){
        if(node==G.size()){
            return true;
        }
        for(int i=1;i<=m;i++){
            if(ispossible(G,node,i,color)){
                color[node]=i;
                if(colouring(G, n, m, node+1,color)) return true;
                color[node]=0;
            }
        }
        return false;
    }
    public boolean ispossible(List<List<Integer>> G, int n,int i,int[] color){
        for(int colo:G.get(n)){
            if(color[colo]==i){
               return false;
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
        M_colouring obj=new M_colouring();
        int n = 3;
        int m = 3;

        List<List<Integer>> graph = new ArrayList<>();

        graph.add(Arrays.asList(1, 2)); // 0
        graph.add(Arrays.asList(0, 2)); // 1
        graph.add(Arrays.asList(0, 1)); // 2
        System.out.println(obj.m_colouring(graph,n,m));
        }
        
}
