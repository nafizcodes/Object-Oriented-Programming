// Demonstrate a type wrapper. 
class Wrap { 
  public static void main(String args[]) { 
     
    Integer iOb = new Integer(100);  
 
    int i = iOb.intValue(); 
 
    System.out.println(i + " " + iOb); // displays 100 100 
    
    System.out.println("i toString() " + iOb.toString());
    
    //Boolean bOb = new Boolean("true");
    
    Boolean bOb = new Boolean(true);
    
    System.out.println("boolean" + " " + bOb.booleanValue());
 
  } 
}


