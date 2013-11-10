package com.tahir.retailer.web.model;

import java.sql.Timestamp;
/**
 * Created with IntelliJ IDEA.
 * User: t00750090
 * Date: 10/18/13
 * Time: 9:56 PM
 * To change this template use File | Settings | File Templates.
 */

public class Employee {
    private int employeeId;


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    private String employeeName;


    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    private Timestamp joiningDate;


    public Timestamp getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Timestamp joiningDate) {
        this.joiningDate = joiningDate;
    }

    private int departmentId;


    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    private String emailAddress;


    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    private String picture;


    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    private int companyId;


    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    private int designationId;


    public int getDesignationId() {
        return designationId;
    }

    public void setDesignationId(int designationId) {
        this.designationId = designationId;
    }

    private boolean active;


    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    private boolean deleted;


    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    private Timestamp createdOn;


    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    private Timestamp modifiedOn;


    public Timestamp getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Timestamp modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    private int createdBy;


    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    private int modifiedBy;


    public int getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(int modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (active != employee.active) return false;
        if (companyId != employee.companyId) return false;
        if (createdBy != employee.createdBy) return false;
        if (deleted != employee.deleted) return false;
        if (departmentId != employee.departmentId) return false;
        if (designationId != employee.designationId) return false;
        if (employeeId != employee.employeeId) return false;
        if (modifiedBy != employee.modifiedBy) return false;
        if (createdOn != null ? !createdOn.equals(employee.createdOn) : employee.createdOn != null) return false;
        if (emailAddress != null ? !emailAddress.equals(employee.emailAddress) : employee.emailAddress != null)
            return false;
        if (employeeName != null ? !employeeName.equals(employee.employeeName) : employee.employeeName != null)
            return false;
        if (joiningDate != null ? !joiningDate.equals(employee.joiningDate) : employee.joiningDate != null)
            return false;
        if (modifiedOn != null ? !modifiedOn.equals(employee.modifiedOn) : employee.modifiedOn != null) return false;
        if (picture != null ? !picture.equals(employee.picture) : employee.picture != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = employeeId;
        result = 31 * result + (employeeName != null ? employeeName.hashCode() : 0);
        result = 31 * result + (joiningDate != null ? joiningDate.hashCode() : 0);
        result = 31 * result + departmentId;
        result = 31 * result + (emailAddress != null ? emailAddress.hashCode() : 0);
        result = 31 * result + (picture != null ? picture.hashCode() : 0);
        result = 31 * result + companyId;
        result = 31 * result + designationId;
        result = 31 * result + (active ? 1 : 0);
        result = 31 * result + (deleted ? 1 : 0);
        result = 31 * result + (createdOn != null ? createdOn.hashCode() : 0);
        result = 31 * result + (modifiedOn != null ? modifiedOn.hashCode() : 0);
        result = 31 * result + createdBy;
        result = 31 * result + modifiedBy;
        return result;
    }
}
