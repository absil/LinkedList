/** Abbey Silson 1315323
 This class defines the items(nodes) that are used in the linked list, each item stores an integer value and another item, which allows items to create a linked list, as it points to the next item in the list. The class allows both values to be set and retrieved from (get and set)*/
public class Item{
    private int data;
    private Item next ;

    //the constructor for an item
    public Item (int x){
	data = x;
    }

    //returns the value stored in data
    public int getData(){
	return data;
    }
    //sets the value of data to the given integer
    public void setData(int x){
	data = x;
	return;
    }
    //returns the value of next
    public Item getNext(){
	return next;
    }
    //sets the value of next to the given item
    public void setNext(Item x){
	next = x;
	return;
    }
}


    
