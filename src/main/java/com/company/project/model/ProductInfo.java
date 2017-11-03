package com.company.project.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "product_info")
public class ProductInfo {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 类型 ‘1’=油卡；‘2’=汽车
     */
    @Column(name = "CAT_TYPE")
    private String catType;

    /**
     * 门店
     */
    @Column(name = "SHOP_ID")
    private Long shopId;

    /**
     * 商品唯一货号
     */
    @Column(name = "PRODUCT_SN")
    private String productSn;

    /**
     * 商品类型
     */
    @Column(name = "PRODUCT_TYPE")
    private Long productType;

    /**
     * 商品名称
     */
    @Column(name = "TITLE")
    private String title;

    /**
     * 关键字
     */
    @Column(name = "KEYWORDS")
    private String keywords;

    /**
     * 商品封面图
     */
    @Column(name = "COVER_IMG")
    private String coverImg;

    /**
     * 商品图片
     */
    @Column(name = "IMGURL")
    private String imgurl;

    /**
     * 商品点击数
     */
    @Column(name = "CLICK_COUNT")
    private Long clickCount;

    /**
     * 商品的显示顺序
     */
    @Column(name = "SORT_ORDER")
    private Long sortOrder;

    /**
     * 更新时间
     */
    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    /**
     * 上架时间
     */
    @Column(name = "ADD_TIME")
    private Date addTime;

    /**
     * 市场售价
     */
    @Column(name = "MARKET_PRICE")
    private BigDecimal marketPrice;

    /**
     * 本店售价
     */
    @Column(name = "SHOP_PRICE")
    private BigDecimal shopPrice;

    /**
     * 促销价格
     */
    @Column(name = "PROMOTE_PRICE")
    private BigDecimal promotePrice;

    /**
     * 促销价格开始日期
     */
    @Column(name = "PROMOTE_START_DATE")
    private Date promoteStartDate;

    /**
     * 促销价格结束日期
     */
    @Column(name = "PROMOTE_END_DATE")
    private Date promoteEndDate;

    /**
     * 兑换所需积分
     */
    @Column(name = "INTEGRAL")
    private Long integral;

    /**
     * 商品库存
     */
    @Column(name = "REPERTORY")
    private Long repertory;

    /**
     * 是否上架:0，否；1，是
     */
    @Column(name = "IS_SALE")
    private String isSale;

    /**
     * 是否新品:0，否；1，是
     */
    @Column(name = "IS_NEW")
    private String isNew;

    /**
     * 是否精品:0，否；1，是
     */
    @Column(name = "IS_BEST")
    private String isBest;

    /**
     * 是否热销:0，否；1，是
     */
    @Column(name = "IS_HOT")
    private String isHot;

    /**
     * 是否特价促销:0，否；1，是
     */
    @Column(name = "IS_PROMOTE")
    private String isPromote;

    /**
     * 状态
     */
    @Column(name = "STATUS")
    private String status;

    @Column(name = "RETURN_DISCOUNT")
    private BigDecimal returnDiscount;

    /**
     * 描述
     */
    @Column(name = "DESCRIPTION")
    private String description;

    /**
     * 内容
     */
    @Column(name = "CONTENT")
    private String content;

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
     * 获取类型 ‘1’=油卡；‘2’=汽车
     *
     * @return CAT_TYPE - 类型 ‘1’=油卡；‘2’=汽车
     */
    public String getCatType() {
        return catType;
    }

    /**
     * 设置类型 ‘1’=油卡；‘2’=汽车
     *
     * @param catType 类型 ‘1’=油卡；‘2’=汽车
     */
    public void setCatType(String catType) {
        this.catType = catType;
    }

    /**
     * 获取门店
     *
     * @return SHOP_ID - 门店
     */
    public Long getShopId() {
        return shopId;
    }

    /**
     * 设置门店
     *
     * @param shopId 门店
     */
    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    /**
     * 获取商品唯一货号
     *
     * @return PRODUCT_SN - 商品唯一货号
     */
    public String getProductSn() {
        return productSn;
    }

    /**
     * 设置商品唯一货号
     *
     * @param productSn 商品唯一货号
     */
    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    /**
     * 获取商品类型
     *
     * @return PRODUCT_TYPE - 商品类型
     */
    public Long getProductType() {
        return productType;
    }

    /**
     * 设置商品类型
     *
     * @param productType 商品类型
     */
    public void setProductType(Long productType) {
        this.productType = productType;
    }

    /**
     * 获取商品名称
     *
     * @return TITLE - 商品名称
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置商品名称
     *
     * @param title 商品名称
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取关键字
     *
     * @return KEYWORDS - 关键字
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * 设置关键字
     *
     * @param keywords 关键字
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    /**
     * 获取商品封面图
     *
     * @return COVER_IMG - 商品封面图
     */
    public String getCoverImg() {
        return coverImg;
    }

    /**
     * 设置商品封面图
     *
     * @param coverImg 商品封面图
     */
    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    /**
     * 获取商品图片
     *
     * @return IMGURL - 商品图片
     */
    public String getImgurl() {
        return imgurl;
    }

    /**
     * 设置商品图片
     *
     * @param imgurl 商品图片
     */
    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    /**
     * 获取商品点击数
     *
     * @return CLICK_COUNT - 商品点击数
     */
    public Long getClickCount() {
        return clickCount;
    }

    /**
     * 设置商品点击数
     *
     * @param clickCount 商品点击数
     */
    public void setClickCount(Long clickCount) {
        this.clickCount = clickCount;
    }

    /**
     * 获取商品的显示顺序
     *
     * @return SORT_ORDER - 商品的显示顺序
     */
    public Long getSortOrder() {
        return sortOrder;
    }

    /**
     * 设置商品的显示顺序
     *
     * @param sortOrder 商品的显示顺序
     */
    public void setSortOrder(Long sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * 获取更新时间
     *
     * @return UPDATE_TIME - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取上架时间
     *
     * @return ADD_TIME - 上架时间
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * 设置上架时间
     *
     * @param addTime 上架时间
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * 获取市场售价
     *
     * @return MARKET_PRICE - 市场售价
     */
    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    /**
     * 设置市场售价
     *
     * @param marketPrice 市场售价
     */
    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    /**
     * 获取本店售价
     *
     * @return SHOP_PRICE - 本店售价
     */
    public BigDecimal getShopPrice() {
        return shopPrice;
    }

    /**
     * 设置本店售价
     *
     * @param shopPrice 本店售价
     */
    public void setShopPrice(BigDecimal shopPrice) {
        this.shopPrice = shopPrice;
    }

    /**
     * 获取促销价格
     *
     * @return PROMOTE_PRICE - 促销价格
     */
    public BigDecimal getPromotePrice() {
        return promotePrice;
    }

    /**
     * 设置促销价格
     *
     * @param promotePrice 促销价格
     */
    public void setPromotePrice(BigDecimal promotePrice) {
        this.promotePrice = promotePrice;
    }

    /**
     * 获取促销价格开始日期
     *
     * @return PROMOTE_START_DATE - 促销价格开始日期
     */
    public Date getPromoteStartDate() {
        return promoteStartDate;
    }

    /**
     * 设置促销价格开始日期
     *
     * @param promoteStartDate 促销价格开始日期
     */
    public void setPromoteStartDate(Date promoteStartDate) {
        this.promoteStartDate = promoteStartDate;
    }

    /**
     * 获取促销价格结束日期
     *
     * @return PROMOTE_END_DATE - 促销价格结束日期
     */
    public Date getPromoteEndDate() {
        return promoteEndDate;
    }

    /**
     * 设置促销价格结束日期
     *
     * @param promoteEndDate 促销价格结束日期
     */
    public void setPromoteEndDate(Date promoteEndDate) {
        this.promoteEndDate = promoteEndDate;
    }

    /**
     * 获取兑换所需积分
     *
     * @return INTEGRAL - 兑换所需积分
     */
    public Long getIntegral() {
        return integral;
    }

    /**
     * 设置兑换所需积分
     *
     * @param integral 兑换所需积分
     */
    public void setIntegral(Long integral) {
        this.integral = integral;
    }

    /**
     * 获取商品库存
     *
     * @return REPERTORY - 商品库存
     */
    public Long getRepertory() {
        return repertory;
    }

    /**
     * 设置商品库存
     *
     * @param repertory 商品库存
     */
    public void setRepertory(Long repertory) {
        this.repertory = repertory;
    }

    /**
     * 获取是否上架:0，否；1，是
     *
     * @return IS_SALE - 是否上架:0，否；1，是
     */
    public String getIsSale() {
        return isSale;
    }

    /**
     * 设置是否上架:0，否；1，是
     *
     * @param isSale 是否上架:0，否；1，是
     */
    public void setIsSale(String isSale) {
        this.isSale = isSale;
    }

    /**
     * 获取是否新品:0，否；1，是
     *
     * @return IS_NEW - 是否新品:0，否；1，是
     */
    public String getIsNew() {
        return isNew;
    }

    /**
     * 设置是否新品:0，否；1，是
     *
     * @param isNew 是否新品:0，否；1，是
     */
    public void setIsNew(String isNew) {
        this.isNew = isNew;
    }

    /**
     * 获取是否精品:0，否；1，是
     *
     * @return IS_BEST - 是否精品:0，否；1，是
     */
    public String getIsBest() {
        return isBest;
    }

    /**
     * 设置是否精品:0，否；1，是
     *
     * @param isBest 是否精品:0，否；1，是
     */
    public void setIsBest(String isBest) {
        this.isBest = isBest;
    }

    /**
     * 获取是否热销:0，否；1，是
     *
     * @return IS_HOT - 是否热销:0，否；1，是
     */
    public String getIsHot() {
        return isHot;
    }

    /**
     * 设置是否热销:0，否；1，是
     *
     * @param isHot 是否热销:0，否；1，是
     */
    public void setIsHot(String isHot) {
        this.isHot = isHot;
    }

    /**
     * 获取是否特价促销:0，否；1，是
     *
     * @return IS_PROMOTE - 是否特价促销:0，否；1，是
     */
    public String getIsPromote() {
        return isPromote;
    }

    /**
     * 设置是否特价促销:0，否；1，是
     *
     * @param isPromote 是否特价促销:0，否；1，是
     */
    public void setIsPromote(String isPromote) {
        this.isPromote = isPromote;
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
     * @return RETURN_DISCOUNT
     */
    public BigDecimal getReturnDiscount() {
        return returnDiscount;
    }

    /**
     * @param returnDiscount
     */
    public void setReturnDiscount(BigDecimal returnDiscount) {
        this.returnDiscount = returnDiscount;
    }

    /**
     * 获取描述
     *
     * @return DESCRIPTION - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取内容
     *
     * @return CONTENT - 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置内容
     *
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}