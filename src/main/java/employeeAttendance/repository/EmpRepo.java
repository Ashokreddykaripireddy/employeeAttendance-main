package employeeAttendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import employeeAttendance.model.Empolyee;


@Repository
public interface EmpRepo extends JpaRepository<Empolyee,Long> {

}
