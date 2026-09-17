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
        static Set<Integer>list=new LinkedHashSet<>();
    public int findSecondMinimumValue(TreeNode root) {
      list.clear();
        inorder(root);
        if(list.size()==1){
            return -1;
        }
       int min=findMinimum(Integer.MAX_VALUE);
      int min1= findMinimum(min,Integer.MAX_VALUE);
      if(list.contains(min1)){
        return min1;
      }
      return -1;
    }
    public static void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
      list.add(root.val);
        inorder(root.right);
    }

    public static int findMinimum(int min){
        for(int i:list){
            min=Math.min(min,i);
        }
        return min;
    }
    public static int findMinimum(int k,int min){
        for(int i:list){
            if(i!=k){
            min=Math.min(min,i);
        }
        }
        return min;
    }
}
