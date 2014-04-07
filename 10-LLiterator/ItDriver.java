import java.io.*;
import java.util.*;

public class ItDriver {
    public static void main(String[] args){
	MyLinkedList<String> L = new MyLinkedList<String>();

	L.add("one");
	L.add("two");
	L.add("three");
	L.add("four");

	Iterator<String> it = L.iterator();
	while (it.hasNext())
	    System.out.println(it.next());
	System.out.println();
	for (String s : L)
	    System.out.println(s);

    }
}
