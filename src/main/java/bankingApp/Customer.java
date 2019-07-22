package bankingApp;

public class Customer {
String fName;
String lName;
Integer accNumber;
double balance;
public Customer(String fName, String lName, int accNumber, double balance) {
	super();
	this.fName = fName;
	this.lName = lName;
	this.accNumber = accNumber;
	this.balance = balance;
}
public Customer() {
	// TODO Auto-generated constructor stub
}
public String getfName() {
	return fName;
}
public void setfName(String fName) {
	this.fName = fName;
}
public String getlName() {
	return lName;
}
public void setlName(String lName) {
	this.lName = lName;
}
public int getAccNumber() {
	return accNumber;
}
public void setAccNumber(int accNumber) {
	this.accNumber = accNumber;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}

}
