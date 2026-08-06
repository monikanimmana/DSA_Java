class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }   
public class preorder{
    public void preorder_traversal(TreeNode root){
        if(root==null) return;

        preorder_traversal(root.left);
        System.out.print(root.val+" ");
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
        obj.preorder_traversal(root);
    }
}