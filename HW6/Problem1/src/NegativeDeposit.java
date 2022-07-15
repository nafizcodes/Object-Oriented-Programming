
public class NegativeDeposit extends Exception {
	/**
    This constructor uses a generic
    error message.
	*/
	 public NegativeDeposit()
	   {
	      super("Error: Negative deposit amount");
	   }

	   /**
	      This constructor specifies the bad deposit amount in the error message.
	      @param The bad starting balance.
	   */

	   public NegativeDeposit(double amount)
	   {
	      super("Error: Negative deposit amount: " +
	            amount);
	   }
	

}
