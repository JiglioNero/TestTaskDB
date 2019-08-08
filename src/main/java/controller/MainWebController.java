package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.EmployeeService;

@Controller
@RequestMapping("/")
public class MainWebController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public String getEmployeesList(Model model){
        model.addAttribute("employeesList", employeeService.getAll());
        return "home";
    }
}
