public class BST {
    
    private Node root;

    public BST(){
	root = null;
    }

    public Node getRoot(){
	return root;
    }

    public Node search (int x){
	Node c = root;
	while (c!=null && c.getData()!= x){ 
	    if (c.getData() <x){
		c=c.getRight();
	    }else {
		c=c.getLeft();
	    }
	}
	return c;
    }

    public Node searchPrior (int x){
	Node c = root;
	Node temp = root;
	while (c!=null && c.getData()!= x){ 
	    if (c.getData() <x){
		temp = c;
		c=c.getRight();
	    }else {
		temp = c;
		c=c.getLeft();
	    }
	}
	return temp;
    }
    
    public void insert (int x){
	if (root == null){
	    root = new Node (x);
	    return;
	}
	Node temp = root;
	Node temp2 = root;
	while (temp!=null && temp.getData()!=x){
	    if (temp.getData()<x){
		temp2 = temp;
		temp = temp.getRight();
	    } else {
		temp2 = temp;
		temp = temp.getLeft();
	    }
	}
	if (temp2.getData()<x){
	    temp2.setRight(new Node(x));
	}
	if (temp2.getData()>x){
	    temp2.setLeft(new Node(x));
	}
    }

    public Node search2 (Node c, int x){
	if (c == null){
	    return c;
	}
	if (c.getData()<x){
	    return search2 (c.getRight(), x);
	}
	if (c.getData()> x){
	    return search2 (c.getLeft(),x);
	}
	return c;
	
    }

    public Node highestLeft (Node n){
	Node temp = n.getLeft();
	Node temp2 = n;
	while (temp.getRight()!= null){
	    temp2 = temp;
	    temp = temp.getRight();
	}
	return temp2;
    }

    public void delete (int x){
	
	Node temp = search(x);
	if (temp ==null){
	    return;
	}
	if (temp.getLeft()==null){
	    if (searchPrior(x).getData() > x){
		searchPrior(x).setLeft(temp.getRight());
	    } else {
		searchPrior(x).setRight(temp.getRight());
	    }
	    return;
	}
	    
	Node temp2 = search(x);

	temp2 = highestLeft(temp);
	if (temp2 == temp){
	    search(x).setData(search(x).getLeft().getData());
	    search(x).setLeft(null);
	    return;
	}
	
	if (highestLeft(temp).getRight().getLeft()!= null){
	    highestLeft(temp).setRight(highestLeft(temp).getRight().getLeft());
	} else {
	    highestLeft(temp).setRight(null);
	}
	search(x).setData(temp.getData());
    }

    /*
	  get pointer to the parent of the node we want to delete
    
	  3 cases: a. the node to delete is a leaf - set parent's left or right pointer to null
      b. the node to delete has one child - set the parent's left or right pointer to the node's non-null pointer
      cases a and b can be combined
      c. node has 2 children
      1. find largest value on left subtree (1left then as far right as possible) or find smallest on right subtree
      2. make a copy of that value
      3. pretend you have a tree w/ the node to delete as the root and delete the largest node in the left subtree (it can only have 0 or 1 children) (recurisvely w/ fake root)
      4. replace the node to delete w/ the copied value.
      
      root- treat as a special case w/ if 
      or - use a dummy node - the dummy's value should be less than any possible tree value
    */

    public void traverse (Node n){
	if (n == null){
	    return;
	}

	traverse (n.getLeft());
	System.out.println (n);
	traverse (n.getRight());
    }



}
    
