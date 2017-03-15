// (c) 2017 uchicom
package com.uchicom.fastpay.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author uchicom: Shigeki Uchiyama
 *
 */
public class ContinuationEvent extends Event {

	@JsonCreator
	public static ContinuationEvent create(
			@JsonProperty("object") String object,
			@JsonProperty("id") String fastpayId,
			@JsonProperty("created") Date created,
			@JsonProperty("livemode") boolean livemode,
			@JsonProperty("type") String type,
			@JsonProperty("data") ContinuationData data) {
		return new ContinuationEvent(object, fastpayId, new Date(created.getTime() * 1000), livemode, type, data);
	}
	/**
	 * @param object
	 * @param fastpayId
	 * @param created
	 * @param livemode
	 * @param type
	 * @param data
	 */
	public ContinuationEvent(String object, String fastpayId,
			Date created, boolean livemode, String type, ContinuationData data) {
		super(object, fastpayId, created, livemode, type, data);
		this.data = data;
	}

	private ContinuationData data;

	/**
	 * dataを取得します.
	 *
	 * @return data
	 */
	public ContinuationData getData() {
		return data;
	}

	/**
	 * dataを設定します.
	 *
	 * @param data data
	 */
	public void setData(ContinuationData data) {
		this.data = data;
	}
}
