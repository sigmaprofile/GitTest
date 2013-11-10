package com.tahir.retailer.web.model;

import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA.
 * User: t00750090
 * Date: 10/20/13
 * Time: 10:06 PM
 * To change this template use File | Settings | File Templates.
 */

public class User {
    private int userId;


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    private String userName;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private String password;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private int employeeId;


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    private Timestamp expiryDate;


    public Timestamp getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Timestamp expiryDate) {
        this.expiryDate = expiryDate;
    }

    private int roleId;


    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    private int companyId;


    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
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

        User user = (User) o;

        if (active != user.active) return false;
        if (companyId != user.companyId) return false;
        if (createdBy != user.createdBy) return false;
        if (deleted != user.deleted) return false;
        if (employeeId != user.employeeId) return false;
        if (modifiedBy != user.modifiedBy) return false;
        if (roleId != user.roleId) return false;
        if (userId != user.userId) return false;
        if (createdOn != null ? !createdOn.equals(user.createdOn) : user.createdOn != null) return false;
        if (expiryDate != null ? !expiryDate.equals(user.expiryDate) : user.expiryDate != null) return false;
        if (modifiedOn != null ? !modifiedOn.equals(user.modifiedOn) : user.modifiedOn != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (userName != null ? !userName.equals(user.userName) : user.userName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + employeeId;
        result = 31 * result + (expiryDate != null ? expiryDate.hashCode() : 0);
        result = 31 * result + roleId;
        result = 31 * result + companyId;
        result = 31 * result + (active ? 1 : 0);
        result = 31 * result + (deleted ? 1 : 0);
        result = 31 * result + (createdOn != null ? createdOn.hashCode() : 0);
        result = 31 * result + (modifiedOn != null ? modifiedOn.hashCode() : 0);
        result = 31 * result + createdBy;
        result = 31 * result + modifiedBy;
        return result;
    }
}
