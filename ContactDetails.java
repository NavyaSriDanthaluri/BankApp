package entity;

public class ContactDetails {
	
	private String houseNumber;
	private String localityName;
	private String cityName;
	private String stateName;
	private long pinCode;
	private long mobileNumber;
	private String emailId;
	
	public ContactDetails()
	{
		super();
	}
public ContactDetails(String houseNumber,String localityName,String cityName, String stateName,long pinCode,long mobileNumber,String emailId)
{
	super();
	this.houseNumber=houseNumber;
	this.localityName=localityName;
	this.cityName=cityName;
	this.stateName=stateName;
	this.pinCode=pinCode;
	this.mobileNumber=mobileNumber;
	this.emailId=emailId;
}
public String getHouseNumber() {
	return houseNumber;
}
public void setHouseNumber(String houseNumber) {
	this.houseNumber = houseNumber;
}
public String getLocalityName() {
	return localityName;
}
public void setLocalityName(String localityName) {
	this.localityName = localityName;
}
public String getCityName() {
	return cityName;
}
public void setCityName(String cityName) {
	this.cityName = cityName;
}
public String getStateName() {
	return stateName;
}
public void setStateName(String stateName) {
	this.stateName = stateName;
}
public long getPinCode() {
	return pinCode;
}
public void setPinCode(long pinCode) {
	this.pinCode = pinCode;
}
public long getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(long mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}

@Override
public String toString()
{
	return "ContactDetails [houseNumber=" + houseNumber + ",localityName=" + localityName + ",cityName=" + cityName + ",stateName="+ stateName +",pinCode="+ pinCode +",mobileNumber="+ mobileNumber +",emailId="+ emailId +"]";	
}
}
