import java.util.*;
public class BubbleSort implements Sorter{
	
public void sort(Comparable[] array){
		//Gets the length of the Array 
		//Integer of counter
		int n = array.length, counter;
		//For Loop for counter to know when the Array is sorted
		for(counter = 0; counter < n; counter++){
			//Intializing integers i and k 
			//i is for For loop testing out each index
			//k is the spot in front of the head being compared
			int i, k = 0;
			//For loop checking that we're in bounds
			//Also moving the head
			for(i = 0; i < n && k < n - 1; i++){
				//Assigns k to the spot ahead of the head(i)
				k = i + 1;
				//if statement resetting counter to 0 
				//Essentially restarts the process of Bubble Sort
				if( i == 0){
					counter = 0;
				}
				//for(int k = i + 1; k < n; k++){
					//System.out.println("i orig " + array[i]);
					//If statement compares array[i] to array[k]
					//Similar to SelectionSort just a flipped sign
					if(array[i].compareTo(array[k]) > 0){
						Comparable data = array[i];
						array[i] = array[k];
						array[k] = data;
						//i++;
						//k++;
					//System.out.println("i new " + array[i]);
					} else{//(array[i].compareTo(array[k]) < 0){
						counter = counter + 1;
						//k++;
						//i++;
					}
				//}
			}
		}
		//System.out.println(counter);
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
BubbleSort sorter = new BubbleSort();
sorter.sort(friends);
for (int index = 0; index < friends.length; index++)
System.out.println (friends[index]);
	}
}