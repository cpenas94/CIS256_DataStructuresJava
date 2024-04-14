
public class SortedNumberList {
	public Node head;
	public Node tail;

	public SortedNumberList() {
		head = null;
		tail = null;
	}

   // Optional: Add any desired private methods here
   
   
	// Inserts the number into the list in the correct position such that the
	// list remains sorted in ascending order.
public void insert(double number) {
    Node newNode = new Node(number); // Create a new node with the given number
    
    // If the list is empty, set the new node as both head and tail
    if (head == null) {
        head = newNode;
        tail = newNode;
        return;
    }
    
    // If the new node's data is less than or equal to the head's data,
    // insert the new node before the head and update the head reference
    if (number <= head.getData()) {
        newNode.setNext(head);
        head.setPrevious(newNode);
        head = newNode;
        return;
    }
    
    // Traverse the list to find the correct position to insert the new node
    Node current = head;
    while (current.getNext() != null && current.getNext().getData() < number) {
        current = current.getNext();
    }
    
    // Insert the new node after the current node
    newNode.setNext(current.getNext());
    if (current.getNext() != null) {
        current.getNext().setPrevious(newNode);
    } else {
        // If the current node is the tail, update the tail reference
        tail = newNode;
    }
    current.setNext(newNode);
    newNode.setPrevious(current);
}


	// Removes the node with the specified number value from the list. Returns
	// true if the node is found and removed, false otherwise.
public boolean remove(double number) {
    // If the list is empty, return false
    if (head == null) {
        return false;
    }
    
    // If the node to be removed is the head
    if (head.getData() == number) {
        head = head.getNext();
        if (head != null) {
            head.setPrevious(null);
        } else {
            // If the head was the only node in the list, update the tail reference
            tail = null;
        }
        return true;
    }
    
    // Traverse the list to find the node with the specified number
    Node current = head;
    while (current != null && current.getData() != number) {
        current = current.getNext();
    }
    
    // If the node with the specified number is not found, return false
    if (current == null) {
        return false;
    }
    
    // If the node to be removed is the tail
    if (current == tail) {
        tail = current.getPrevious();
        tail.setNext(null);
        return true;
    }
    
    // Remove the node from the middle of the list
    Node previousNode = current.getPrevious();
    Node nextNode = current.getNext();
    previousNode.setNext(nextNode);
    nextNode.setPrevious(previousNode);
    return true;
   }

}
