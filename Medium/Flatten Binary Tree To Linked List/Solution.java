// TreeNode curr=root;
        
        if(root==null)
        {
            return;
        }
        flatten(root.right);
        flatten(root.left);
        root.right=pre;
        pre=root;
        root.left=null;
        

        pre= root;
    }
}