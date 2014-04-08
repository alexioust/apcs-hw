import java.io.*;
import java.util.*;

public class RPN {
    
    private static MyStack stack = new MyStack();
    
    public static int calculate (String s){
	String popvalue = "";
	for (int i = 0; i < s.length(); i++){
	    if (s.substring(i,i+1).equals ("+")){
		add();
	    }
	    if (s.substring(i,i+1).equals ("-")){
		subt();
	    }
	    if (s.substring(i,i+1).equals ("*")){
		mult();
	    }
	    if (s.substring(i,i+1).equals ("/")){
		div();
	    }
	    if (s.substring(i,i+1).equals (" ")){
		if (!(popvalue.equals("+")) && !(popvalue.equals("-"))&&
		    !(popvalue.equals("*")) && !(popvalue.equals("/"))){
		    stack.push(Integer.parseInt(popvalue));
		}
		popvalue = "";
	    }
	    if (!(s.substring(i,i+1).equals (" "))){
		popvalue = popvalue + s.charAt(i);
	    }

	}
	return stack.pop();
    }
    

    public static void add (){
	int temp1 = stack.pop();
	int temp2 = stack.pop();
	int temp3 = temp1 + temp2;
	stack.push(temp3);
    }
    public static void subt (){
	int temp2 = stack.pop();
	int temp1 = stack.pop();
	int temp3 = temp1 - temp2;
	stack.push(temp3);
    }
    public static void mult (){
	int temp1 = stack.pop();
	int temp2 = stack.pop();
	int temp3 = temp1 * temp2;
	stack.push(temp3);
    }
    public static void div (){
	int temp2 = stack.pop();
	int temp1 = stack.pop();
	int temp3 = temp1/temp2;
	stack.push(temp3);
    }

    public static void main (String [] args){
	System.out.println (calculate("1 2 3 4 + * +"));
    }
	
}
    
		
