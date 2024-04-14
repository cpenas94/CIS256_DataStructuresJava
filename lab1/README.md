Step 1: Producing correct output
Three commented-out lines of code exist in main(). Uncomment the lines and click the "Run program" button. Verify that the program's output is:

2 + 2 = 4
Unknown method: printPlus2
Secret string: "abc"
Submit your code for grading. Your submission will pass the "Compare output" test only, achieving 1 of the possible 10 points.

Step 2: Inspecting the LabPrinter class
Inspect the LabPrinter class implemented in the LabPrinter.java file. Access LabPrinter.java by clicking on the orange arrow next to IntroToDSELabs.java at the top of the coding window. Methods print2Plus2() and printSecret() print strings using System.out.println().

Step 3: Implementing callMethodNamed()
Remove the three uncommented lines from main(). Then implement the callMethodNamed() method in IntroToDSELabs.java to handle three cases:

If methodName is "print2Plus2", call printer's print2Plus2() method.
If methodName is "printSecret", call printer's printSecret() method.
If methodName is anything other than the two strings mentioned above, print "Unknown method: xyz", where xyz is methodName's value.
After implementing callMethodNamed(), click the "Run program" button. Verify that the program's output is, once again:

2 + 2 = 4
Unknown method: printPlus2
Secret string: "abc"
Step 4: Submitting code for 10/10 points
Once callMethodNamed() is properly implemented, submitting the code should receive 10 out of 10 points. The program's output is exactly the same as the implementation from step 1. But step 3's implementation uses the LabPrinter object and step 1 does not.

Step 5: Understanding the difference
The unit test uses a different implementation of LabPrinter than what's shown in LabPrinter.java. Calls to each method are tracked, so the unit test determines whether or not callMethodNamed() was actually implemented according to lab requirements.

Most labs in this material are similar. Program output matters, but how the output is achieved matters more. Methods you implement will commonly require use of an object passed as a parameter.
