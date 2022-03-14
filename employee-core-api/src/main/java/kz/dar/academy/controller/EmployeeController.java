package kz.dar.academy.controller;

import kz.dar.academy.model.EmployeeModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @PostMapping
    public ResponseEntity<String> createEmployee(@Valid @RequestBody EmployeeModel employeeModel) {
        return null;
    }

    @GetMapping("/all")
    public List<EmployeeModel> getAllEmployees() {
        return null;
    }

    @GetMapping("/{employeeId}")
    public EmployeeModel getEmployeeById(@PathVariable String employeeId) {
        return null;
    }

    @PutMapping("/{employeeId}")
    public ResponseEntity<String> updateEmployeeById(@PathVariable String employeeId,
                                                     @Valid @RequestBody EmployeeModel employeeModel) {
        return null;
    }

    @DeleteMapping("/{employeeId}")
    public ResponseEntity<String> deleteEmployeeById(@PathVariable String employeeId) {
        return null;
    }
}
