package rep;

import domain.Employee;
import domain.Position;
import domain.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;

public interface EmployeeRep extends JpaRepository<Employee, Integer> {
    @Query("SELECT e from Employee e where e.firstName = ?1 and e.secondName = ?2 and e.thirdName = ?3")
    Employee findByFIO(String firstName, String secondName, String thirdName);

    Employee findByTelephonesContains(String number);

    ArrayList<Employee> getEmployeesByPosition(Position position);

    ArrayList<Employee> getEmployeesBySchedule(Schedule schedule);
}
