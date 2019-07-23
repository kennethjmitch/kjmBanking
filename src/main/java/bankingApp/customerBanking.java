package bankingApp;
import java.util.*;



public class customerBanking {
	
public static  ArrayList<Customer>Customers = new ArrayList();







public static ArrayList<String>custSearch = new ArrayList();
public static String yes = "yes";
public static String fnam;
public static int acct;
public static String answ;
public static String lnam;
public static String WITHDRAWAL = "WITHDRAWAL";
public static String username;
public static String APPROVE = "APPROVE";
public static String password;
public static String pss = "BANKER";
public static double initdep;
public static final int MAX = 9999999;
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
		Scanner meh = new Scanner(System.in);
		System.out.println("Employee or Management?");
		String resp = meh.nextLine();
		if(resp.toUpperCase()=="MANAGEMENT") {
		Admin();}else {employee();}
	break;
	}	
System.out.println("Continue banking?");
String check = scan.nextLine();
if(check.toLowerCase().equals(yes)) 
{bank = true;} 
}                             //while loop
	}//main
public static void OpenAcct() {
	
	Scanner ch= new Scanner(System.in);
	System.out.println("Joint account? yes/no: ");
	String answr = ch.nextLine();
	if(answr.toLowerCase()=="yes") {
	System.out.println("Please enter last name");
    fnam= scan.nextLine();
	System.out.println("Please enter first name");
	String lnam= scan.nextLine();
	System.out.println("Please enter second persons last name");
	String fnam2= scan.nextLine();
	System.out.println("Please enter second persons first name");
	String lnam2= scan.nextLine();
	System.out.println("($500.00 minimun)  Enter initial deposit amount:");
	double initdep= scan.nextDouble();
	System.out.println("please wait for approval: ");
	employee( fnam,lnam, initdep);
	
	
	}else {
		System.out.println("Please enter last name");
		String fnam= scan.nextLine();
		System.out.println("Please enter first name");
		String lnam= scan.nextLine();
		System.out.println("Please enter username");
		username= scan.nextLine();
		System.out.println("Please enter password name");
		String password= scan.nextLine();
		System.out.println("($500.00 minimun)  Enter initial deposit amount:");
	    initdep= scan.nextDouble();
		System.out.println("please wait for approval: ");
		employee( fnam,lnam, initdep);
		
		
	}
	
	
}

public static void employee(String fnam,String lnam, double initdep) {
	Scanner totally=new Scanner (System.in);
	System.out.println(fnam+" "+lnam+" has a deposit of :"+initdep +" Approve or Deny: ");
	String rep = totally.nextLine();
	//if(response.equals(APPROVE)){
		System.out.println("Congratulations!!  you have been approved");
		Customer cust = new Customer();
		cust.username=username;
		cust.password=password;
		cust.fName=fnam;
		cust.lName=lnam;
		Random rnd = new Random();
		cust.accNumber=rnd.nextInt(MAX);
		cust.balance=initdep;
	    Customers.add(cust);
	    System.out.println(cust.fName+ " your account number is "+cust.getAccNumber());
	//}else {
	//	System.out.println(" Sorry you have insufficient.  Account denied.");
	//	  System.exit(0);
	//}
		
}



public static void custBanking() {
	System.out.println("enter account#");
    acct = scan.nextInt();
	Customer cust = new Customer();
	for(int x = 0;x<Customers.size();x++) {
		cust = Customers.get(x);
		int xx = cust.getAccNumber();
		if(xx==acct) {
			System.out.println("withdrawal deposit transfer?");
			Scanner lastry= new Scanner(System.in);
		answ = lastry.nextLine();
			System.out.println(answ);
			}
			switch (answ) {
			case "WITHDRAWAL": 
				withdrawal(cust);
				break;
			case "DEPOSIT": 
		    double dd=cust.balance;
			System.out.println("deposit amount: ");
			double ww=scan.nextDouble();
		cust.setBalance(dd+ww);
			Customers.add(cust);
			System.out.println(cust.getBalance());
			break;
		case "TRANSFER":
            System.out.println("enter account to transfer from: ");
             int accxxx = scan.nextInt();
             System.out.println("enter account to transfer to: ");
             int accyyy = scan.nextInt();
             System.out.println("enter ammount to transfer: ");
             double xamnt=scan.nextDouble();
             for(int x1 =0;x1<Customers.size();x1++) {
            	 Customer c = new Customer();
            	 c = Customers.get(x1);
            	 int checkxxx=c.getAccNumber();
            	 if(checkxxx==accxxx) 
            	 {double xfromx=c.balance;
            	 c.setBalance(xfromx-xamnt);
            	 }
            	 if(checkxxx==accyyy) 
            	 {double xtox=c.balance;
            	 c.setBalance(xtox+xamnt);
            	 
            	 }   	 
             }
				break;
			}
		}}
		
		


public static void Admin() {
	System.out.println("Banking    View(account)");
	String choice=scan.nextLine();
	switch(choice.toLowerCase()) {
	case "banking":
		custBanking();
		break;
	case "view":
		employee();
		break;
	
	
	}


	}
	
 public static void withdrawal(Customer cust) {
	double cc=cust.balance;
	System.out.println("withdrawal almount: ");
	double yy=scan.nextDouble();
	cust.setBalance(cc-yy);
	Customers.add(cust);
	System.out.println(cust.getBalance());
	}


public static void employee() {
	Scanner blah = new Scanner(System.in);
	System.out.println("enter a account number to view balance: ");
	int accxxx = blah.nextInt();
	Customer mey = new Customer();
	for(int x=0;x<Customers.size();x++) {
		mey=Customers.get(x);
		if(mey.accNumber==accxxx) {System.out.println(mey.fName+" "+mey.lName+" has a balance of "+mey.getBalance());};
		
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

