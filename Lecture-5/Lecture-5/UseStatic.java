//listing 15
// Demonstrate static variables, methods, and blocks.
class UseStatic {
  static int a;
  static int b;
  
  // static int a = 10;
  // static int b = a * 4;
  

  static void meth(int x) {
    System.out.println("x = " + x);
    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }

  
  static {
    System.out.println("Static block initialized.");
    a = 10;
    b = a * 4;
    //static int x =0;
  }
  

  public static void main(String args[]) {
	UseStatic.b = 2;
	UseStatic.meth(42);
    
	UseStatic.b = 2;
    UseStatic.meth(42);
  }
}