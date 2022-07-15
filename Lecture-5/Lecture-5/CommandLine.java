//listing 26
// Display all command line arguments.
class CommandLine {
  public static void main(String[] args) {
    
	  for(int i=0; i<args.length; i++)
      		System.out.println("args[" + i + "]: " +  args[i]);

  	  //System.out.println("args[0]= " + args[0]);
  		int a = 5;
  		if (args[0].equals("10")) System.out.println("a = " + (a+10));
  		if (args[0].equals("20")) System.out.println("a = " + (a+20));
 
  }
}