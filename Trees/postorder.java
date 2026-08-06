class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }  
public class postorder {
    static void postorder_traversal(TreeNode root){
        if(root==null) return;

        postorder_traversal(root.left);
        postorder_traversal(root.right);
        System.out.print(root.val + " ");

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(6);
        postorder_traversal(root);
    }
    
}
