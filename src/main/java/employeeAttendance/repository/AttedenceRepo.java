package employeeAttendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import employeeAttendance.model.Attendence;

@Repository
public interface AttedenceRepo extends JpaRepository<Attendence,Long> {


}