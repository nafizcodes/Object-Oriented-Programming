/**
   This program demonstrates how the BankAccount
   class constructor throws custom exceptions.
*/

public class AccountTest
{
   public static void main(String [] args)
   {
      // Force a NegativeStartingBalance exception.
      try
      {
         BankAccount account =
                     new BankAccount(1000.0);
         account.deposit(200);
         //account.deposit(-200);
         
         //account.withdraw(-100);
         
         account.withdraw(500000);
 
      }
      catch(NegativeStartingBalance e)
      {
         System.out.println(e.getMessage());
      }
      
      catch(NegativeDeposit e) 
      {
    	 System.out.print(e.getMessage());
      }
      catch(NegativeWithdraw e) 
      {
    	  System.out.print(e.getMessage());
      } 
      catch (ExcessWithdraw e) {
    	  System.out.print(e.getMessage());
	}
   }
}