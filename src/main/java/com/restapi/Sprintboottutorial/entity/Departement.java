package com.restapi.Sprintboottutorial.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Departement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departementId;

    @NotBlank(message = "Please add department name")
    @NotNull(message = "This value cannot be null")
    private String departmentName;
    private String departementAddress;
    private String departementCode;

    public Departement(Long departementId, String departmentName, String departementAddress, String departmentCode) {
        this.departementId = departementId;
        this.departmentName = departmentName;
        this.departementAddress = departementAddress;
        this.departementCode = departmentCode;
    }

    public Departement(){}
    public Long getDepartementId() {
        return departementId;
    }

    public void setDepartementId(Long departementId) {
        this.departementId = departementId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartementAddress() {
        return departementAddress;
    }

    public void setDepartementAddress(String departementAddress) {
        this.departementAddress = departementAddress;
    }

    public String getDepartementCode() {
        return departementCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departementCode = departmentCode;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "departementId=" + departementId +
                ", departmentName='" + departmentName + '\'' +
                ", departementAddress='" + departementAddress + '\'' +
                ", departmentCode='" + departementCode + '\'' +
                '}';
    }
}
