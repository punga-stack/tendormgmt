package com.tender.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class UserTender {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Integer bidId;
	@NotNull(message="Id is mandatory")
	public Integer userId;
	@NotEmpty(message="Name is mandatory")
	public String tenderName;
	@NotNull(message="Id is mandatory")
	public Integer conId;
	@NotEmpty(message="Name is mandatory")
	public String conName;
	@NotNull(message="Id is mandatory")
	public Integer tenderId;
	@NotEmpty(message="UserName is mandatory")
	public String userName;
	@NotNull(message="Price is mandatory")
	public Integer bidPrice;
	
	public UserTender() {
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

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getBidPrice() {
		return bidPrice;
	}

	public void setBidPrice(Integer bidPrice) {
		this.bidPrice = bidPrice;
	}

	public UserTender(Integer tenderId, @NotEmpty(message = "Name is mandatory") String tenderName,
			@NotNull(message = "Id is mandatory") Integer conId,
			@NotEmpty(message = "Name is mandatory") String conName,
			@NotNull(message = "Id is mandatory") Integer userId,
			@NotEmpty(message = "UserName is mandatory") String userName,
			@NotNull(message = "Price is mandatory") Integer bidPrice) {
		super();
		this.tenderId = tenderId;
		this.tenderName = tenderName;
		this.conId = conId;
		this.conName = conName;
		this.userId = userId;
		this.userName = userName;
		this.bidPrice = bidPrice;
	}

	@Override
	public String toString() {
		return "UserTender [tenderId=" + tenderId + ", tenderName=" + tenderName + ", conId=" + conId + ", conName="
				+ conName + ", userId=" + userId + ", userName=" + userName + ", bidPrice=" + bidPrice + "]";
	}

	
	
}
