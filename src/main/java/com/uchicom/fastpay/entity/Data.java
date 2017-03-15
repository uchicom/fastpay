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
public class Data extends AbstractEntity {

	private Integer eventId;

	private String object;

	private String subscription;

	@JsonProperty("period_start")
	private Date periodStart;

	@JsonProperty("period_end")
	private Date periodEnd;

	private Notification charge;

	private Notification capture;

	private Notification refund;

	@JsonProperty("system_refund")
	private Notification systemRefund;

	/**
	 * eventIdを取得します.
	 *
	 * @return eventId
	 */
	public Integer getEventId() {
		return eventId;
	}

	/**
	 * eventIdを設定します.
	 *
	 * @param eventId eventId
	 */
	public void setEventId(Integer eventId) {
		this.eventId = eventId;
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
	 * subscriptionを取得します.
	 *
	 * @return subscription
	 */
	public String getSubscription() {
		return subscription;
	}

	/**
	 * subscriptionを設定します.
	 *
	 * @param subscription subscription
	 */
	public void setSubscription(String subscription) {
		this.subscription = subscription;
	}

	/**
	 * periodStartを取得します.
	 *
	 * @return periodStart
	 */
	public Date getPeriodStart() {
		return periodStart;
	}

	/**
	 * periodStartを設定します.
	 *
	 * @param periodStart periodStart
	 */
	public void setPeriodStart(Date periodStart) {
		this.periodStart = periodStart;
	}

	/**
	 * periodEndを取得します.
	 *
	 * @return periodEnd
	 */
	public Date getPeriodEnd() {
		return periodEnd;
	}

	/**
	 * periodEndを設定します.
	 *
	 * @param periodEnd periodEnd
	 */
	public void setPeriodEnd(Date periodEnd) {
		this.periodEnd = periodEnd;
	}

	/**
	 * chargeを取得します.
	 *
	 * @return charge
	 */
	public Notification getCharge() {
		return charge;
	}

	/**
	 * chargeを設定します.
	 *
	 * @param charge charge
	 */
	public void setCharge(Notification charge) {
		this.charge = charge;
	}

	/**
	 * captureを取得します.
	 *
	 * @return capture
	 */
	public Notification getCapture() {
		return capture;
	}

	/**
	 * captureを設定します.
	 *
	 * @param capture capture
	 */
	public void setCapture(Notification capture) {
		this.capture = capture;
	}

	/**
	 * refundを取得します.
	 *
	 * @return refund
	 */
	public Notification getRefund() {
		return refund;
	}

	/**
	 * refundを設定します.
	 *
	 * @param refund refund
	 */
	public void setRefund(Notification refund) {
		this.refund = refund;
	}

	/**
	 * systemRefundを取得します.
	 *
	 * @return systemRefund
	 */
	public Notification getSystemRefund() {
		return systemRefund;
	}

	/**
	 * systemRefundを設定します.
	 *
	 * @param systemRefund systemRefund
	 */
	public void setSystemRefund(Notification systemRefund) {
		this.systemRefund = systemRefund;
	}
}
