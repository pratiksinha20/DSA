if(root==null)
        {
            return;
        }
        flatten(root.right);
        flatten(root.left);
        root.right=pre;
        pre=root;
        

        pre= root;
    }
        pre.left=null;
}