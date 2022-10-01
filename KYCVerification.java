package entity;

public class KYCVerification {
	String panNumber;
	long adharNumber;
	String documentType;
	long documentNo;
	public KYCVerification() {
		super();
	}
	public KYCVerification(String panNumber,long adharNumber,String documentType,long documentNo) {
		super();
		this.panNumber=panNumber;
		this.adharNumber=adharNumber;
		this.documentType=documentType;
		this.documentNo=documentNo;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public long getAdharNumber() {
		return adharNumber;
	}
	public void setAdharNumber(long adharNumber) {
		this.adharNumber = adharNumber;
	}
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	public long getDocumentNo() {
		return documentNo;
	}
	public void setDocumentNo(long documentNo) {
		this.documentNo = documentNo;
	}

}
