*         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode pre=null;
    public void flatten(TreeNode root) {
        // TreeNode curr=root;
        
        if(root==null)
        {
            return;
        }
        flatten(root.right);
        flatten(root.left);
        root.right=pre;