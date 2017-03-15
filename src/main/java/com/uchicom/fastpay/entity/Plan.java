// (c) 2017 uchicom
package com.uchicom.fastpay.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author uchicom: Shigeki Uchiyama
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Plan extends AbstractEntity {

	private Integer subscriptionId;

	private int amount;

	@JsonProperty("trial_count")
	private int trialCount;

	@JsonProperty("interval_count")
	private int intervalCount;

	@JsonProperty("interval")
	private String planInterval;

	private String name;

	private boolean livemode;

	private String object;

	@JsonProperty("id")
	private String fastpayId;

	/**
	 * amountを取得します.
	 *
	 * @return amount
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * amountを設定します.
	 *
	 * @param amount amount
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}

	/**
	 * trialCountを取得します.
	 *
	 * @return trialCount
	 */
	public int getTrialCount() {
		return trialCount;
	}

	/**
	 * trialCountを設定します.
	 *
	 * @param trialCount trialCount
	 */
	public void setTrialCount(int trialCount) {
		this.trialCount = trialCount;
	}

	/**
	 * intervalCountを取得します.
	 *
	 * @return intervalCount
	 */
	public int getIntervalCount() {
		return intervalCount;
	}

	/**
	 * intervalCountを設定します.
	 *
	 * @param intervalCount intervalCount
	 */
	public void setIntervalCount(int intervalCount) {
		this.intervalCount = intervalCount;
	}

	/**
	 * planIntervalを取得します.
	 *
	 * @return planInterval
	 */
	public String getPlanInterval() {
		return planInterval;
	}

	/**
	 * planIntervalを設定します.
	 *
	 * @param planInterval planInterval
	 */
	public void setPlanInterval(String planInterval) {
		this.planInterval = planInterval;
	}

	/**
	 * nameを取得します.
	 *
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * nameを設定します.
	 *
	 * @param name name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * livemodeを取得します.
	 *
	 * @return livemode
	 */
	public boolean isLivemode() {
		return livemode;
	}

	/**
	 * livemodeを設定します.
	 *
	 * @param livemode livemode
	 */
	public void setLivemode(boolean livemode) {
		this.livemode = livemode;
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
	 * subscriptionIdを取得します.
	 *
	 * @return subscriptionId
	 */
	public Integer getSubscriptionId() {
		return subscriptionId;
	}

	/**
	 * subscriptionIdを設定します.
	 *
	 * @param subscriptionId subscriptionId
	 */
	public void setSubscriptionId(Integer subscriptionId) {
		this.subscriptionId = subscriptionId;
	}
}
