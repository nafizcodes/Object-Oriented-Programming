// Dynamic Method Dispatch
class A {
   void callme() {
     System.out.println("Inside A's callme method");
  }
   void callprintA() {
		  System.out.println("Call Print in A");
  }
}

class B extends A {
  // override callme()
  void callme() {
    System.out.println("Inside B's callme method");
  }
  void callprintB() {
	  System.out.println("Call Print in B");
  }
}

class C extends A {
  // override callme()
  void callme() {
    System.out.println("Inside C's callme method");
  }
  void callprintC() {
	  System.out.println("Call Print in C");
  }
}

class Dispatch {
  public static void main(String args[]) {
    A a = new A(); // object of type A
    B b = new B(); // object of type B
    C c = new C(); // object of type C
    A r; // obtain a reference of type A    

    r = a; // r refers to an A object
    r.callme(); // calls A's version of callme
    //a.callprintA();
    r.callprintA();

    r = b; // r refers to a B object
    r.callme(); // calls B's version of callme
    //b.callprintB(); //Correct!!
    b.callme();
    
    //r.callprintB(); //Wrong!!
    
    //r.callprintA(); //Correct

    r = c; // r refers to a C object
    r.callme(); // calls C's version of callme
    c.callprintC();
    //r.callprintC(); //Wrong!!
  }
}

