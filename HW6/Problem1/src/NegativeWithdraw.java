public class NegativeWithdraw extends Exception {
	/**
    This constructor uses a generic
    error message.
	*/
	 public NegativeWithdraw()
	   {
	      super("Error: Negative withdraw amount");
	   }

	   /**
	      This constructor specifies the bad withdraw amount in the error message.
	      @param The bad starting balance.
	   */

	   public NegativeWithdraw(double amount)
	   {
	      super("Error: Negative withdraw amount: " +
	            amount);
	   }
	

}
