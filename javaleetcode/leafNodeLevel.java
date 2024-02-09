class Solution
{
    boolean check(Node root)
    {
	// Your code here
	//In this approach we will use level order traversal of the binary tree
	if(root==null){return false;}
	Queue<Node> q = new LinkedList<Node>();
	q.add(root);
	// We create two boolean variables to check if all the nodes present in a level are...
	//of the same type i.e either leaf nodes or non-leaf nodes 
	boolean flag=true,conf=true;
	//Inside the while loop, we store the state of the first node in a level using the variable...
	// 'flag' and then we make sure all the remaining elements in the level are of the same type 
	// if they are different, then we return false 
	while(q.isEmpty()==false){
	    int x=q.size();
	    Node n=q.remove();
	    if(n.left!=null){q.add(n.left);}
	    if(n.right!=null){q.add(n.right);}
	    if(n.left!=null||n.right!=null){flag=true;}
	    else{flag=false;}
	    for(int i=1;i<x;i++){
	        Node s = q.remove();
	        if(s.left!=null||s.right!=null){conf=true;}
	        else{conf=false;}
	        if(s.left!=null){q.add(s.left);}
	        if(s.right!=null){q.add(s.right);}
	        if(flag!=conf){return false;}
	    }
	}
	return true;
    }
}
