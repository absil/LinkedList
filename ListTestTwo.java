/** Abbey Silson
    creates 2 lists filled with 50 random integers, then adds the intersection of the 2 lists into a third, seperate list*/

import java.util.Random; 
public class ListTestTwo{
    public static void main(String[] args){
	Random rand = new Random(); //creates a new random number generator
	MyIntList list1 = new MyIntList(); //creates a new list
	MyIntList list2 = new MyIntList(); //creates a new list
	MyIntList intersection = new MyIntList(); //creates a new list to store the intersection

	//adds 50 random values to the 2 lists
	for(int i=0; i < 50; i++){
	    int j = rand.nextInt(100) + 1;
	    int k = rand.nextInt(100) + 1;
	    list1.add(j);
	    list2.add(k);
	}

	//prints the contents of both lists to the screen
	list1.dump();
	list2.dump();

	//checks if the value of the first item in list 2 can be found in list 1, if it is, then add this value into the intersection list and remove the first item from list2. Continues this for the length of list 2
	for(int i=0; i < list1.length(); i++){
	    if(list1.hasItem(list2.getFirst()) == true)
		intersection.add(list2.getFirst());
	    list2.remove(list2.getFirst());
	}
	System.out.println(" ");
	intersection.dump(); //print out the intersection list to the screen
    }
}    
