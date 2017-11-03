package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class Attribute {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 所属商品类型
     */
    @Column(name = "PRODUCT_TYPE")
    private Long productType;

    /**
     * 属性名
     */
    @Column(name = "ATTR_NAME")
    private String attrName;

    /**
     * 属性值
     */
    @Column(name = "ATTR_VALUE")
    private String attrValue;

    /**
     * 属性输入的类型(0.为输入框 1.为选择)
     */
    @Column(name = "ATTR_INPUT_TYPE")
    private String attrInputType;

    /**
     * 属性类型(0.唯一属性1.为单选属性)
     */
    @Column(name = "ATTR_TYPE")
    private String attrType;

    /**
     * 属性排序
     */
    @Column(name = "SORT_ORDER")
    private Long sortOrder;

    /**
     * 是否关联（0，不关联；1，关联； 如果关联，那么用户在购买该商品时，具有有该属性相同值的商品将被推荐给用户）
     */
    @Column(name = "IS_LINK")
    private String isLink;

    /**
     * 属性分组
     */
    @Column(name = "ATTR_GROUP")
    private String attrGroup;

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

    @Column(name = "IS_STORK")
    private String isStork;

    @Column(name = "ATTRIBUTE_GROUP")
    private Long attributeGroup;

    /**
     * 获取主键
     *
     * @return ID - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取所属商品类型
     *
     * @return PRODUCT_TYPE - 所属商品类型
     */
    public Long getProductType() {
        return productType;
    }

    /**
     * 设置所属商品类型
     *
     * @param productType 所属商品类型
     */
    public void setProductType(Long productType) {
        this.productType = productType;
    }

    /**
     * 获取属性名
     *
     * @return ATTR_NAME - 属性名
     */
    public String getAttrName() {
        return attrName;
    }

    /**
     * 设置属性名
     *
     * @param attrName 属性名
     */
    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    /**
     * 获取属性值
     *
     * @return ATTR_VALUE - 属性值
     */
    public String getAttrValue() {
        return attrValue;
    }

    /**
     * 设置属性值
     *
     * @param attrValue 属性值
     */
    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }

    /**
     * 获取属性输入的类型(0.为输入框 1.为选择)
     *
     * @return ATTR_INPUT_TYPE - 属性输入的类型(0.为输入框 1.为选择)
     */
    public String getAttrInputType() {
        return attrInputType;
    }

    /**
     * 设置属性输入的类型(0.为输入框 1.为选择)
     *
     * @param attrInputType 属性输入的类型(0.为输入框 1.为选择)
     */
    public void setAttrInputType(String attrInputType) {
        this.attrInputType = attrInputType;
    }

    /**
     * 获取属性类型(0.唯一属性1.为单选属性)
     *
     * @return ATTR_TYPE - 属性类型(0.唯一属性1.为单选属性)
     */
    public String getAttrType() {
        return attrType;
    }

    /**
     * 设置属性类型(0.唯一属性1.为单选属性)
     *
     * @param attrType 属性类型(0.唯一属性1.为单选属性)
     */
    public void setAttrType(String attrType) {
        this.attrType = attrType;
    }

    /**
     * 获取属性排序
     *
     * @return SORT_ORDER - 属性排序
     */
    public Long getSortOrder() {
        return sortOrder;
    }

    /**
     * 设置属性排序
     *
     * @param sortOrder 属性排序
     */
    public void setSortOrder(Long sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * 获取是否关联（0，不关联；1，关联； 如果关联，那么用户在购买该商品时，具有有该属性相同值的商品将被推荐给用户）
     *
     * @return IS_LINK - 是否关联（0，不关联；1，关联； 如果关联，那么用户在购买该商品时，具有有该属性相同值的商品将被推荐给用户）
     */
    public String getIsLink() {
        return isLink;
    }

    /**
     * 设置是否关联（0，不关联；1，关联； 如果关联，那么用户在购买该商品时，具有有该属性相同值的商品将被推荐给用户）
     *
     * @param isLink 是否关联（0，不关联；1，关联； 如果关联，那么用户在购买该商品时，具有有该属性相同值的商品将被推荐给用户）
     */
    public void setIsLink(String isLink) {
        this.isLink = isLink;
    }

    /**
     * 获取属性分组
     *
     * @return ATTR_GROUP - 属性分组
     */
    public String getAttrGroup() {
        return attrGroup;
    }

    /**
     * 设置属性分组
     *
     * @param attrGroup 属性分组
     */
    public void setAttrGroup(String attrGroup) {
        this.attrGroup = attrGroup;
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
     * @return IS_STORK
     */
    public String getIsStork() {
        return isStork;
    }

    /**
     * @param isStork
     */
    public void setIsStork(String isStork) {
        this.isStork = isStork;
    }

    /**
     * @return ATTRIBUTE_GROUP
     */
    public Long getAttributeGroup() {
        return attributeGroup;
    }

    /**
     * @param attributeGroup
     */
    public void setAttributeGroup(Long attributeGroup) {
        this.attributeGroup = attributeGroup;
    }
}