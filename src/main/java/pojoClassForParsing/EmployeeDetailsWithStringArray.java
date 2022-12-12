package pojoClassForParsing;

public class EmployeeDetailsWithStringArray {
	
	//create variables globally
	String ename;
	String eid;
	int phoneno;
	String[] mailid;
	String address;
	
	//create constructor for initialization
	
	public EmployeeDetailsWithStringArray(String ename, String eid, int phoneno,String[] mailid,String address)
	{
		this.ename=ename;
		this.eid=eid;
		this.phoneno=phoneno;
		this.mailid=mailid;
		this.address=address;
	}
	public EmployeeDetailsWithStringArray() {
	}
	
	
	//create getters and setters
	
	public String getename() {
	return ename;
	}
	
	public void setename(String ename) {
		this.ename=ename;
	}
	
	public String geteid() {
		return eid;
	}
	public void seteid(String eid) {
		this.eid=eid;
	}
	public int getphoneno() {
		return phoneno;
	}
	public void setphoneno(int phoneno) {
		this.phoneno=phoneno;
	}
	public String[] getmailid() {
		return mailid;
	}
	public void setmailid(String[] mailid) {
		this.mailid=mailid;
	}
	public String getaddress() {
		return address;
	}
	public void setaddress(String address) {
		this.address=address;
	}
	
	

}
