package bankingApp;

public class Customer {
String fName;
String lName;
String fName2nd;
String lName2nd;
String username;
String password;

public Customer(String fName, String lName, String fName2nd, String lName2nd, String username, String password,
		Integer accNumber, double balance) {
	super();
	this.fName = fName;
	this.lName = lName;
	this.fName2nd = fName2nd;
	this.lName2nd = lName2nd;
	this.username = username;
	this.password = password;
	this.accNumber = accNumber;
	this.balance = balance;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getfName2nd() {
	return fName2nd;
}
public Customer(String fName2nd, String lName2nd) {
	super();
	this.fName2nd = fName2nd;
	this.lName2nd = lName2nd;
}
public void setfName2nd(String fName2nd) {
	this.fName2nd = fName2nd;
}
public String getlName2nd() {
	return lName2nd;
}
public void setlName2nd(String lName2nd) {
	this.lName2nd = lName2nd;
}
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
