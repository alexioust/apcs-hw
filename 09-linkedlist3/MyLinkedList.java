public class MyLinkedList {
    private Node head;
    private Node tail;
    
    public MyLinkedList(){
	head = new Node ("0");
	tail = new Node ("tail");
	head.setNext(tail);
    }
    
    public void add (String d){
	Node temp = new Node(d);
        Node temp2 = head;
	while (temp2.getNext() != tail){
	    temp2 = temp2.getNext();
	}
	temp2.setNext(temp);
	temp.setNext(tail);
	
    }

    public String toString(){
	String s = "";
	Node temp = head.getNext();
	if (head.getNext() == tail){
	    return "null";
	}
	s = s +head.getNext() + " ";
	while ((temp.getNext()) != tail){
	    s = s + temp.getNext() + " ";
	    temp = temp.getNext();
	}
	return s;
    }
    
    public void add (int i, String s){
	if (i ==0){
	    add(s);
	    return;
	}
	Node temp = head.getNext();
	for (int j =0; j < i-1; j++){
	    temp = temp.getNext();
	}
	Node d = new Node (s);
	d.setNext(temp.getNext());
	temp.setNext(d);
    }

    public String get(int i){
	Node temp = head.getNext();
	for (int j = 0; j < i; j++){
	    temp = temp.getNext();
	}
	return temp.toString();
    }

    public String set (int i, String s){
	Node temp = head.getNext();
	for (int j = 0; j < i; j++){
	    temp = temp.getNext();
	}
	String returnvalue = temp.getData();
	temp.setData(s);
	return returnvalue;
    }
    
    public String remove (int i){
	if (i<=0){
	    String returnvalue = head.getNext().getData();
	    head.setNext(head.getNext().getNext());
	    return returnvalue;
	}
	Node temp = head.getNext();
	for (int j= 0; j < i-1; j++){
	    temp= temp.getNext();
	}
	String returnvalue = temp.getNext().getData();
	temp.setNext(temp.getNext().getNext());
	return returnvalue;
    }
    
    public int find (String s){
	if (head.getNext() == tail){
	    return -1;
	}
	Node temp = head.getNext();
	int counter = 0;
	while ((temp.getNext()) !=tail){
	    if (temp.getData().equals(s)){
		return counter;
	    }
	    temp = temp.getNext();
	    counter +=1;
	}
	return -1;
    }

    public int length (){
	if (head.getNext() == tail){
	    return 0;
	}
	Node temp = head.getNext();
	int counter = 1;
	while ((temp.getNext())!= tail){
	    temp = temp.getNext();
	    counter +=1;
	}
	return counter;
    }

}
