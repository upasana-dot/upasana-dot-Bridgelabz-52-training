package tree;

class Ques5 {   //Tree Traversals

    // Inorder (Infix)
    public void inorder(TreeNode root){
        if(root == null) return;

        System.out.print("(");
        inorder(root.left);
        System.out.print(root.val);
        inorder(root.right);
        System.out.print(")");
    }

    // Preorder (Prefix)
    public void preorder(TreeNode root){
        if(root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Postorder (Postfix)
    public void postorder(TreeNode root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }
}
