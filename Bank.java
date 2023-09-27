package jspiders;

public interface Bank {
	void deposit(int amount);
	void withdrow(int amount);
	int getBalence();
	String displayErrorMessage();
	
}
