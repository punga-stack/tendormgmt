package com.tender.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="tender")
public class Tender {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer tenderId;
	@NotEmpty(message="Enter Name")
	private String tenderName;
	@NotEmpty(message="Enter Desc")
	private String tenderDesc;
	@NotNull(message="Enter Contractor ID")
	private Integer conId;
	@NotEmpty(message="Enter Contractor Name")
	private String conName;
	@NotNull(message="Enter Price")
	private Integer basePrice;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date deadline;
	
	public Tender() {
		// TODO Auto-generated constructor stub
	}

	public Integer getTenderId() {
		return tenderId;
	}

	public void setTenderId(Integer tenderId) {
		this.tenderId = tenderId;
	}

	public String getTenderName() {
		return tenderName;
	}

	public void setTenderName(String tenderName) {
		this.tenderName = tenderName;
	}

	public String getTenderDesc() {
		return tenderDesc;
	}

	public void setTenderDesc(String tenderDesc) {
		this.tenderDesc = tenderDesc;
	}

	public Integer getConId() {
		return conId;
	}

	public void setConId(Integer conId) {
		this.conId = conId;
	}

	public String getConName() {
		return conName;
	}

	public void setConName(String conName) {
		this.conName = conName;
	}

	public Integer getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(Integer basePrice) {
		this.basePrice = basePrice;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public Tender(Integer tenderId, @NotEmpty(message = "Enter Name") String tenderName,
			@NotEmpty(message = "Enter Desc") String tenderDesc,
			@NotNull(message = "Enter Contractor ID") Integer conId,
			@NotEmpty(message = "Enter Contractor Name") String conName,
			@NotNull(message = "Enter Price") Integer basePrice, Date deadline) {
		super();
		this.tenderId = tenderId;
		this.tenderName = tenderName;
		this.tenderDesc = tenderDesc;
		this.conId = conId;
		this.conName = conName;
		this.basePrice = basePrice;
		this.deadline = deadline;
	}

	@Override
	public String toString() {
		return "Tender [tenderId=" + tenderId + ", tenderName=" + tenderName + ", tenderDesc=" + tenderDesc + ", conId="
				+ conId + ", conName=" + conName + ", basePrice=" + basePrice + ", deadline=" + deadline + "]";
	}

	
}
