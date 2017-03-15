// (c) 2017 uchicom
package com.uchicom.fastpay.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author uchicom: Shigeki Uchiyama
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Subscription extends AbstractEntity {

	private Plan plan;

	@JsonProperty("id")
	private String fastpayId;

	private String object;

	@JsonProperty("display_id")
	private String displayId;

	private String status;

	@JsonProperty("cancel_date")
	private Date cancelDate;

	@JsonProperty("suspended_date")
	private Date suspendedDate;

	@JsonProperty("activation_date")
	private Date activationDate;

	private Date created;

	private String customer;

	/**
	 * planを取得します.
	 *
	 * @return plan
	 */
	public Plan getPlan() {
		return plan;
	}

	/**
	 * planを設定します.
	 *
	 * @param plan plan
	 */
	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	/**
	 * fastpayIdを取得します.
	 *
	 * @return fastpayId
	 */
	public String getFastpayId() {
		return fastpayId;
	}

	/**
	 * fastpayIdを設定します.
	 *
	 * @param fastpayId fastpayId
	 */
	public void setFastpayId(String fastpayId) {
		this.fastpayId = fastpayId;
	}

	/**
	 * objectを取得します.
	 *
	 * @return object
	 */
	public String getObject() {
		return object;
	}

	/**
	 * objectを設定します.
	 *
	 * @param object object
	 */
	public void setObject(String object) {
		this.object = object;
	}

	/**
	 * displayIdを取得します.
	 *
	 * @return displayId
	 */
	public String getDisplayId() {
		return displayId;
	}

	/**
	 * displayIdを設定します.
	 *
	 * @param displayId displayId
	 */
	public void setDisplayId(String displayId) {
		this.displayId = displayId;
	}

	/**
	 * statusを取得します.
	 *
	 * @return status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * statusを設定します.
	 *
	 * @param status status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * cancelDateを取得します.
	 *
	 * @return cancelDate
	 */
	public Date getCancelDate() {
		return cancelDate;
	}

	/**
	 * cancelDateを設定します.
	 *
	 * @param cancelDate cancelDate
	 */
	public void setCancelDate(Date cancelDate) {
		if (cancelDate == null) {
			this.cancelDate = null;
		} else {
			this.cancelDate = new Date(cancelDate.getTime() * 1000);
		}
	}

	/**
	 * suspendedDateを取得します.
	 *
	 * @return suspendedDate
	 */
	public Date getSuspendedDate() {
		return suspendedDate;
	}

	/**
	 * suspendedDateを設定します.
	 *
	 * @param suspendedDate suspendedDate
	 */
	public void setSuspendedDate(Date suspendedDate) {
		if (suspendedDate == null) {
			this.suspendedDate = null;
		} else {
			this.suspendedDate = new Date(suspendedDate.getTime() * 1000);
		}
	}

	/**
	 * activationDateを取得します.
	 *
	 * @return activationDate
	 */
	public Date getActivationDate() {
		return activationDate;
	}

	/**
	 * activationDateを設定します.
	 *
	 * @param activationDate activationDate
	 */
	public void setActivationDate(Date activationDate) {
		if (activationDate == null) {
			this.activationDate = null;
		} else {
			this.activationDate = new Date(activationDate.getTime() * 1000);
		}
	}

	/**
	 * createdを取得します.
	 *
	 * @return created
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * createdを設定します.
	 *
	 * @param created created
	 */
	public void setCreated(Date created) {
		if (created == null) {
			this.created = null;
		} else {
			this.created = new Date(created.getTime() * 1000);
		}
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Subscription [plan=" + plan + ", fastpayId=" + fastpayId + ", object=" + object + ", displayId="
				+ displayId + ", status=" + status + ", cancelDate=" + cancelDate + ", suspendedDate=" + suspendedDate
				+ ", activationDate=" + activationDate + ", created=" + created + ", customer=" + customer + "]";
	}
}
