package pojoClassForParsing;

public class EmployeeDetailsWithIntArray {
	
	//declare the variables globally
	String ename;
	String eid;
	int[] phoneno;
	int salary;
	String mailid;
	
	//create constructor for initialization
	
	public EmployeeDetailsWithIntArray(String ename, String eid, int[] phoneno, int salary, String mailid) {
		
		this.ename = ename;
		this.eid = eid;
		this.phoneno = phoneno;
		this.salary = salary;
		this.mailid = mailid;
	}
	public EmployeeDetailsWithIntArray()
	{}
	
	//create getters and setters

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public int[] getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(int[] phoneno) {
		this.phoneno = phoneno;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	

}
