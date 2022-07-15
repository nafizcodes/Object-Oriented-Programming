public class GenericTest {  
	public static void main(String args[]) {  
	
	 Integer inums[] = { 1, 2, 3, 4, 5 }; 
	 Generic <Integer> integerobj = new Generic <Integer>(inums);   
	 double intavg = integerobj.average();
	 integerobj.display("Integer ", intavg);
	 
	
	 Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 }; 
	 Generic <Double> doubleobj = new Generic <Double>(dnums);   
	 double doubavg = doubleobj.average();
	 doubleobj.display("\nDouble ", doubavg);
	
	} 
}