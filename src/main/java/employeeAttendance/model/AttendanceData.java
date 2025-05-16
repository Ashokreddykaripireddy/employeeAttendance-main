package employeeAttendance.model;

//import java.time.LocalDate;

public class AttendanceData {

	
    public  String firstNamee;
    public int phone;
    public String   date;   
    public boolean present;
	public String address;
	public long id; 

     
    
	public AttendanceData() {}



	public AttendanceData(String firstNamee, int phone, String date, boolean present, String address, long id) {
		
		this.firstNamee = firstNamee;
		this.phone = phone;
		this.date = date;
		this.present = present;
		this.address = address;
		this.id = id;
	}



	public String getFirstNamee() {
		return firstNamee;
	}



	public void setFirstNamee(String firstNamee) {
		this.firstNamee = firstNamee;
	}



	public int getPhone() {
		return phone;
	}



	public void setPhone(int phone) {
		this.phone = phone;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public boolean isPresent() {
		return present;
	}



	public void setPresent(boolean present) {
		this.present = present;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}
	
	

	
}