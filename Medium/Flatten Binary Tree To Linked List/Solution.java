class Solution {
 */
 * }
 *     }
    public void flatten(TreeNode root) {
        // TreeNode curr=root;
        TreeNode pre=null;
        if(root==null)
        {
            return;
        }
        flatten(root.right);
        flatten(root.left);
        root.right=pre;
        pre=root;
        pre.left=null;