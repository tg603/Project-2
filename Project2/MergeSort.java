//import java.lang.Math;
import java.util.*;
public class MergeSort implements Sorter{
	
public void sort(Comparable[] array){
	//Integer Variables
	int n = array.length;
	int counter = 1;
	int i = 0, k = 0; 
	int half = (n / 2);
	int sechalf = n - half;
	//Similar to counter in bubble sort helps later for the last step
	int l = 0;
	//Returns if size is 1
	if(n == 1){
		return;
	}
	//Initalize Two Halves
	Comparable[] Array1 = new Comparable[half];
	Comparable[] Array2 = new Comparable[sechalf];
	
	//Put Array Elements into first half Array
	//For loop is a waste of time for this...
	//ArrayCopy is built in to use instead
	/*
	for(i = 0; i < Array1.length; i++){
		Array1[i] = array[i];
	}
	for(i = half; i < n; i++){
		Array2[k] = array[i];
		k++;
	}
	*/
	//Integers of both halfs length
	int p = Array1.length, r = Array2.length;
	//Copies from the original array starting at the first index
	System.arraycopy(array, 0, Array1, k, p);
	//Copies from the original array where Array1 ends
	//Because this is the second half
	//Puts it into Array2 until hitting the length of Array2
	System.arraycopy(array, p, Array2, k, r);
	//Put Array Elements in second half Array
	//System.out.println(half + 1);
	System.out.println(Arrays.toString(Array1));
	System.out.println(Arrays.toString(Array2));
	//Sort each Array until size is one
	//Recursive call talked about in class today 
	sort(Array1);
	sort(Array2);
	//System.out.println(Arrays.toString(Array1));
	//System.out.println(Arrays.toString(Array2));
		//Comparable[] Array3 = new Comparable[p + r];
		//While loop starts our putting together sequence
		//Makes sure that both i and r are in bounds
		//In perspective of their lengths
		while (i < p && k < r){
			//Like bubble sort it compares the elements lexographically
			//Then adds them into the final array 
			if(Array1[i].compareTo(Array2[k]) < 0){
				Comparable data = Array1[i];
				array[l] = data;
				i++;
				l++;
		}
		//Does this if the 1st Array element isn't bigger than the second
		Comparable data = Array2[k];
		array[l] = data;
		k++;
		l++;
	}
	/*
	for(i = i; i < p - i; i++){
		Array3[l] = Array1[i];
	}
	for(i = k; i < r - i; i++){
		Array3[l] = Array2[k];
	}
	*/
	//Adds the Sorted half to the original array
	System.arraycopy(Array1, i, array, l, p - i);
	//Adds the Sorted second half to the original array	
	System.arraycopy(Array2, k, array, l, r - k);

	//System.out.println(Arrays.toString(array));
}

public static void main (String[] args){
Contact[] friends = new Contact[7];

friends[0] = new Contact ("Zachary", "Smith", "610-555-7384");
friends[1] = new Contact ("Zackary", "Smith", "215-555-3827");
friends[2] = new Contact ("Zachary", "Smith", "733-555-2969");
friends[3] = new Contact ("Laura", "Getz", "663-555-3984");
friends[4] = new Contact ("Larry", "Smith", "464-555-3489");
friends[5] = new Contact ("Frank", "Phelps", "322-555-2284");
friends[6] = new Contact ("Marsha", "Grant", "243-555-2837");

/*
friends[0] = new Contact ("Zachary", "Tanner", "610-555-7384");
friends[1] = new Contact ("Zackary", "Smith", "215-555-3827");
*/
MergeSort sorter = new MergeSort();
sorter.sort(friends);
for (int index = 0; index < friends.length; index++)
System.out.println (friends[index]);
	}
}
