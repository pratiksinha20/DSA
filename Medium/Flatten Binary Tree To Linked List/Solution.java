{
            return;
        }
        flatten(root.right);
        flatten(root.left);
        if(root==null)
        TreeNode pre=null;
        // TreeNode curr=root;
    public void flatten(TreeNode root) {
        root.right=pre;
        pre=root;
        pre.left=null;

        pre= root;
    }
}