class Solution
{
    //Function to check whether all nodes of a tree have the value 
    //equal to the sum of their child nodes.
    public static int isSumProperty(Node root)
    {
        // add your code here
        if(root==null){return 0;}
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(q.isEmpty()==false){
            int x = q.size(); int sum=0;
            for(int i=0;i<x;i++){
                Node n = q.remove();
                sum=0;
                if(n.left!=null||n.right!=null){
                    if(n.left!=null){sum=sum+n.left.data;}
                    if(n.right!=null){sum=sum+n.right.data;}
                    if(sum!=n.data){return 0;}
                }
                if(n.left!=null){q.add(n.left);}
                if(n.right!=null){q.add(n.right);}
            }
        }
        return 1;
    }
}
