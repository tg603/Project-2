public class Testing{
public static void main (String[] args){
Contact[] friends = new Contact[7];
//Making sure it sorts the given list first
friends[0] = new Contact ("Zachary", "Smith", "610-555-7384");
friends[1] = new Contact ("Zackary", "Smith", "215-555-3827");
friends[2] = new Contact ("Zachary", "Smith", "733-555-2969");
friends[3] = new Contact ("Laura", "Getz", "663-555-3984");
friends[4] = new Contact ("Larry", "Smith", "464-555-3489");
friends[5] = new Contact ("Frank", "Phelps", "322-555-2284");
friends[6] = new Contact ("Marsha", "Grant", "243-555-2837");


//Let’s try insertion sort first...
//InsertionSort sorter = new InsertionSort();
//SelectionSort sorter = new SelectionSort();
//MergeSort sorter = new MergeSort();
BubbleSort sorter = new BubbleSort();
sorter.sort(friends);
for (int index = 0; index < friends.length; index++)
System.out.println (friends[index]);

//My own samples for each one
//Tests bubble sort
Contact[] bubble = new Contact[8];
bubble[0] = new Contact ("Frank", "Tith", "610-555-7384");
bubble[1] = new Contact ("Peter", "Smithers", "215-555-3827");
bubble[2] = new Contact ("Lenny", "Jones", "733-555-2969");
bubble[3] = new Contact ("Laura", "Getz", "663-555-3984");
bubble[4] = new Contact ("Larry", "Smith", "464-555-3489");
bubble[5] = new Contact ("Frank", "Phelps", "322-555-2284");
bubble[6] = new Contact ("Marsha", "Grant", "243-555-2837");
bubble[7] = new Contact ("Marsha", "Grant", "243-555-2837");


	
sorter.sort(bubble);
for (int index = 0; index < bubble.length; index++)
System.out.println (bubble[index]);
	
	
Contact[] select = new Contact[9];
select[0] = new Contact ("Frank", "Tith", "610-555-7384");
select[1] = new Contact ("Peter", "Smithers", "215-555-3827");
select[2] = new Contact ("Lenny", "Jones", "733-555-2969");
select[3] = new Contact ("Laura", "Getz", "663-555-3984");
select[4] = new Contact ("Larry", "Smith", "464-555-3489");
select[5] = new Contact ("Frank", "Phelps", "322-555-2284");
select[6] = new Contact ("Marsha", "Grant", "243-555-2837");
select[7] = new Contact ("Marsha", "Grant", "243-555-2837");
select[8] = new Contact ("Xeno", "Gerard", "244-555-2836");

sorter.sort(select);
for (int index = 0; index < select.length; index++)
System.out.println (select[index]);

	
Contact[] Merge = new Contact[10];
Merge[0] = new Contact ("Frank", "Tith", "610-555-7384");
Merge[1] = new Contact ("Peter", "Smithers", "215-555-3827");
Merge[2] = new Contact ("Lenny", "Jones", "733-555-2969");
Merge[3] = new Contact ("Laura", "Getz", "663-555-3984");
Merge[4] = new Contact ("Larry", "Smith", "464-555-3489");
Merge[5] = new Contact ("Frank", "Phelps", "322-555-2284");
Merge[6] = new Contact ("Marsha", "Grant", "243-555-2837");
Merge[7] = new Contact ("Marsha", "Grant", "243-555-2837");
Merge[8] = new Contact ("Xeno", "Gerard", "244-555-2836");
Merge[9] = new Contact ("Romeo", "Alpha", "244-555-2836");

sorter.sort(Merge);
for (int index = 0; index < select.length; index++)
System.out.println (Merge[index]);
}
}