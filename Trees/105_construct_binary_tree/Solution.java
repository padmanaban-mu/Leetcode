/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
     #define OFFSET 3000
int inmap[6001];
struct TreeNode*build(int*preorder,int prestart,int preend,int*inorder,int instart,int inend,int*inmap){
    if(prestart>preend||instart>inend){
        return NULL;
    }
    struct TreeNode*root=malloc(sizeof(struct TreeNode));
    root->val=preorder[prestart];
    root->left=root->right=NULL;
    int inroot=inmap[root->val+OFFSET];
    int left=inroot-instart;
    root->left=build(preorder,prestart+1,prestart+left,inorder,instart,inroot-1,inmap);
    root->right=build(preorder,prestart+left+1,preend,inorder,inroot+1,inend,inmap);
    return root;
}
struct TreeNode* buildTree(int* preorder, int preorderSize, int* inorder, int inorderSize) {
    for(int i=0;i<inorderSize;i++){
        inmap[inorder[i]+OFFSET]=i;
    }
    struct TreeNode*root=build(preorder,0,preorderSize-1,inorder,0,inorderSize-1,inmap);

    return root;
}