class Solution
{
    //Function to return count of nodes at a given distance from leaf nodes.
    HashSet<Node> hs = new HashSet<Node>();
    boolean helper(Node root,int count,int k){
        if(root==null){return false;}
        if(root.left==null&&root.right==null&&count==0){return true;}
        if(count==k){helper(root.left,count,k);helper(root.right,count,k);}
        if(helper(root.left,count-1,k)||helper(root.right,count-1,k)){if(count==k){hs.add(root);} return true;}
        return false;
    }
    void findleaves(Node root){
        if(root==null){return;}
        findleaves(root.left);
        findleaves(root.right);
        if(root.left==null&&root.right==null){hs.add(root);}
    }
    int printKDistantfromLeaf(Node root, int k)
    {
        // Write your code here
       if(k==0){findleaves(root);}
        helper(root,k,k);
        return hs.size();
        
    }

}
