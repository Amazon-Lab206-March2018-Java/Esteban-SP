package com.poesteba.bankaccounts;

import java.util.ArrayList;
import java.util.Random;

public class BankAccount {   // Create a BankAccount class
	// The class should have the following attributes: (string) account number, (double) checking balance, (double) savings balance.
	private static int accountsCounter = 0;  //Create a class member (static) that has the number of accounts created thus far.
	private static double allFunds = 0; // Create a class member (static) that tracks the total amount of money stored in every account created.
	private String accountNumber;
	private double checkingBalance;
	private double savingsBalance;
	
	private String newRandAccountNumber() {  // Create a private method that returns a random ten digit account number.
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int a = 0; a<=9;a++) {
			numbers.add(a);
		}
        StringBuilder sb = new StringBuilder(10); // empty string builder with capacity of 10
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int c = numbers.get(random.nextInt(numbers.size()));
            sb.append(c);
        }
        String output = sb.toString();
        return output;
        
//        String number = "";
//		for (int i = 0; i < 10; i++) {
//			int new_num = (int)(Math.random() * 10);
//			number += new_num;
//		}
//		return number;
	}
	
	public BankAccount() {    // creates an empty BankAccount
		accountNumber = newRandAccountNumber(); // In the constructor, call the private method from above so that each user has a random ten digit account.
		checkingBalance = 0;
		savingsBalance = 0;
		BankAccount.accountsCounter++; // In the constructor, be sure to increment the account count.
		System.out.println("The Bank Account #"+accountNumber+" was created successfully");
	}
	public BankAccount(String type, double amount) {
		accountNumber = newRandAccountNumber(); // In the constructor, call the private method from above so that each user has a random ten digit account.
		BankAccount.accountsCounter++;  // In the constructor, be sure to increment the account count.
		if (type == "savings") {
			savingsBalance=amount;
			BankAccount.allFunds+=(amount);
			System.out.println("The Bank Account #"+accountNumber+" was created successfully and the amount of $"+amount+" was deposited in your savings account");
		} else if (type == "checking"){
			checkingBalance=amount;
			BankAccount.allFunds+=(amount);
			System.out.println("The Bank Account #"+accountNumber+" was created successfully and the amount of $"+amount+" was deposited in your checking account");
		}else {
		System.out.println("Please make sure that the type of deposit is either 'savings' or 'checking'");
		}
	}
	public BankAccount(double checking, double savings) {
		accountNumber = newRandAccountNumber();  // In the constructor, call the private method from above so that each user has a random ten digit account.
		checkingBalance = checking;
		savingsBalance = savings;
		accountsCounter++; // In the constructor, be sure to increment the account count.
		BankAccount.allFunds+=(checking+savings);
		System.out.println("The Bank Account #"+accountNumber+" was created successfully, the amount of $"+checking+" was deposited in your checking account and the amount of $"+savings+" was deposited in your savings account");
	}
	public String getAccountNumber() {
		System.out.println("Your account number is: "+accountNumber);
		return accountNumber;
	}
	
	public double getCheckingBalance() {  // Create a getter method for the user's checking account balance.
		System.out.println("Current Checking balance is: "+checkingBalance);
		return checkingBalance;
	}
	public double getSavingsBalance() {  // Create a getter method for the user's saving account balance.
		System.out.println("Current Savings balance is: "+savingsBalance);
		return savingsBalance;
	}
	public double getBalance(String accountType) {  // .
		if (accountType=="savings") {
			System.out.println("Current Savings balance is: "+savingsBalance);
			return getSavingsBalance();			
		} else if (accountType == "checking"){
			System.out.println("Current Checking balance is: "+checkingBalance);
			return getCheckingBalance();			
		}else {
			System.out.println("Please make sure that the type of deposit is either 'savings' or 'checking'");
			return 0;
		}
	}
	public void depositMoney(double checking, double savings) { // Create a method that will allow a user to deposit money into either the checking or saving, be sure to add to total amount stored.
		checkingBalance+=checking;
		savingsBalance+=savings;
		BankAccount.allFunds+=(checking+savings);
		System.out.println("The amount of $"+savings+" was deposited in your savings account");
		System.out.println("The amount of $"+checking+" was deposited in your checking account");
	}
	public void depositMoney(String typeOfBalance, double amount) {  // Create a method that will allow a user to deposit money into either the checking or saving, be sure to add to total amount stored.
		if (typeOfBalance == "savings") {
			savingsBalance+=amount;
			BankAccount.allFunds+=(amount);
			System.out.println("The amount of $"+amount+" was deposited in your savings account");
		} else if (typeOfBalance == "checking"){
			checkingBalance+=amount;
			BankAccount.allFunds+=(amount);
			System.out.println("The amount of $"+amount+" was deposited in your checking account");
		}else {
			System.out.println("Please make sure that the type of deposit is either 'savings' or 'checking'");
		}
	}
	public void withdrawMoney(String accountType, double amount) {
		if (accountType=="savings"||accountType=="checking") {
			if (amount<=this.getBalance(accountType)) {
				if (accountType=="savings") {
					savingsBalance-=amount;
					System.out.println("The amount of $"+amount+" was withdrawn from your savings account");
				}else if (accountType=="checking"){
					checkingBalance-=amount;
					System.out.println("The amount of $"+amount+" was withdrawn from your checking account");
				}
				BankAccount.allFunds-=(amount);
			}else {
				System.out.println("You don't have enough funds for the transaction");
			}
		}else {
			System.out.println("Please make sure that the type of withdrawal is either 'savings' or 'checking'");
		}
	}
	public double getTotalFunds() {
		System.out.println("Current Savings balance is: $"+savingsBalance);
		System.out.println("Current Checking balance is: $"+checkingBalance);
		System.out.println("Your Total balance is: $"+(savingsBalance+checkingBalance));
		return savingsBalance+checkingBalance;
	}
	public static double getAllBankFunds() {
		System.out.println("This Bank has a total balance of: $"+BankAccount.allFunds);
		return BankAccount.allFunds;
	}
	public static double getAllBankAccoutns() {
		System.out.println("This Bank has a total of "+BankAccount.accountsCounter+" created acounts");
		return BankAccount.allFunds;
	}
}
