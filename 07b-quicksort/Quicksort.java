import java.util.*;
import java.io.*;

public class Quicksort {

    public static int[] qsort (int[] L){
	if (L.length <= 1){
	    return L;
	}
	int pivotindex = (int)(L.length/2);
	int pivot = L[pivotindex];
	ArrayList<Integer> low = new ArrayList<Integer>();
	ArrayList<Integer> high = new ArrayList<Integer>();
	for (int i = 0; i < pivotindex; i++){
	    if (L[i] <= pivot){
		low.add (L[i]);
	    }
	    if (L[i] > pivot){
		high.add (L[i]);
	    }
	}
	for (int i = pivotindex+1; i < L.length; i++){
	    if (L[i] <= pivot){
		low.add (L[i]);
	    }
	    if (L[i] > pivot){
		high.add (L[i]);
	    }
	}
	int[] lowarray = new int[low.size()];
	int []higharray = new int[high.size()];
	for (int i = 0; i < low.size(); i++){
	    lowarray[i] = low.get(i);
	}
	for (int i = 0; i< high.size(); i++){
	    higharray[i] = high.get(i);
	}
	
	lowarray= qsort(lowarray);
	higharray= qsort (higharray);
	int counter = 0;
	for (;counter < lowarray.length; counter++){
	    L[counter] = lowarray[counter];
	}
	L[counter] = pivot;
	for (int i =0; i < higharray.length; i++){
	    L[counter+1+i] = higharray[i];
	}
	return L;
    }
    
    public static int[] qsort2 (int [] a){

	partition (a, 0, a.length-1);
	return a;
	
    }

    public static int partition (int [] a, int L, int R){
	if ((R-L) <=0){
	    return L;
	}
	if ((R-L) <=1){
	    if (a[R] < a[L]){
		int h = a[R];
		a[R] = a[L];
		a[L] = h;
	    }
	    return L;
	}
	int pivotindex = (int)(L + (Math.random() * (R-L)));
	int pivot = a[pivotindex];
	int temp = a[R];
	a[R] = pivot;
	a[pivotindex] = temp;
	int wall = L;
	for (int i = L; i < R; i++){
	    if (a[i] < pivot){
		temp = a[wall];
		a[wall] = a[i];
		a[i] = temp;
		wall= wall +1;
	    }
	}
	int wall2 = wall;
	for (int j = wall; j < R; j++){
	    if (a[j] == pivot){
		temp = a[wall2];
		a[wall2] = a[j];
		a[j] = temp;
		wall2 = wall2 + 1;
	    }
	}

	//temp = a[wall];
	//	a[wall] = pivot;
	//	a[R] = temp;
	partition (a, L, wall);
	partition (a, wall2,R);
	return wall;
    }
    
    public static void main (String [] args){
	int[] stuff = {9,7,6,8,2,7,8,4,7,1,0};
	int[] stuff2 = {9,7,6,8,2,7,8,4,7,1,0,7,8,4,6,7,4,1,5,6,32,4,8,5,3,4,5,7,4,4,8,4,2,6,7,23,3,3,2,6,7,3,1,7,8,1,6,8,8};
	System.out.println(Arrays.toString(qsort(stuff)));
	System.out.println(Arrays.toString(qsort2(stuff2)));
    }
}
