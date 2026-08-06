
class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }  

public class inorder { 
    static void inorder_traversal(TreeNode root){
        if(root==null) return;

        inorder_traversal(root.left);
        System.out.print(root.val+" ");
        inorder_traversal(root.right);

    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(6);
        inorder_traversal(root);
    }
}

