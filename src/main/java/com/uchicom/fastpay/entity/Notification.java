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
public class Notification extends AbstractEntity {

	private Integer dataId;

	@JsonProperty("id")
	private String fastpayId;

	private Date created;

	private String object;

	/**
	 * dataIdを取得します.
	 *
	 * @return dataId
	 */
	public Integer getDataId() {
		return dataId;
	}

	/**
	 * dataIdを設定します.
	 *
	 * @param dataId dataId
	 */
	public void setDataId(Integer dataId) {
		this.dataId = dataId;
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
		this.created = created;
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
}
