package examples;

class SavingsAccount extends Account {
	public SavingsAccount(long accNum, double balance, String accHolder) {
		super(accNum, balance, accHolder);
		// TODO Auto-generated constructor stub
	}

	final double minbalance = 500;

	public void Withdraw(double y) {
	
		if (getBalance() - y >= minbalance) {
			setBalance(getBalance() - y);
		} else {
			System.out.println("Maintain Minimum Balance Of 500");
		}
	}
}

class CurrentAccount extends Account {

	public CurrentAccount(long accNum, double balance, String accHolder) {
		super(accNum, balance, accHolder);
		// TODO Auto-generated constructor stub
	}

	double overdraftlimit = -150;

	public void Withdraw(double y) {

		if (getBalance() - y < overdraftlimit) {
			System.out.println("over draft limit exceeded");
		} else {
			setBalance(getBalance() - y);
		}
	}
}

class Banking {
	public static void main(String[] args) {
		person p = new person("raj", 21);
		Account a = new Account(123, 5000, "Hitesh");
		System.out.println(a.getAccNum());
		System.out.println(p.getName());
		SavingsAccount sa = new SavingsAccount(15797, 5000, " hit");
		sa.Withdraw(1000);
		System.out.println(sa.getBalance());
		CurrentAccount ca = new CurrentAccount(45647, 500, "mani");
		System.out.println(ca.getBalance());
		ca.Withdraw(500);
		System.out.println(ca.getBalance());
		ca.Withdraw(500);
		System.out.println(ca.getBalance());
		ca.Withdraw(149);
		System.out.println(ca.getBalance());
		System.out.println(a);
	}
}