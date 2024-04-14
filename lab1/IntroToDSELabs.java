public class IntroToDSELabs {
   public static void callMethodNamed(LabPrinter printer, String methodName) {
      // Only implement this method after completing step 1
      switch (methodName) {
         case "print2Plus2":
            printer.print2Plus2();
            break;
         case "printSecret":
            printer.printSecret();
            break;
         default:
            System.out.println("Unknown method: " + methodName);
            break;
      }
   }
   
   public static void main(String[] args) {
      LabPrinter printer = new LabPrinter("abc");
      
      // Step 1:
      // Uncomment the block below and submit code for grading. Note that the
      // submission passes the "Compare output" test, but fails each unit test.
      /*
      System.out.println("2 + 2 = 4");
      System.out.println("Unknown method: printPlus2");
      System.out.println("Secret string: \"abc\"");
      */
       
      // After completing step 1:
      // Remove lines of code from step 1 and implement the callMethodNamed() 
      // method above main().
      callMethodNamed(printer, "print2Plus2");
      callMethodNamed(printer, "printPlus2");
      callMethodNamed(printer, "printSecret");
   }
}
