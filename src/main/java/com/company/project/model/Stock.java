package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class Stock {
    /**
     * PK
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 具体商品ID
     */
    @Column(name = "PRODUCT_ID")
    private Long productId;

    /**
     * 具体属性组合
     */
    @Column(name = "PRODUCT_ATTRIBUTE")
    private String productAttribute;

    /**
     * 库存数量
     */
    @Column(name = "AMOUNT")
    private Long amount;

    /**
     * 商品价格
     */
    @Column(name = "PRICE")
    private Double price;

    /**
     * 新增时间
     */
    @Column(name = "ADD_TIME")
    private Date addTime;

    /**
     * 编辑时间
     */
    @Column(name = "EDIT_TIME")
    private Date editTime;

    /**
     * 状态
     */
    @Column(name = "STATUS")
    private String status;

    @Column(name = "IS_ATTRIBUTE_OR_STOCK")
    private String isAttributeOrStock;

    /**
     * 获取PK
     *
     * @return ID - PK
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置PK
     *
     * @param id PK
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取具体商品ID
     *
     * @return PRODUCT_ID - 具体商品ID
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * 设置具体商品ID
     *
     * @param productId 具体商品ID
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * 获取具体属性组合
     *
     * @return PRODUCT_ATTRIBUTE - 具体属性组合
     */
    public String getProductAttribute() {
        return productAttribute;
    }

    /**
     * 设置具体属性组合
     *
     * @param productAttribute 具体属性组合
     */
    public void setProductAttribute(String productAttribute) {
        this.productAttribute = productAttribute;
    }

    /**
     * 获取库存数量
     *
     * @return AMOUNT - 库存数量
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * 设置库存数量
     *
     * @param amount 库存数量
     */
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    /**
     * 获取商品价格
     *
     * @return PRICE - 商品价格
     */
    public Double getPrice() {
        return price;
    }

    /**
     * 设置商品价格
     *
     * @param price 商品价格
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 获取新增时间
     *
     * @return ADD_TIME - 新增时间
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * 设置新增时间
     *
     * @param addTime 新增时间
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * 获取编辑时间
     *
     * @return EDIT_TIME - 编辑时间
     */
    public Date getEditTime() {
        return editTime;
    }

    /**
     * 设置编辑时间
     *
     * @param editTime 编辑时间
     */
    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    /**
     * 获取状态
     *
     * @return STATUS - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return IS_ATTRIBUTE_OR_STOCK
     */
    public String getIsAttributeOrStock() {
        return isAttributeOrStock;
    }

    /**
     * @param isAttributeOrStock
     */
    public void setIsAttributeOrStock(String isAttributeOrStock) {
        this.isAttributeOrStock = isAttributeOrStock;
    }
}