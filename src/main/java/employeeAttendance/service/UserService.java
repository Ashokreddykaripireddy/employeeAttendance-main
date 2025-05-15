package employeeAttendance.service;   


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import employeeAttendance.model.AttendanceData;
import employeeAttendance.model.Attendence;
import employeeAttendance.model.Empolyee;
import employeeAttendance.repository.AttedenceRepo;
import employeeAttendance.repository.EmpRepo;


@Service
public class UserService {
	
	@Autowired
	EmpRepo objempRepo;
	
	@Autowired
	AttedenceRepo objattandRepo;
	
	

	public void markAttendance(AttendanceData recievedDetail) {
		// data save in Employee table
		Empolyee objEmp = new Empolyee();
		objEmp.setName(recievedDetail.getFirstNamee());	
	    objEmp.setPhone(recievedDetail.getPhone());
	    objEmp.setAddress(recievedDetail.getAddress());

	    
		objempRepo.save(objEmp);
		
		// data save in Attendence table
		
		Attendence objAtt = new Attendence();
		objAtt.setPresent(true);
		objAtt.setEmpId(objEmp.getId());
		objAtt.setDateDetails(recievedDetail.getDate());
		
		objattandRepo.save(objAtt);
		
		
	}

}