public class BST {
    
    private Node root;

    public BST(){
	root = null;
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
    
    public void insert (int x){
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
	    search2 (c.getRight(), x);
	}
	if (c.getData()> x){
	    search2 (c.getLeft(),x);
	}
	return c;
	
    }
}
    
