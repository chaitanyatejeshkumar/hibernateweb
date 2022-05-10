package ExceptionsDemo;

// user defined exception class
public class InSufficientFundsException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialversionUID = 1L;
	private double amount;
	public InSufficientFundsException(double amount) {
		this.amount = amount;
	}
	public double getAmount() {
		return amount;
	}
     public void setAmount(double amount) {
    	 this.amount = amount;
     }
}
