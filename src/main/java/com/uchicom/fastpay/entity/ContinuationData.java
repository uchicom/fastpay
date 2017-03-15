// (c) 2017 uchicom
package com.uchicom.fastpay.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author uchicom: Shigeki Uchiyama
 *
 */
public class ContinuationData extends Data {

	private SubscriptionCharge subscriptionCharge;

	@JsonCreator
	public static ContinuationData create(
			@JsonProperty("object") SubscriptionCharge subscriptionCharge) {
		return new ContinuationData(subscriptionCharge);
	}

	public ContinuationData(SubscriptionCharge subscriptionCharge) {
		this.subscriptionCharge = subscriptionCharge;
	}

	/**
	 * subscriptionChargeを取得します.
	 *
	 * @return subscriptionCharge
	 */
	public SubscriptionCharge getSubscriptionCharge() {
		return subscriptionCharge;
	}

	/**
	 * subscriptionChargeを設定します.
	 *
	 * @param subscriptionCharge subscriptionCharge
	 */
	public void setSubscriptionCharge(SubscriptionCharge subscriptionCharge) {
		this.subscriptionCharge = subscriptionCharge;
	}
}
