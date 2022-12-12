package pojoClassForParsing;

import org.json.simple.JSONObject;

public class PojoForBookerApp {
	String firstname;
	String lastname;
	int totalprice;
	boolean depositpaid;
	Object bookingDates;
	String addNeeds;
	
	public PojoForBookerApp(String firstName, String lastName, int totalprice,boolean depositpaid, Object bookingDates, String addNeeds)
	{
		this.firstname=firstName;
		this.lastname=lastName;
		this.totalprice=totalprice;
		this.depositpaid=depositpaid;
		this.bookingDates=bookingDates;
		this.addNeeds=addNeeds;
	}
	public PojoForBookerApp()
	{}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}
	public boolean isDepositpaid() {
		return depositpaid;
	}
	public void setDepositpaid(boolean depositpaid) {
		this.depositpaid = depositpaid;
	}
	public Object getBookingDates() {
		return bookingDates;
	}
	public void setBookingDates(Object bookingDates) {
		this.bookingDates = bookingDates;
	}
	public String getAddNeeds() {
		return addNeeds;
	}
	public void setAddNeeds(String addNeeds) {
		this.addNeeds = addNeeds;
	}
	
		
	}


