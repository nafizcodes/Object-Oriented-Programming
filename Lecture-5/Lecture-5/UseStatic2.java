
public class UseStatic2 {

	   static int[] numArray = new int[10];
	   
	   static {
	      System.out.println("Running static initialization block.");
	      for (int i = 0; i < numArray.length; i++) {
	         numArray[i] = (int) (100.0 * Math.random());
	      }
	   }
	   
	   void printArray() {
	      System.out.println("The initialized values are:");
	      for (int i = 0; i < numArray.length; i++) {
	         System.out.print(numArray[i] + " ");
	      }
	      System.out.println();
	   }
	   
	   public static void main(String[] args) {
	      UseStatic2 obj1 = new UseStatic2();
	      System.out.println("For obj1:");
	      obj1.printArray();
	      UseStatic2 obj2 = new UseStatic2();
	      System.out.println("\nFor obj2:");
	      obj2.printArray();  
	   }
}
