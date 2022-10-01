package entity;

public class Accounts {
	
	private long accountNumber;
	private String userName;
	private String passWord;
	private int balance;
	private KYCVerification kycDetails;
	private ContactDetails contactDetails;
	private int cashback;
	private Accounts ad;
	private KYCVerification kyc;
	private ContactDetails cd;
	public Accounts() {
		super();
	}
	public Accounts(long accountNumber,String userName,String passWord,int balance,KYCVerification kycDetails,ContactDetails contactDetails,int cashback)
	{
		super();
		this.accountNumber=accountNumber;
		this.userName=userName;
		this.passWord=passWord;
		this.balance=balance;
		this.kycDetails=kycDetails;
		this.contactDetails=contactDetails;
		this.cashback=cashback;
	}
	
    public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public KYCVerification getKycDetails() {
		return kycDetails;
	}
	public void setKycDetails(KYCVerification kycDetails) {
		this.kycDetails = kycDetails;
	}
	public ContactDetails getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}
	public int getCashback() {
		return cashback;
	}
	public void setCashback(int cashback) {
		this.cashback = cashback;
	}
	public Accounts getAd() {
		return ad;
	}
	public void setAd(Accounts ad) {
		this.ad = ad;
	}
	public KYCVerification getKyc() {
		return kyc;
	}
	public void setKyc(KYCVerification kyc) {
		this.kyc = kyc;
	}
	public ContactDetails getCd() {
		return cd;
	}
	public void setCd(ContactDetails cd) {
		this.cd = cd;
	}
	@Override
    public String toString() {
    	return "Accounts [accountNumber="+accountNumber+",userName="+userName+",passWord="+passWord+",balance="+balance+",contactDetails="+contactDetails+",cashback="+cashback+"]";
    }
    public String getHolderName() {
    	return null;
    }
}
