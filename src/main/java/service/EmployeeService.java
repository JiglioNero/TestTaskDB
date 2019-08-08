package service;

import domain.Employee;
import domain.Telephone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rep.EmployeeRep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    public List<Employee> getAll(){
        return employeeRep.findAll();
    }

    public Employee getById(int id){
        return employeeRep.getOne(id);
    }

    public Employee update(Employee employee){
        return employeeRep.save(employee);
    }

    public Employee findByTelephone(Telephone telephone){
        return employeeRep.findByTelephonesContains(telephone);
    }

    public Employee findByFIO(String first, String second, String third){
        return employeeRep.findByFIO(first, second, third);
    }

}
