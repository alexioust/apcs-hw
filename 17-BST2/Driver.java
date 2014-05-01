public class Driver {
    
    public static void main (String [] args){
	
	BST a = new BST();
	a.insert(30);
	a.insert(10);
	a.insert(40);
	a.insert(5);
	a.insert(15);
	a.insert(70);
	a.insert(90);
	a.insert(75);

	//	System.out.println(a.getRoot().getLeft());
	//	System.out.println(a.getRoot().getLeft().getLeft());

	a.traverse(a.getRoot());

	a.delete(15);
	a.traverse(a.getRoot());
    }
}
