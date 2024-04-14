# Sorted number list implementation with linked lists

Step 1: Inspect the Node.java file
Inspect the class declaration for a doubly-linked list node in Node.java. Access Node.java by clicking on the orange arrow next to LabProgram.java at the top of the coding window. The Node class has three fields:

a double data value,
a reference to the next node, and
a reference to the previous node.
Each field is protected. So code outside of the class must use the provided getter and setter methods to get or set a field.

Node.java is read only, since no changes are required.

Step 2: Implement the insert() method
A class for a sorted, doubly-linked list is declared in SortedNumberList.java. Implement the SortedNumberList class's insert() method. The method must create a new node with the parameter value, then insert the node into the proper sorted position in the linked list. Ex: Suppose a SortedNumberList's current list is 23 → 47.25 → 86, then insert(33.5) is called. A new node with data value 33.5 is created and inserted between 23 and 47.25, thus preserving the list's sorted order and yielding: 23 → 35.5 → 47.25 → 86

Step 3: Test in develop mode
Code in main() takes a space-separated list of numbers and inserts each into a SortedNumberList. The list is displayed after each insertion. Ex: If input is

77 15 -42 63.5
then output is:

List after inserting 77: 
77 
List after inserting 15: 
15 77 
List after inserting -42: 
-42 15 77 
List after inserting 63.5: 
-42 15 63.5 77
Try various program inputs, ensuring that each outputs a sorted list.

Step 4: Implement the remove() method
Implement the SortedNumberList class's remove() method. The method takes a parameter for the number to be removed from the list. If the number does not exist in the list, the list is not changed and false is returned. Otherwise, the first instance of the number is removed from the list and true is returned.

Uncomment the commented-out part in main() that reads a second input line and removes numbers from the list. Test in develop mode to ensure that insertion and removal both work properly, then submit code for grading. Ex: If input is

84 72 19 61
19 84
then output is:

List after inserting 84: 
84 
List after inserting 72: 
72 84 
List after inserting 19: 
19 72 84 
List after inserting 61: 
19 61 72 84 
List after removing 19: 
61 72 84 
List after removing 84: 
61 72
