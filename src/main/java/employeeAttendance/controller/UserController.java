package employeeAttendance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import employeeAttendance.model.AttendanceData;
import employeeAttendance.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService objUserService;
	
	@PostMapping("/send")
	public void sendData(@RequestBody AttendanceData recievedDetail) {
		 objUserService.markAttendance(recievedDetail);
	}

	
} 