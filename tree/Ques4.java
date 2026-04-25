package tree;

class Ques4 {  //Delete a node in BST

    public TreeNode deleteNode(TreeNode root, int key){
        if(root == null) return null;

        if(key < root.val){
            root.left = deleteNode(root.left, key);
        }
        else if(key > root.val){
            root.right = deleteNode(root.right, key);
        }
        else {
            // case 1: no child
            if(root.left == null && root.right == null){
                return null;
            }

            // case 2: one child
            if(root.left == null) return root.right;
            if(root.right == null) return root.left;

            // case 3: two children
            TreeNode successor = findMin(root.right);
            root.val = successor.val;
            root.right = deleteNode(root.right, successor.val);
        }

        return root;
    }

    private TreeNode findMin(TreeNode root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
}