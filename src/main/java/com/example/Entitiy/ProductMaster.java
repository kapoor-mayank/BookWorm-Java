package com.example.Entitiy;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;



@Entity
public class ProductMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    
    private String productName;
    private String productEnglishName;
    
    @OneToOne
    @JoinColumn(name = "typeId")
    private ProductTypeMaster productType;
    
    private Double productBasePrice;
    private Double productSpCost;
    private Double productOfferPrice;
    private Date productOffPriceExpiryDate;
    
    private String productDescriptionShort;
    private String productDescriptionLong;
    private String productISBN;
    private String productAuthor;
    
    @ManyToOne
    @JoinColumn(name = "productPublisher")
    private PublisherMaster productPublisher;
    
    @ManyToOne
    @JoinColumn(name = "productLang")
    private LanguageMaster productLang;
    
    @ManyToOne
    @JoinColumn(name = "productGenre")
    private GenreMaster productGenre;
    
    private boolean isRentable;
    private boolean isLibrary;
    private Double rentPerDay;
    private Double minRentDays;
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductEnglishName() {
		return productEnglishName;
	}
	public void setProductEnglishName(String productEnglishName) {
		this.productEnglishName = productEnglishName;
	}
	public ProductTypeMaster getProductType() {
		return productType;
	}
	public void setProductType(ProductTypeMaster productType) {
		this.productType = productType;
	}
	public Double getProductBasePrice() {
		return productBasePrice;
	}
	public void setProductBasePrice(Double productBasePrice) {
		this.productBasePrice = productBasePrice;
	}
	public Double getProductSpCost() {
		return productSpCost;
	}
	public void setProductSpCost(Double productSpCost) {
		this.productSpCost = productSpCost;
	}
	public Double getProductOfferPrice() {
		return productOfferPrice;
	}
	public void setProductOfferPrice(Double productOfferPrice) {
		this.productOfferPrice = productOfferPrice;
	}
	public Date getProductOffPriceExpiryDate() {
		return productOffPriceExpiryDate;
	}
	public void setProductOffPriceExpiryDate(Date productOffPriceExpiryDate) {
		this.productOffPriceExpiryDate = productOffPriceExpiryDate;
	}
	public String getProductDescriptionShort() {
		return productDescriptionShort;
	}
	public void setProductDescriptionShort(String productDescriptionShort) {
		this.productDescriptionShort = productDescriptionShort;
	}
	public String getProductDescriptionLong() {
		return productDescriptionLong;
	}
	public void setProductDescriptionLong(String productDescriptionLong) {
		this.productDescriptionLong = productDescriptionLong;
	}
	public String getProductISBN() {
		return productISBN;
	}
	public void setProductISBN(String productISBN) {
		this.productISBN = productISBN;
	}
	public String getProductAuthor() {
		return productAuthor;
	}
	public void setProductAuthor(String productAuthor) {
		this.productAuthor = productAuthor;
	}
	public LanguageMaster getProductLang() {
		return productLang;
	}
	public void setProductLang(LanguageMaster productLang) {
		this.productLang = productLang;
	}
	public GenreMaster getProductGenre() {
		return productGenre;
	}
	public void setProductGenre(GenreMaster productGenre) {
		this.productGenre = productGenre;
	}
	public boolean isRentable() {
		return isRentable;
	}
	public void setRentable(boolean isRentable) {
		this.isRentable = isRentable;
	}
	public boolean isLibrary() {
		return isLibrary;
	}
	public void setLibrary(boolean isLibrary) {
		this.isLibrary = isLibrary;
	}
	public Double getRentPerDay() {
		return rentPerDay;
	}
	public void setRentPerDay(Double rentPerDay) {
		this.rentPerDay = rentPerDay;
	}
	public Double getMinRentDays() {
		return minRentDays;
	}
	public void setMinRentDays(Double minRentDays) {
		this.minRentDays = minRentDays;
	}
	public PublisherMaster getProductPublisher() {
		return productPublisher;
	}
	public void setProductPublisher(PublisherMaster productPublisher) {
		this.productPublisher = productPublisher;
	}
	@Override
	public String toString() {
		return "ProductMaster [productId=" + productId + ", productName=" + productName + ", productEnglishName="
				+ productEnglishName + ", productType=" + productType + ", productBasePrice=" + productBasePrice
				+ ", productSpCost=" + productSpCost + ", productOfferPrice=" + productOfferPrice
				+ ", productOffPriceExpiryDate=" + productOffPriceExpiryDate + ", productDescriptionShort="
				+ productDescriptionShort + ", productDescriptionLong=" + productDescriptionLong + ", productISBN="
				+ productISBN + ", productAuthor=" + productAuthor + ", productPublisher=" + productPublisher
				+ ", productLang=" + productLang + ", productGenre=" + productGenre + ", isRentable=" + isRentable
				+ ", isLibrary=" + isLibrary + ", rentPerDay=" + rentPerDay + ", minRentDays=" + minRentDays + "]";
	}
    
    // Getter and setter methods
    
}