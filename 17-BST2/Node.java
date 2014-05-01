public class Node { 
    
    private int data;
    private Node right;
    private Node left;

    public Node(int d){
	data =d;
	left = null;
	right = null;
    }

    public void setData (int d){
	data = d;
    }
    public int getData(){
	return data;
    }
    public void setRight(Node n){
	right = n;
    }
    public void setLeft (Node n){
	left = n;
    }    
    public Node getRight(){
	return right;
    }
    public Node getLeft(){
	return left;
    }
    public String toString(){
	return "" +data;
    }
}
