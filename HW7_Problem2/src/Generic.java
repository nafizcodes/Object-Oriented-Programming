
public class Generic<T extends Number> {  
	T[] nums; // array of Number or subclass 
 
	// Pass the constructor a reference to   
	// an array of type Number or subclass. 
	Generic(T[] obj) {  
	 nums = obj;  
	}  
	// Return type double in all cases. 
	public double average() {  
	 double sum = 0.0; 
	
	 for(int i=0; i < nums.length; i++)  
	   sum += nums[i].doubleValue(); 
	
	 return sum / nums.length; 
	}  
	
	public void display(String name, double avg) {
		System.out.print(name + "average is " + avg);
	}
}  
 