import java.util.ArrayList;

public class SwapCommand extends UndoCommand {
	// Your field declarations here
	
	private ArrayList<String> sourceList;
	private int index1;
	private int index2;
	private String itemAtIndex1;
	private String itemAtIndex2;
	
	
	// Your constructor code here
	
	public SwapCommand(ArrayList<String> sourceList, int index1, int index2) {
	   this.sourceList = sourceList;
	   this.index1 = index1;
	   this.index2 = index2;
	   this.itemAtIndex1 = sourceList.get(index1);
	   this.itemAtIndex2 = sourceList.get(index2);
	}
	
	@Override
	public void execute() {
		// Your code here
		
      String temp = sourceList.get(index1);
      sourceList.set(index1, sourceList.get(index2));
      sourceList.set(index2, temp);
	}
}
