package com.mcnz.bank;

public class Account {
	
	private int accountNumber;
	private java.util.Date createDate;
	private double balance;
	
	public void withdraw(double amount){
		balance = balance-amount;
		
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public java.util.Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(java.util.Date createDate) {
		this.createDate = createDate;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public String toString() {
		return accountNumber + " :: " + balance;
	}

}
