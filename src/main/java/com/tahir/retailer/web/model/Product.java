package com.tahir.retailer.web.model;


import java.sql.Timestamp;
/**
 * Created with IntelliJ IDEA.
 * User: t00750090
 * Date: 10/18/13
 * Time: 9:56 PM
 * To change this template use File | Settings | File Templates.
 */

public class Product {
    private int productId;


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    private String productName;


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    private int companyId;


    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    private String productDescription;


    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    private int manufacturerId;


    public int getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(int manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    private int supplierId;


    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    private float pprice;


    public float getPprice() {
        return pprice;
    }

    public void setPprice(float pprice) {
        this.pprice = pprice;
    }

    private float sprice;


    public float getSprice() {
        return sprice;
    }

    public void setSprice(float sprice) {
        this.sprice = sprice;
    }

    private int categoryId;


    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    private int subCategoryId;


    public int getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(int subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    private int packSize;


    public int getPackSize() {
        return packSize;
    }

    public void setPackSize(int packSize) {
        this.packSize = packSize;
    }

    private int attachmentId;


    public int getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(int attachmentId) {
        this.attachmentId = attachmentId;
    }

    private String attachmentUrl;


    public String getAttachmentUrl() {
        return attachmentUrl;
    }

    public void setAttachmentUrl(String attachmentUrl) {
        this.attachmentUrl = attachmentUrl;
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

        Product product = (Product) o;

        if (active != product.active) return false;
        if (attachmentId != product.attachmentId) return false;
        if (categoryId != product.categoryId) return false;
        if (companyId != product.companyId) return false;
        if (createdBy != product.createdBy) return false;
        if (deleted != product.deleted) return false;
        if (manufacturerId != product.manufacturerId) return false;
        if (modifiedBy != product.modifiedBy) return false;
        if (packSize != product.packSize) return false;
        if (Float.compare(product.pprice, pprice) != 0) return false;
        if (productId != product.productId) return false;
        if (Float.compare(product.sprice, sprice) != 0) return false;
        if (subCategoryId != product.subCategoryId) return false;
        if (supplierId != product.supplierId) return false;
        if (attachmentUrl != null ? !attachmentUrl.equals(product.attachmentUrl) : product.attachmentUrl != null)
            return false;
        if (createdOn != null ? !createdOn.equals(product.createdOn) : product.createdOn != null) return false;
        if (modifiedOn != null ? !modifiedOn.equals(product.modifiedOn) : product.modifiedOn != null) return false;
        if (productDescription != null ? !productDescription.equals(product.productDescription) : product.productDescription != null)
            return false;
        if (productName != null ? !productName.equals(product.productName) : product.productName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productId;
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + companyId;
        result = 31 * result + (productDescription != null ? productDescription.hashCode() : 0);
        result = 31 * result + manufacturerId;
        result = 31 * result + supplierId;
        result = 31 * result + (pprice != +0.0f ? Float.floatToIntBits(pprice) : 0);
        result = 31 * result + (sprice != +0.0f ? Float.floatToIntBits(sprice) : 0);
        result = 31 * result + categoryId;
        result = 31 * result + subCategoryId;
        result = 31 * result + packSize;
        result = 31 * result + attachmentId;
        result = 31 * result + (attachmentUrl != null ? attachmentUrl.hashCode() : 0);
        result = 31 * result + (active ? 1 : 0);
        result = 31 * result + (deleted ? 1 : 0);
        result = 31 * result + (createdOn != null ? createdOn.hashCode() : 0);
        result = 31 * result + (modifiedOn != null ? modifiedOn.hashCode() : 0);
        result = 31 * result + createdBy;
        result = 31 * result + modifiedBy;
        return result;
    }
}
