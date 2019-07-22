package bankingApp;
import java.util.*;



public class customerBanking {
	
public static  ArrayList<Customer>Customers = new ArrayList();
public static ArrayList<String>custSearch = new ArrayList();
public static String yes = "yes";
public static final int MAX = 99999;
static boolean bank = true;
public static enum choices {Bank,Account,Admin;}
public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
while(bank) {
	System.out.println("      Bank        Account          Admin");
	System.out.println("========================================================");
	System.out.println("");
	System.out.println("Please make a selection");
	String choice= scan.nextLine();
	switch(choice.toUpperCase()) {
	case "BANK":
		custBanking();
	break;
	case "ACCOUNT":
		OpenAcct();
	break;
	case "ADMIN":
		Admin();
	break;
	}	
System.out.println("Continue banking?");
String check = scan.nextLine();
if(check.toLowerCase().equals(yes)) 
{bank = true;} 
}                             //while loop
	}//main
public static void OpenAcct() {
	Random rnd = new Random();
	System.out.println("Please enter last name");
	String fnam= scan.nextLine();
	System.out.println("Please enter first name");
	String lnam= scan.nextLine();
	System.out.println("($500.00 minimun)  Enter initial deposit amount:");
	double initdep= scan.nextDouble();
	Customer cust = new Customer();
	cust.fName=fnam;
	cust.lName=lnam;
	cust.accNumber=  rnd.nextInt(MAX);
	cust.balance=initdep;
    Customers.add(cust);
    System.out.println(cust.fName+ " your account number is "+cust.getAccNumber());
}


public static void custBanking() {
	System.out.println("enter account#");
	int acct = scan.nextInt();
	Customer cust = new Customer();
	for(int x = 0;x<Customers.size();x++) {
		cust = Customers.get(x);
		int xx = cust.getAccNumber();
		if(xx==acct) {
			System.out.println("withdrawal deposit transfer?");
			String answ = scan.nextLine();
			switch(answ.toLowerCase()) {
			case "withdrawal":
				double cc=cust.balance;
				System.out.println("withdrawal almount: ");
				double yy=scan.nextDouble();
				cust.setBalance(cc-yy);
				Customers.add(cust);
				break;
			case "deposit": 
			    double dd=cust.balance;
				System.out.println("deposit amount: ");
				double ww=scan.nextDouble();
				cust.setBalance(dd-ww);
				Customers.add(cust);
				break;
			case "transfer":
//			
				break;
			}
		}
		
		}
}

public static void Admin() {
	Customer s = new Customer();
	for(int x = 0;x<Customers.size();x++) {
		s = Customers.get(x);
		int xx = s.getAccNumber();
		}
	}
	

public static void withdrawalMethod(Customer cust) {
	
	double d = cust.getBalance();
	System.out.println("your balance is :"+d);
	System.out.println("enter withdrawal amount: ");
	double c = scan.nextDouble();
	d = d-c;
	cust.setBalance(d);
	System.out.println("new balance is: "+cust.getBalance());
	
}


}

