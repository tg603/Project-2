//********************************************************************
///InsertionSort.java
//
// Provide a specific implementation of the sorter interface
//********************************************************************
public class InsertionSort implements Sorter{
	public void sort(Comparable[] array){
	int n = array.length;
		for (int j = 1; j < n; j++) {
		Comparable k = array[j];
		// Insert array[j] into the sorted sequence array[0..j-1].
		int i = j-1;
			while (i >= 0 && array[i].compareTo(k) > 0) {
			array[i+1] = array[i];
			i--;
			}
		array[i+1] = k;
		}
	}
}
