package employeeAttendance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "attendence")
public class Attendence {
	
	@Id
	@GeneratedValue
	private long id;
	public long empId;
	public boolean present;
	public String dateDetails;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public boolean isPresent() {
		return present;
	}
	public void setPresent(boolean present) {
		this.present = present;
	}
	public String getDateDetails() {
		return dateDetails;
	}
	public void setDateDetails(String dateDetails) {
		this.dateDetails = dateDetails;
	}
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long  empId) {
		this.empId = empId;
	}

	
	
	
	

}
