package com.tahir.retailer.web.model;

import java.sql.Timestamp;
/**
 * Created with IntelliJ IDEA.
 * User: t00750090
 * Date: 10/18/13
 * Time: 9:56 PM
 * To change this template use File | Settings | File Templates.
 */

public class Department {
    private int departmentId;


    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    private String departmentName;


    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
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

        Department that = (Department) o;

        if (active != that.active) return false;
        if (companyId != that.companyId) return false;
        if (createdBy != that.createdBy) return false;
        if (deleted != that.deleted) return false;
        if (departmentId != that.departmentId) return false;
        if (modifiedBy != that.modifiedBy) return false;
        if (createdOn != null ? !createdOn.equals(that.createdOn) : that.createdOn != null) return false;
        if (departmentName != null ? !departmentName.equals(that.departmentName) : that.departmentName != null)
            return false;
        if (modifiedOn != null ? !modifiedOn.equals(that.modifiedOn) : that.modifiedOn != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = departmentId;
        result = 31 * result + (departmentName != null ? departmentName.hashCode() : 0);
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
