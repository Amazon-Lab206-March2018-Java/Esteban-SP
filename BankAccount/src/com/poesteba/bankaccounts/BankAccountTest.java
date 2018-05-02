package com.poesteba.bankaccounts;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount();  // empty account
		BankAccount account2 = new BankAccount(250.45,120.50);  // savings and checking balances
		BankAccount account3 = new BankAccount("savings", 275);  // only savings
		BankAccount account4 = new BankAccount("checking", 275);  // only checking
		System.out.println("****Account 1****");
		account1.depositMoney("savings", 175);
		account1.depositMoney("checking", 475);
		System.out.println(account1.getTotalFunds());
		System.out.println("****Account 2****");
		account2.withdrawMoney("savings", 250);
		account2.withdrawMoney("checking", 121);
		System.out.println(account2.getTotalFunds());
		System.out.println("****Account 3****");
		account3.withdrawMoney("savings", 250);
		account3.withdrawMoney("checking", 121);
		System.out.println(account3.getSavingsBalance());
		System.out.println("****Account 4****");
		account4.withdrawMoney("savings", 250);
		account4.withdrawMoney("checking", 121);
		System.out.println(account4.getCheckingBalance());
	}

}
