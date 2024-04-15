import java.util.ArrayList;

public class InsertAtCommand extends UndoCommand {
	// Your field declarations here
	
	private ArrayList<String> sourceList;
	private int insertIndex;
	private String newItem;
	
	// Your constructor code here
	
	public InsertAtCommand(ArrayList<String> sourceList, int insertIndex, String newItem) {
	   this.sourceList = sourceList;
	   this.insertIndex = insertIndex;
	   this.newItem = newItem;
	}
	
	@Override
	public void execute() {
		// Your code here
		
		if (insertIndex >= 0 && insertIndex <= sourceList.size()) {
		   sourceList.add(insertIndex, newItem);
	   }
   }
   
}
