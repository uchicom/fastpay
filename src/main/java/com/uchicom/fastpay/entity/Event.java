// (c) 2017 uchicom
package com.uchicom.fastpay.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author uchicom: Shigeki Uchiyama
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Event extends AbstractEntity {

	private String object;

	@JsonProperty("id")
	private String fastpayId;

	private Date created;

	boolean livemode;

	private String type;

	private Data data;

	@JsonCreator
	public static Event create(String object, @JsonProperty("id") String fastpayId,
			Date created, boolean livemode, String type, Data data) {
		return new Event(object, fastpayId, new Date(created.getTime() * 1000), livemode, type, data);

	}
	public Event(String object, String fastpayId,
			Date created, boolean livemode, String type, Data data) {
		this.object = object;
		this.fastpayId = fastpayId;
		this.created = created;
		this.livemode = livemode;
		this.type = type;
		this.data = data;
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
	 * typeを取得します.
	 *
	 * @return type
	 */
	public String getType() {
		return type;
	}

	/**
	 * typeを設定します.
	 *
	 * @param type type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * dataを取得します.
	 *
	 * @return data
	 */
	public Data getData() {
		return data;
	}

	/**
	 * dataを設定します.
	 *
	 * @param data data
	 */
	public void setData(Data data) {
		this.data = data;
	}

}
