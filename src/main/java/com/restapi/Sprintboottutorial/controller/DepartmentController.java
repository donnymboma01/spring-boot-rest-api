package com.restapi.Sprintboottutorial.controller;

import com.restapi.Sprintboottutorial.entity.Departement;
import com.restapi.Sprintboottutorial.service.DepartmentService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    // permet de mieux debogger une application.
    private final Logger LOGGER = LoggerFactory.getLogger(Departement.class);

    @PostMapping("/departments")
    public Departement saveDepartement(@Valid @RequestBody Departement departement){
        LOGGER.info("Inside de save department request of the controller");
        return departmentService.saveDepartment(departement);
    }

    @GetMapping("/departments")
    public List<Departement> fetchDepartments(){
        LOGGER.info("Inside the fecth all departments request of the controller");
        return departmentService.fetchDepartmentsList();
    }

    @GetMapping("/departments/{id}")
    public Departement fetchDepartementById(@PathVariable("id") Long departmentId){
        LOGGER.info("Inside the get a single department request of the controller");
        return departmentService.fecthDepartmentById(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartement(@PathVariable("id") Long departmentId){
        LOGGER.info("Inside the delete a  deprtment request of the controller");
        departmentService.deleteDepartmentById(departmentId);
        return "Department deleted Successfully !";
    }

    @PutMapping("/departments/{id}")
    public Departement updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Departement departement){
        LOGGER.info("Inside the update department request of the controller");
        return departmentService.updateDepartment(departmentId, departement);
    }

    @GetMapping("/departments/name/{name}")
    public Departement getDepartmentByName(@PathVariable("name") String departmentName){
        LOGGER.info("Inside the get a department by its name request of the controller");
        return departmentService.fetchDepartmentByName(departmentName);
    }
}
