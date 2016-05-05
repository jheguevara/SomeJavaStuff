package com.mcnz.bank;

public class TestAccountBalance {

	public static void main(String[] args) {
		//I'm just hacking out some code for Emma
		//I'm not talking on my line, so don't worry. I haven't started yet!
		
		Account a = new Account();
		a.setBalance(100);
		Account b = new Account();
		b.setBalance(300);
		
		AccountList list = new AccountList();
		list.addAccountA(a);
		list.addAccountB(b);
		System.out.println(list.calcAverageBalance());

	}

}
