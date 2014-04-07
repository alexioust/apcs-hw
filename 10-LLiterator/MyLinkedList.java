import java.io.*;
import java.util.*;


public class MyLinkedList<E> implements Iterable <E> {

    private Node <E> head;

    public Iterator<E> iterator(){
	return new MyLLIterator<E>(head);
    }

    public MyLinkedList(){
	head =null;
    }
	
    public void add (E d){
	Node <E> temp = new Node<E>(d);
	temp.setNext(head);
	head = temp;
    }

    public String toString(){
	String s = "";
	Node<E> temp = head.getNext();
	if (head.getNext() == null){
	    return "null";
	}
	s = s +head.getNext() + " ";
	while ((temp.getNext()) != null){
	    s = s + temp.getNext() + " ";
	    temp = temp.getNext();
	}
	return s;
    }
    
    public void add (int i, E s){
	if (i ==0){
	    add(s);
	    return;
	}
	Node<E> temp = head.getNext();
	for (int j =0; j < i-1; j++){
	    temp = temp.getNext();
	}
	Node<E> d = new Node<E> (s);
	d.setNext(temp.getNext());
	temp.setNext(d);
    }

    public E get(int i){
	Node<E> temp = head.getNext();
	for (int j = 0; j < i; j++){
	    temp = temp.getNext();
	}
	return temp.getData();
    }

    public E set (int i, E s){
	Node<E> temp = head.getNext();
	for (int j = 0; j < i; j++){
	    temp = temp.getNext();
	}
	E returnvalue = temp.getData();
	temp.setData(s);
	return returnvalue;
    }
    
    public E remove (int i){
	if (i<=0){
	    E returnvalue = head.getData();
	    head.setNext(head.getNext().getNext());
	    return returnvalue;
	}
	Node<E> temp = head.getNext();
	for (int j= 0; j < i-1; j++){
	    temp= temp.getNext();
	}
	E returnvalue = temp.getData();
	temp.setNext(temp.getNext().getNext());
	return returnvalue;
    }
    
    public int find (E s){
	if (head.getNext() == null){
	    return -1;
	}
	Node<E> temp = head.getNext();
	int counter = 0;
	while ((temp.getNext()) !=null){
	    if (temp.getData().equals(s)){
		return counter;
	    }
	    temp = temp.getNext();
	    counter +=1;
	}
	return -1;
    }

    public int length (){
	if (head.getNext() == null){
	    return 0;
	}
	Node<E> temp = head.getNext();
	int counter = 1;
	while ((temp.getNext())!=null){
	    temp = temp.getNext();
	    counter +=1;
	}
	return counter;
    }

}
