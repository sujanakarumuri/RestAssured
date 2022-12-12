package pojoClassForParsing;

public class EmpSpouseDetails {
	
	String sname;
	String sid;
	int sphonenum;
	String saddress;
	String smailid;
	
	public EmpSpouseDetails(String sname, String sid, int sphonenum, String saddress, String smailid) {
		this.sname = sname;
		this.sid = sid;
		this.sphonenum = sphonenum;
		this.saddress = saddress;
		this.smailid = smailid;
	}
	public EmpSpouseDetails()
	{
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public int getSphonenum() {
		return sphonenum;
	}

	public void setSphonenum(int sphonenum) {
		this.sphonenum = sphonenum;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	public String getSmailid() {
		return smailid;
	}

	public void setSmailid(String smailid) {
		this.smailid = smailid;
	}
	
	
	
	

}
