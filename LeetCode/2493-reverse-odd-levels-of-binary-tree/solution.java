/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root==null){
            return root;
        }
        Queue<TreeNode>queue=new LinkedList<>();
        queue.add(root);
        int level=0;
        while(!queue.isEmpty()){
        List<TreeNode>list=new ArrayList<>();
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode current=queue.poll();
                list.add(current);
                if(current.left!=null){
                    queue.add(current.left);
                }
                if(current.right!=null){
                    queue.add(current.right);
                }
            }
            if(level%2==1){
                int left=0;
                int right=list.size()-1;
                while(left<right){
                    int temp=list.get(left).val;
                    list.get(left).val=list.get(right).val;
                    list.get(right).val=temp;
                    left++;
                    right--;
                }
            }
            level++;
        }
        return root;
    }
}
