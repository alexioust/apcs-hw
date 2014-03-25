public class Driver {
 
    public static void main (String [] args){
	/*Node n1 = new Node("Stuff");
	Node n2 = new Node ("Mike");

	n1.setNext(n2);
	System.out.println(n1.getNext());
	n1.getNext().setNext(new Node ("Randall"));
	System.out.println (n2.getNext());
	
	
	  n1.setNext(n1.getNext().getNext());
	  System.out.println(n1.getNext());
	  System.out.println (n1.getNext().getNext());
	
	
	  n1.getNext().getNext().setNext(n1); */

	MyLinkedList L = new MyLinkedList();
	L.add("Sully");
	L.add("Mike");
	L.add ("stuff");
	L.add ("more");
	System.out.println (L);

	//	MyLinkedList E = new MyLinkedList();
	//	System.out.println(E.length());
	//      System.out.println(E.find("stuff"));
	//	System.out.println(E);
	//	L.add(2,"afterstuffbeforemike");
	//	L.add (0,"noerror");

	// more, stuff, mike, sully

	//	System.out.println (L.set(2,"notmike"));
	//	System.out.println (L.set(0,"number0"));
	
	//	System.out.println (L.get(0));
	//      System.out.println (L.get(2));
  	//      System.out.println(L.remove(0));
	//      System.out.println(L.remove(2));
	//	System.out.println(L.remove(-2));
	//      System.out.println (L.find("Mike"));
	//	System.out.println (L.length());
	
	System.out.println (L);
	
	
    }
}
