import java.util.*;
public class SelectionSort implements Sorter{
	
public void sort(Comparable[] array){
	//Gets the length of the Array 
		int n = array.length;
		//For loop to keep i in bounds 
		//i is essentially the head reading each current index
		for(int i = 0; i < n; i++){
			//Integer of k is the moving head
			int k = i;
			//System.out.println(k + "=" + i);
			//For loop to compare the index in front of i
			for(int l = i + 1; l < n; l++){
				//Asking if the first array is less than the second
				//compareTo returns positive if array1 > array2 lexicographically (alphabetically ordered)
				//compareTo returns negative if array1 < array2
				//compareTo returns 0 if array1 == array2
				//If statement below is true; array[l] comparing to array[k] is negative
				//Then array[l] is in front of array[k] alphabetically
				
					//if (array[k].compareTo(array[l]) > 0){
					if (array[l].compareTo(array[k]) < 0){
						//makes l equal to k
						//This means i is not equal to k so we can set it in order
						//Swaps for the lowest indexed
						k = l;
						//System.out.println("k is " + k + array[k]);
					}
				}
			//Comparable data is assigned to keep track of data in array[i]
			Comparable data = array[i];
			//Array[i] is overwritten to contain array[k]
			//Puts that indexed data from array[k] into index of array[i]
			//This is the correct placement of array[k]
			array[i] = array[k];
			//assigns the data from the overwritten array[i] into array[k]
			array[k] = data;
			//System.out.println("value of k is: " + k);
			//System.out.println("New Spot after swap of k and i " + array[i] + "  " + array[k]);
		}
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

SelectionSort sorter = new SelectionSort();
sorter.sort(friends);
for (int index = 0; index < friends.length; index++)
System.out.println (friends[index]);
	}
}
