package tree;

class TreeNode {  //Definition for a binary tree node
    int val;
    TreeNode left, right;

    TreeNode(int val){
        this.val = val;
    }
}

class Ques1 {

    public int countNodes(TreeNode root){
        if(root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public int height(TreeNode root){
        if(root == null) return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    
    public void preorder(TreeNode root){
        if(root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public void postorder(TreeNode root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Ques1 tree = new Ques1();
        System.out.println("Number of nodes: " + tree.countNodes(root));
        System.out.println("Height of tree: " + tree.height(root));

        System.out.println("Preorder Traversal:");
        tree.preorder(root);
        System.out.println("\nInorder Traversal:");
        tree.inorder(root);
        System.out.println("\nPostorder Traversal:");
        tree.postorder(root);
    }
}