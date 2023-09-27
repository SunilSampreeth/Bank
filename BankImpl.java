package jspiders;

public class BankImpl implements Bank {
 private int balance;

 BankImpl(int balance) {
	
	this.balance = balance;
}
  public void deposit(int amount) {
	  
	  System.out.println("Deposite Rs "+amount);
	  balance=balance+amount;
	  System.out.println("amount deposite succesfull");
  }
  
 public  void withdrow(int amount) {
	 if(amount<=balance) {
	 System.out.println("Withdrow Rs "+amount);
	  balance=balance-amount;
	  System.out.println("amount withdrow succesfull");
 }
 
 else {
	 //invoke an exception and handle it using try and catch black
	 //InsufficiantBalanceException
	 
	 try {
		 throw new InsufficientBalanceException("Insufficieant balance");
	 }
	 catch(Exception e) {
		 System.out.println(e.getMessage());
	 }
 }
 }
	public  int getBalence() {
		return balance;
	}
	public String displayErrorMessage()
	{
		return "invalid choice ,please enter valid coice";
	}
	 

 }
 
 


