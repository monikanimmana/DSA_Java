class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }   
public class preorder{
    static void preorder_traversal(TreeNode root){
        if(root==null) return;

        System.out.print(root.val+" ");
        preorder_traversal(root.left);
        preorder_traversal(root.right);

    }
    public static void main(String[] args) {
        preorder obj=new preorder();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(6);
        preorder_traversal(root);
    }
}