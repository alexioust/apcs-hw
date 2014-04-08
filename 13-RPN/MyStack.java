public class MyStack {
    // private Node top;
    private int[] stack;
    private int numElts;

    public MyStack (){
	stack = new int[10];
	numElts = 0;
    }
    
    public void push (int s){
	//Node n = new Node(s);
	//	n.setNext(top);
	//	top = n;
	if (numElts >= stack.length){
	    increase();
	}
	stack[numElts] = s;
	numElts = numElts +1;
    }

    public void increase(){
	int [] temp = new int[stack.length];
	int tempsize = stack.length;
	for (int i = 0; i < stack.length; i++){
	    temp [i] = stack[i];
	}
	stack = new int[temp.length*2];
	for (int i = 0; i < temp.length; i++){
	    stack[i] = temp[i];
	}	    
    }

    public int pop(){
	int ret = stack[numElts-1];
	numElts = numElts -1;
	return ret;
    }

    public int peek (){
	return stack[numElts -1];
    }

    public int size(){
	return numElts;
    }

    public boolean isEmpty(){
	if (numElts == 0){
	    return true;
	}
	else return false;
    }
    
    public String toString(){
	String s = "";

	for (int i = 0; i < numElts; i++){
	    s = s + stack[i] + ", ";
	}
	/*	Node temp = top;
		while (temp !=null){
		s = s+ temp.getData() + ", ";
		temp = temp.getNext();
		}
	*/
	return s.substring(0,s.length()-2);
    }
    
}
