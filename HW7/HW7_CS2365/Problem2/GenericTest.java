public class GenericTest{  
	public static void main(String args[]) {  
	
	 Integer inums[] = { 100, 200, 300, 400, 500 }; 
	 Generic <Integer> integerobj = new Generic <Integer>(inums);   
	 double intavg = integerobj.average();
	 integerobj.display("Integer ", intavg);
	 
	
	 Double dnums[] = { 100.1, 200.2, 300.3, 400.4, 500.5 }; 
	 Generic <Double> doubleobj = new Generic <Double>(dnums);   
	 double doubavg = doubleobj.average();
	 doubleobj.display("\nDouble ", doubavg);
	} 
}