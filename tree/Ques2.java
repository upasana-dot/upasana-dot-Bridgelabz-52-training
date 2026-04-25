package tree;
class Ques2 {
    public boolean isSame(TreeNode p, TreeNode q){
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;

        if(p.val != q.val) return false;

        return isSame(p.left, q.left) &&
               isSame(p.right, q.right);
    }
    public static void main(String[] args){
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        Ques2 tree = new Ques2();
        System.out.println("Are the trees the same? " + tree.isSame(root1, root2));
    }
}