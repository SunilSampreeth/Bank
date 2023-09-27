package jspiders;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Bank b= new  BankImpl(5000);

		while(true) {

			System.out.println("1.Deposit Amount\n2.Withdrow Amount\n3.Check Balence\n4.Exit");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();

			switch(choice) {
			case 1: 
				System.out.println("Enetr Amount to be Deposite ");
				int amountToDeopsit=sc.nextInt();
				b.deposit(amountToDeopsit); // bank.deposite(sc.nextInt());
				break;

			case 2: 
				System.out.println("Enetr Amount to be Withdrow ");
				int amountToWithdrow=sc.nextInt();
				b.withdrow(amountToWithdrow); // bank.Withdrow(sc.nextInt());
				break;

			case 3: 
				System.out.println("Available Balence "+b.getBalence());
				break;


			case 4: 
				System.out.println("thank you ");
				System.exit(0);

			default :
				System.out.println(b.displayErrorMessage());
			}
			System.out.println("-----------------------------");
		}
	}
}
