
public class ExcessWithdraw extends Exception {
		/**
	    This constructor uses a generic
	    error message.
		*/
	public ExcessWithdraw()
	{
		super("Error: Excess withdraw amount");
	}
	
	/**
	This constructor specifies the bad withdraw amount in the error message.
	@param The bad starting balance.
	*/

	public ExcessWithdraw(double amount)
	{
		super("Error: Excess withdraw amount: " +
		            amount);
	}
		
}
