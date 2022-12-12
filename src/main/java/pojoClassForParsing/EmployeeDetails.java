package pojoClassForParsing;

public class EmployeeDetails {
	
	//Step1: Declare the variables globally
	String eName;
	String eId;
	int PhoneNum;
	String Address;
	String mailId;
	
	
	//Step2: Create constructor for initialization
	public EmployeeDetails(String eName, String eId, int PhoneNum, String Address, String mailId) {
		
		this.eName = eName;
		this.eId = eId;
		this.PhoneNum = PhoneNum;
		this.Address = Address;
		this.mailId = mailId;
		
		
	}
	//triggering the execution
	public EmployeeDetails()
	{}
	
	//Step3: Create getters and Setters

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
   		this.eName = eName;
	}

	public String geteId() {
		return eId;
	}

	public void seteId(String eId) {
		this.eId = eId;
	}

	public int getPhoneNum() {
		return PhoneNum;
	}

	public void setPhoneNum(int PhoneNum) {
		this.PhoneNum = PhoneNum;
	}

	public String getAddress() {
		return Address;
	}
	
	public void setAddress(String Address) {
		this.Address = Address;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	
	
}