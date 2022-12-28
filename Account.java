package examples;

public class Account {

	public long accNum;
	public double balance;
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + "]";
	}

	public String accHolder;

	public Account(long accNum, double balance, String accHolder) {
		super();
		this.accNum = accNum;
		this.setBalance(balance);
		this.accHolder = accHolder;
	}

//methods//
	public void Deposit(double x) {
		setBalance(getBalance() + x);
	}

	public void Withdraw(double y) {
		if (getBalance() == 0.0d) {
			System.out.println("Insufficient Funds");
		} else if((getBalance() - y) >= 0) {
			setBalance(getBalance() - y);
		} else {
		
			System.out.println("Insufficient
		}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}

class person {
	public person(String name, float age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String name;
	public float age;

	// methods//
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}
}
