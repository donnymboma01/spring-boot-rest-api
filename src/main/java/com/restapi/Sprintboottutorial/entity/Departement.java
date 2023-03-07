package com.restapi.Sprintboottutorial.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Departement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departementId;
    private String departmentName;
    private String departementAddress;
    private String getDepartmentCode;

    public Departement(Long departementId, String departmentName, String departementAddress, String getDepartmentCode) {
        this.departementId = departementId;
        this.departmentName = departmentName;
        this.departementAddress = departementAddress;
        this.getDepartmentCode = getDepartmentCode;
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

    public String getGetDepartmentCode() {
        return getDepartmentCode;
    }

    public void setGetDepartmentCode(String getDepartmentCode) {
        this.getDepartmentCode = getDepartmentCode;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "departementId=" + departementId +
                ", departmentName='" + departmentName + '\'' +
                ", departementAddress='" + departementAddress + '\'' +
                ", getDepartmentCode='" + getDepartmentCode + '\'' +
                '}';
    }
}
