// This is now correct.
public class ThrowsDemo1 {
  static void throwOne() throws IllegalAccessException {
	//static void throwOne()  {
    System.out.println("Inside throwOne.");
    throw new IllegalAccessException("demo");
  }
  public static void main(String args[]) {
    //throwOne();

	  try {
      throwOne();
    } catch (IllegalAccessException eooo) {
      System.out.println("Caught " + eooo);
    }
  }
}

