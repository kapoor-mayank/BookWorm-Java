package com.example.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class RoyaltyCalculation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roycalId;
    
    @ManyToOne
    @JoinColumn(name = "invoiceId")
    private InvoiceTable invoice;
    
    @ManyToOne
    @JoinColumn(name = "benId")
    private BeneficiaryMaster beneficiary;
    
    private Date roycalTrandate;
    
    @ManyToOne
    @JoinColumn(name = "prodId")
    private ProductMaster product;
    
    private int qty;
    private String tranType;
    private double salePrice;
    private double basePrice;
    private double royaltyOnBasePrice;
	public Long getRoycalId() {
		return roycalId;
	}
	public void setRoycalId(Long roycalId) {
		this.roycalId = roycalId;
	}
	public InvoiceTable getInvoice() {
		return invoice;
	}
	public void setInvoice(InvoiceTable invoice) {
		this.invoice = invoice;
	}
	public BeneficiaryMaster getBeneficiary() {
		return beneficiary;
	}
	public void setBeneficiary(BeneficiaryMaster beneficiary) {
		this.beneficiary = beneficiary;
	}
	public Date getRoycalTrandate() {
		return roycalTrandate;
	}
	public void setRoycalTrandate(Date roycalTrandate) {
		this.roycalTrandate = roycalTrandate;
	}
	public ProductMaster getProduct() {
		return product;
	}
	public void setProduct(ProductMaster product) {
		this.product = product;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getTranType() {
		return tranType;
	}
	public void setTranType(String tranType) {
		this.tranType = tranType;
	}
	public double getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
	public double getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}
	public double getRoyaltyOnBasePrice() {
		return royaltyOnBasePrice;
	}
	public void setRoyaltyOnBasePrice(double royaltyOnBasePrice) {
		this.royaltyOnBasePrice = royaltyOnBasePrice;
	}
    
    // Getter and setter methods
    
}