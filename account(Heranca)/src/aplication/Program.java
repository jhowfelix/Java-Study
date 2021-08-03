package aplication;

import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		Account account1 = new Account(19, "Jonathan Felix", 2000.0);
		BusinessAccount BusinessAccount1 = new BusinessAccount(19, "Jonathan Felix", 2000.0, 2500.0);
		SavingsAccount account3 = new SavingsAccount(20, "Jonathan", 5000.0, 50.0);
		
		
		// UPCASTING
		// ARMAZENAR UMA SUBCLASSE EM UMA VARIAVEL DO TIPO SUPERCLASSE.
		Account BusinessAccount2 = BusinessAccount1;
		Account account4 = account3;

		System.out.println(account3);
		// DOWNCASTING
		// ARMAZENAR UMA SUPERCLASSE EM UMA VARIAVEL DO TIPO SUBCLASSE
	
		if(account1 instanceof BusinessAccount) {
			BusinessAccount acc4 = (BusinessAccount) account1;
			
		}
		
		if(account3 instanceof SavingsAccount) {
			SavingsAccount account5 = (SavingsAccount)account3;
			account5.updateBalance();
			System.out.println("update");
		}
		
		sc.close();
	}

}
