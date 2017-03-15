// (c) 2017 uchicom
package com.uchicom.fastpay.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author uchicom: Shigeki Uchiyama
 *
 */
public class SubscriptionCharge extends AbstractEntity {

	private String object;

	private String fastpayId;

	private Date periodStart;

	private Date periodEnd;

	private Charge charge;

	@JsonCreator
	public static SubscriptionCharge create(
			@JsonProperty("object") String object,
			@JsonProperty("subscription") String fastpayId,
			@JsonProperty("period_start") Date periodStart,
			@JsonProperty("period_end") Date  periodEnd,
			@JsonProperty("charge") Charge charge) {
		return new SubscriptionCharge(object, fastpayId, new Date(periodStart.getTime() * 1000), new Date(periodEnd.getTime() * 1000), charge);

	}
	public SubscriptionCharge(String object, String fastpayId, Date periodStart, Date periodEnd, Charge charge) {
		this.object = object;
		this.fastpayId = fastpayId;
		this.periodStart = periodStart;
		this.periodEnd = periodEnd;
		this.charge = charge;
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
	public Charge getCharge() {
		return charge;
	}

	/**
	 * chargeを設定します.
	 *
	 * @param charge charge
	 */
	public void setCharge(Charge charge) {
		this.charge = charge;
	}

}
