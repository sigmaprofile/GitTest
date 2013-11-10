package com.tahir.retailer.web.model;

import java.sql.Timestamp;
/**
 * Created with IntelliJ IDEA.
 * User: t00750090
 * Date: 10/18/13
 * Time: 9:56 PM
 * To change this template use File | Settings | File Templates.
 */

public class Supplier {
    private int supplierId;


    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    private String supplierName;


    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    private String supplierRegistrationNumber;


    public String getSupplierRegistrationNumber() {
        return supplierRegistrationNumber;
    }

    public void setSupplierRegistrationNumber(String supplierRegistrationNumber) {
        this.supplierRegistrationNumber = supplierRegistrationNumber;
    }

    private boolean defaultSupplier;


    public boolean isDefaultSupplier() {
        return defaultSupplier;
    }

    public void setDefaultSupplier(boolean defaultSupplier) {
        this.defaultSupplier = defaultSupplier;
    }

    private String companyAddress;


    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    private String cotactNumber;


    public String getCotactNumber() {
        return cotactNumber;
    }

    public void setCotactNumber(String cotactNumber) {
        this.cotactNumber = cotactNumber;
    }

    private String mailingAddress;


    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
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

        Supplier supplier = (Supplier) o;

        if (active != supplier.active) return false;
        if (companyId != supplier.companyId) return false;
        if (createdBy != supplier.createdBy) return false;
        if (defaultSupplier != supplier.defaultSupplier) return false;
        if (deleted != supplier.deleted) return false;
        if (modifiedBy != supplier.modifiedBy) return false;
        if (supplierId != supplier.supplierId) return false;
        if (companyAddress != null ? !companyAddress.equals(supplier.companyAddress) : supplier.companyAddress != null)
            return false;
        if (cotactNumber != null ? !cotactNumber.equals(supplier.cotactNumber) : supplier.cotactNumber != null)
            return false;
        if (createdOn != null ? !createdOn.equals(supplier.createdOn) : supplier.createdOn != null) return false;
        if (mailingAddress != null ? !mailingAddress.equals(supplier.mailingAddress) : supplier.mailingAddress != null)
            return false;
        if (modifiedOn != null ? !modifiedOn.equals(supplier.modifiedOn) : supplier.modifiedOn != null) return false;
        if (supplierName != null ? !supplierName.equals(supplier.supplierName) : supplier.supplierName != null)
            return false;
        if (supplierRegistrationNumber != null ? !supplierRegistrationNumber.equals(supplier.supplierRegistrationNumber) : supplier.supplierRegistrationNumber != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = supplierId;
        result = 31 * result + (supplierName != null ? supplierName.hashCode() : 0);
        result = 31 * result + (supplierRegistrationNumber != null ? supplierRegistrationNumber.hashCode() : 0);
        result = 31 * result + (defaultSupplier ? 1 : 0);
        result = 31 * result + (companyAddress != null ? companyAddress.hashCode() : 0);
        result = 31 * result + (cotactNumber != null ? cotactNumber.hashCode() : 0);
        result = 31 * result + (mailingAddress != null ? mailingAddress.hashCode() : 0);
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
