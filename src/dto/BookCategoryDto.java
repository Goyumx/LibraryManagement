/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author goyum
 */
public class BookCategoryDto {
    
    private String categoryName;
    private String categoryId;
    private String categoryDesc;

    public BookCategoryDto() {
    }

    public BookCategoryDto(String categoryName, String categoryId, String categoryDesc) {
        this.categoryName = categoryName;
        this.categoryId = categoryId;
        this.categoryDesc = categoryDesc;
    }

    /**
     * @return the categoryName
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * @param categoryName the categoryName to set
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * @return the categoryId
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * @param categoryId the categoryId to set
     */
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * @return the categoryDesc
     */
    public String getCategoryDesc() {
        return categoryDesc;
    }

    /**
     * @param categoryDesc the categoryDesc to set
     */
    public void setCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc;
    }

    @Override
    public String toString() {
        return "BookCategoryDto{" + "categoryName=" + categoryName + ", categoryId=" + categoryId + ", categoryDesc=" + categoryDesc + '}';
    }

     
    
}
