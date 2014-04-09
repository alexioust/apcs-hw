import java.io.*;
import java.util.*;

public class RPN {
    
    private static MyStack stack = new MyStack();
    
    public static double calculate (String s){
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
	double temp1 = stack.pop();
	double temp2 = stack.pop();
	double temp3 = temp1 + temp2;
	stack.push(temp3);
    }
    public static void subt (){
	double temp2 = stack.pop();
	double temp1 = stack.pop();
	double temp3 = temp1 - temp2;
	stack.push(temp3);
    }
    public static void mult (){
	double temp1 = stack.pop();
	double temp2 = stack.pop();
	double temp3 = temp1 * temp2;
	stack.push(temp3);
    }
    public static void div (){
	double temp2 = stack.pop();
	double temp1 = stack.pop();
	double temp3 = temp1/temp2;
	stack.push(temp3);
    }

    public static void main (String [] args){
	System.out.println (calculate("1 2 3 4 + * +"));
	System.out.println (calculate ("4 5 5 6 * + - 4 /"));
    }
	
}
    
		
