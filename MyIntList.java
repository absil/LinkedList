/**Abbey Silson 1315323
This class maintains a dynamic linked list of items, it contains functions which allow a user to add items to the list, check if a list contains a specific int, remove an item from the list, get the length of the list, check if the list is empty, get the first item in the list and print the contents of the list to the screen*/
public class MyIntList{
    private Item head;
    private int size = 0;

    //adds an item of specfied value to the list and increments the size of the list 
    public void add(int x){
	Item temp = new Item(x);
	temp.setNext(head);
	head = temp;
	size++;
	return;
    }

    //returns the number of items currently in the list
    public int length(){
	return size;
    }

    //returns whether or not the specified integer is currently in the list
    public boolean hasItem(int x){
	Item current = head;
	for(int i=0; i < size; i++){
	    if(current.getData() == x)
		return true;
	    current = current.getNext();
	}
	return false;
    }	

    //removes a specified integer from the list
    public void remove(int x){
	if (hasItem(x) == false)//if the given int is not within the list, do nothing
	    return;
	if(head.getData() == x){ //if the item to be removed is the head, set head to the item following head, and decrements the size of the list  
	    head = head.getNext();
	    size--;
	    return;
	}
	Item prev = head; //creates a temp item, called head which stores the item prior to the item being 'looked at' in the list
        Item current = head.getNext(); //creates a temp item to store the current item being 'looked at' in the list
	for (int i=0; i < size; i++){
	    if(current.getData() == x){ //if the current item is equal to the given int, remove the item by setting the previous item's next field to the current item's next field, and decrements the size of the list  
		if(current.getNext() == null){ //if item to be removed is the last in the list, overwrite the current item by setting it to null, and decrements the size of the list  
		    current = null;
		    size--;
		    return;
		}
		prev.setNext(current.getNext()); 
		size--;
		return;
	    }
	    prev = current; //moves along the list by one
	    current = current.getNext(); //moves along the list by one so the next item and the list can be checked 
	}
    }

    //returns whether or not there are any items currently in the list
    public boolean isEmpty(){
	if(length() == 0)
	    return true;
	return false;
    }

    //returns the value of the first item in the list
    public int getFirst(){
	if(isEmpty() == true)
	    return -1;
	return head.getData();
    }

    //prints the contents of the list to the screen
    public void dump(){
	if(isEmpty() == true){
	    System.out.println("List is empty");
	    return;
	}
	Item current = head;
	for(int i=0; i < size; i++){
	    System.out.print(current.getData() + ",");
	    current = current.getNext();
	}
	System.out.println(" ");
    }

    //inserts the given integer into the list, assuming the list is sorted (e.g. before an item that is larger, but after an item that is smaller)
    public void insert(int x){
	Item temp = new Item(x);
	if(isEmpty() == true){ //if there is nothing in the list, add the item
	    head = temp;
	    size++;
	    return;
	}
	if(temp.getData() <= head.getData()){ //if the item being added is smaller than the head item, add the item before the head
	    temp.setNext(head);
	    head = temp;
	    size++;
	    return;
	}
	Item prev = head;
	Item curr = head;
	for(int i = 0; i <= size; i++){
	    if(curr.getData() >= temp.getData()){ //if the next item in the list is larger than the item to be added, add the item at the current position
		prev.setNext(temp);
		temp.setNext(curr);
		size++;
		return;
	    }
	    if(curr.getNext() == null){ //if the end of the list has been reached, add the item to the end of the list
		curr.setNext(temp);
		size++;
		return;
	    }	    
	    prev = curr;
	    curr = curr.getNext();	    
	}
    }    
}

	    
	    
