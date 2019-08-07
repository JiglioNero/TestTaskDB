package service;

import domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rep.EmployeeRep;

@Service
public class EmployeeService {
    private EmployeeRep employeeRep;

    @Autowired
    public EmployeeService(EmployeeRep employeeRep) {
        this.employeeRep = employeeRep;
    }

    public Employee create(Employee employee){
        return employeeRep.save(employee);
    }

    public void delete(int id){
        employeeRep.deleteById(id);
    }

    public Employee getById(int id){
        return employeeRep.getOne(id);
    }

    public Employee update(Employee employee){
        return employeeRep.save(employee);
    }

}
