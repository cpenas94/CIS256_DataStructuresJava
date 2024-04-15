import java.util.*;
import java.io.PrintWriter;

public class GroceryList {
	protected ArrayList<String> listItems = new ArrayList<String>();
	protected Stack<UndoCommand> undoStack = new Stack<UndoCommand>();

	public void addWithUndo(String newItemName) {
		// Add the new list item
		listItems.add(newItemName);

		// Make an undo command that removes the last item and push onto stack
		undoStack.push(new RemoveLastCommand(listItems));
	}

	public void removeAtWithUndo(int removalIndex) {
	   // Your code here
	   
	   if (removalIndex >= 0 && removalIndex < listItems.size()) {
	      InsertAtCommand insertcommand = new InsertAtCommand(listItems, removalIndex, listItems.get(removalIndex));
	      
	      listItems.remove(removalIndex);
	      undoStack.push(insertcommand);
	   }
	}

	public void swapWithUndo(int index1, int index2) {
		// Your code here
		
		if (index1 >= 0 && index1 < listItems.size() && index2 >= 0 && index2 < listItems.size()) {
		   SwapCommand swapcommand = new SwapCommand(listItems, index1, index2);
		   
		   String temp = listItems.get(index1);
		   listItems.set(index1, listItems.get(index2));
		   listItems.set(index2, temp);
		   
		   undoStack.push(swapcommand);
	   }
	}

   // Pop and execute the command at the top of the stack
	public void executeUndo() {
      // Your code here
      
      if (!undoStack.isEmpty()) {
         UndoCommand undoCommand = undoStack.pop();
         undoCommand.execute();
	  }
	}
	
	final int getListSize() {
		return listItems.size();
	}

	final int getUndoStackSize() {
		return undoStack.size();
	}

	final ArrayList<String> getVectorCopy() {
		return listItems;
	}

	public void print(PrintWriter outputStream) {
		for (int i = 0; i < listItems.size(); i++) {
			outputStream.write(i + ". " + listItems.get(i) + "\n");
		}
	}
}