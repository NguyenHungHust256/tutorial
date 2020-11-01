package com.example.demo.controller;

import com.example.demo.model.Logo;
import com.example.demo.repository.LogoRepository;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
public class LogoController {

    @Autowired
    private LogoRepository logoRepository;

    @RolesAllowed("admin")
    @GetMapping("/logos")
    public List<Logo> getLogos() {
        return logoRepository.findAll();
    }
    @GetMapping("/newest-logo")
    public Logo getNewestLogo() {
        return logoRepository.findFirstByOrderByIdDesc();
    }

    @RolesAllowed("admin")
    @PostMapping("/logos")
    public Logo createEmployee(@RequestBody Logo logo) {
        return logoRepository.save(logo);
    }

//    @GetMapping("/employees/{id}")
//    public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long employeeId) throws ResourceNotFoundException {
//        Employee employee = employeeRepository.findById(employeeId).orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
//        return ResponseEntity.ok().body(employee);
//    }
//
//    @PostMapping("/employees")
//    public Employee createEmployee(@RequestBody Employee employee) {
//        return employeeRepository.save(employee);
//    }
//
//    @PutMapping("/employees/{id}")
//    public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Long employeeId,
//                                                   @Validated @RequestBody Employee employeeDetails) throws ResourceNotFoundException {
//        Employee employee = employeeRepository.findById(employeeId).orElseThrow(
//                () -> new ResourceNotFoundException("Employee not found for this id : " + employeeId));
//        employee.setEmail(employeeDetails.getEmail());
//        employee.setLastName(employeeDetails.getLastName());
//        employee.setFirstName(employeeDetails.getFirstName());
//        final Employee updatedEmployee = employeeRepository.save(employee);
//        return ResponseEntity.ok(updatedEmployee);
//    }
//
//    @DeleteMapping("/employees/{id}")
//    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId) throws ResourceNotFoundException {
//        Employee employee = employeeRepository.findById(employeeId)
//                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
//
//        employeeRepository.delete(employee);
//        Map<String, Boolean> response = new HashMap<>();
//        response.put("delete", Boolean.TRUE);
//        return response;
//    }
}
