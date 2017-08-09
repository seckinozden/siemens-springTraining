package com.siemens.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Department {

    @Id
    @GeneratedValue
    private int departmentId;
    private String departmentName;
    private String departmentManagerId;


    public Department(String departmentName, String departmentManagerId) {
        this.departmentName = departmentName;
        this.departmentManagerId = departmentManagerId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentManagerId() {
        return departmentManagerId;
    }

    public void setDepartmentManagerId(String departmentManagerId) {
        this.departmentManagerId = departmentManagerId;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", departmentManagerId='" + departmentManagerId + '\'' +
                '}';
    }
}
