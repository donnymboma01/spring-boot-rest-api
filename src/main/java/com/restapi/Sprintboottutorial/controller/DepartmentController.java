package com.restapi.Sprintboottutorial.controller;

import com.restapi.Sprintboottutorial.entity.Departement;
import com.restapi.Sprintboottutorial.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Departement saveDepartement(@RequestBody Departement departement){
        return departmentService.saveDepartment(departement);
    }

    @GetMapping("/departments")
    public List<Departement> fetchDepartments(){
        return departmentService.fetchDepartmentsList();
    }

    @GetMapping("/departments/{id}")
    public Departement fetchDepartementById(@PathVariable("id") Long departmentId){
        return departmentService.fecthDepartmentById(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartement(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
        return "Department deleted Successfully !";
    }

    @PutMapping("/departments/{id}")
    public Departement updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Departement departement){
        return departmentService.updateDepartment(departmentId, departement);
    }

    @GetMapping("/departments/name/{name}")
    public Departement getDepartmentByName(@PathVariable("name") String departmentName){
        return departmentService.fetchDepartmentByName(departmentName);
    }
}
