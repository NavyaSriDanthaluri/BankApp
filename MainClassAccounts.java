package entity;
import java.util.Scanner;
import entity.Accounts;
import entity.KYCVerification;
import entity.ContactDetails;

public class MainClassAccounts {
	Accounts allAccounts[]=new Accounts[50000];
	int noOfAccounts=0;
	
	Scanner sc=new Scanner(System.in);
	Scanner scStr=new Scanner(System.in);
	private String emailId;
	private String houseNumber;
	private String cityName;
	private String stateName;
	private long pinCode;
	private String localityName;
	private long mobileNumber;
	private String panNumber;
	private long adharNumber;
	private String documentType;
	private long documentNo;
	private KYCVerification kycDetails;
	private int cashBack;
	private ContactDetails contactDetails;
	private long accountNumber;
	private String passWord;
	private int balance;
	private KYCVerification KycDetails;
	
	public static void main(String[] args) {
		MainClassAccounts mca=new MainClassAccounts();
		
		
		while(true) {
			System.out.println("-----Task to be performed-----");
			System.out.println("1.Add user details");
			System.out.println("2.Deposit operation");
			System.out.println("3.User contact details");
			System.out.println("4.User KYC details");
			System.out.println("5.User balance");
			System.out.println("6.Change mobile number");
			System.out.println("7.Change email id");
			
			System.out.println("Choose your option(1-7):-");
			
			switch(mca.sc.nextInt()) {
			case 1:
				mca.addUserDetails();
				break;
			case 2:
				mca.deposit();
				break;
			case 3:
				mca.userContactDetails();
				break;
			case 4:
				mca.userKycDetails();
				break;
			case 5:
				mca.userBalance();
				break;
			case 6:
				mca.changeMobileNumber();
				break;
			case 7:
				mca.changeEmailId();
				break;
		    default:
		    	System.out.println("Exit");
		    	System.exit(0);
			}
		}
	}
	public void addUserDetails()
	{
		System.out.println("Enter pan number:-");
		String pan=scStr.nextLine();
		System.out.println("Enter adhar number:-");
		long adharNo=sc.nextInt();
		System.out.println("Enter document type:-");
		String docType=scStr.nextLine();
		System.out.println("Enter document number:-");
		long docno=sc.nextInt();
		System.out.println("Enter house number:-");
		String houseno=scStr.nextLine();
		System.out.println("Enter locality name:-");
		String locname=scStr.nextLine();
		System.out.println("Enter city namre:-");
		String city=scStr.nextLine();
		System.out.println("Enter state name:-");
		String state=scStr.nextLine();
		System.out.println("Enter country name:-");
		String country=scStr.nextLine();
		System.out.println(" Enter pin code:-");
		long pin=sc.nextInt();
		System.out.println("Enter mobile number:-");
		long mobile=sc.nextLong();
		System.out.println("Enter email id:-");
		String email=scStr.nextLine();
		System.out.println("Enter account number:-");
		long accountNumber=sc.nextLong();
		System.out.println("Enter user name:-");
		String userName=scStr.nextLine();
		System.out.println("Enter password:-");
		String passWord=scStr.nextLine();
		System.out.println("Enter balance:-");
		int balance=sc.nextInt();
		
		Accounts ac=new Accounts(accountNumber,locname,passWord,balance,kycDetails,contactDetails,cashBack);
		KYCVerification kyc=new KYCVerification(panNumber,adharNumber,documentType,documentNo);
		ContactDetails cd=new ContactDetails(houseNumber,localityName,cityName,stateName,pinCode,mobileNumber,emailId);
		
		ac.setKycDetails(kycDetails);
		ac.setContactDetails(contactDetails);
		allAccounts[noOfAccounts++]=ac;
		System.out.println("  "+ac);
		System.out.println("Account added");
	}
	
	
	public void printall(Accounts a)
	{
		System.out.println("\n"+a.getAccountNumber()+"\t");
		System.out.println(a.getUserName()+"\t");
		System.out.println(a.getBalance()+"\t");
		
		System.out.println("\n------------------------------------------\n");
	for(int i=0;i<noOfAccounts;i++)
	{
		Accounts ac=allAccounts[i];
		printall(a);
	}
}
public void deposit()
{
	System.out.println("Enter the amount to be deposited:-");
	int amount=sc.nextInt();
	System.out.println("Enter the account number to deposit:-");
	int searchAccno=sc.nextInt();
	 Accounts account=null;
	 boolean foundAccount=false;
	 
	 for(int i=0;i<noOfAccounts;i++)
	 {
		 Accounts a=allAccounts[i];
		 if(a.getAccountNumber()==searchAccno)
		 {
			 Accounts ac;
			 foundAccount=true;
		 }
	 }
	 if(foundAccount) 
	 {
		 account.setBalance(account.getBalance()+amount);
	 }
	 System.out.println("The amount has been deposited");
	 System.out.println("Check balance");
	 System.out.println(account.getAccountNumber()+" - " +account.getBalance());
}


public Accounts printAccountDetails(int searchAccno)
{
	for(int i=0;i<noOfAccounts;i++)
	{
		Accounts a=allAccounts[i];
		boolean isFound=(a.getAccountNumber()==searchAccno)?true:false;
		if(isFound)
		{
			return a;
		}
	}
	return null;
}

public void userContactDetails()
{
	System.out.println("Enter account number:-");
	int searchAccno=sc.nextInt();
	Accounts a=printAccountDetails(searchAccno);
	
	System.out.println(a);
}


public void userKycDetails()
{
	System.out.println("Enter account Number:-");
	int searchAccno=sc.nextInt();
	Accounts a=printAccountDetails(searchAccno);
	System.out.println(a.getKycDetails());
}

public void userBalance()
{
	System.out.println("Enter account number:-");
	int searchAccno=sc.nextInt();
	Accounts a=printAccountDetails(searchAccno);
	System.out.println(a.getBalance());
}


public void changeMobileNumber()
{
	System.out.println("Enter account number:-");
	int searchAccno=sc.nextInt();
	Accounts a=printAccountDetails(searchAccno);
	long previousMobileNo=a.getContactDetails().getMobileNumber();
	System.out.println("Enter new mobile number");
	long newMobileNo=sc.nextLong();
	System.out.println( );
	a.getContactDetails().setMobileNumber(newMobileNo);
	
	System.out.println("----New details after updating mobile number-----");
	System.out.println(a);
}


public void changeEmailId()
{
	System.out.println("Enter account number:-");
	int searchAccno=sc.nextInt();
	Accounts a=printAccountDetails(searchAccno);
	String previousEmailId=a.getContactDetails().getEmailId();
	System.out.println("Enter new email id");
	String newEmailId=scStr.nextLine();
	System.out.println(a.getContactDetails());
	a.getContactDetails().setEmailId(newEmailId);
	
	
	System.out.println("----New details after updating email id-----");
	System.out.println(a);
	

	

		 }
}