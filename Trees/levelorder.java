import java.util.LinkedList;
import java.util.Queue;


class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
    }
}
public class levelorder{
    static void level_traversal(TreeNode root){
        if(root==null) return;

        Queue<TreeNode> q=new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode current = q.poll();
                System.out.print(current.val+" ");
                if(current.left != null){
                    q.offer(current.left);

                }
                if(current.right != null){
                    q.offer(current.right);

                }    

            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left = new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(8);

        level_traversal(root);
    }
}