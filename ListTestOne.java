/** Abbey Silson 1315323
    Adds integers to a list, then prints the contents of the list on screen*/
public class ListTestOne{
    public static void main(String[] args){
	MyIntList list = new MyIntList(); //creates a new list
	list.add(1); //adds an item, with the value of 1 to the list
	list.add(19);
	list.add(55);
	list.add(4);
	list.add(7);
	list.add(22);
	list.dump(); //prints the current contents of the list to the screen
	list.remove(4); //removes item with the value 4 from the list
	list.remove(55);
	list.remove(1);
	list.remove(7);
	list.dump(); //prints the new contents of the list to the screen
    }
}


	
