// (c) 2017 uchicom
package com.uchicom.fastpay.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author uchicom: Shigeki Uchiyama
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Card extends AbstractEntity {

	private int chargeId;

	@JsonProperty("id")
	private String fastpayId;

	private String object;

	private String last4;

	private String type;

	@JsonProperty("exp_month")
	private int expMonth;

	@JsonProperty("exp_year")
	private int expYear;

	public int getChargeId() {
		return chargeId;
	}

	public void setChargeId(int chargeId) {
		this.chargeId = chargeId;
	}

	public String getFastpayId() {
		return fastpayId;
	}

	public void setFastpayId(String fastpayId) {
		this.fastpayId = fastpayId;
	}

	public void setId(String id) {
		this.fastpayId = id;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public String getLast4() {
		return last4;
	}

	public void setLast4(String last4) {
		this.last4 = last4;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getExpMonth() {
		return expMonth;
	}

	public void setExpMonth(int expMonth) {
		this.expMonth = expMonth;
	}

	public int getExpYear() {
		return expYear;
	}

	public void setExpYear(int expYear) {
		this.expYear = expYear;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + expMonth;
		result = prime * result + expYear;
		result = prime * result + ((fastpayId == null) ? 0 : fastpayId.hashCode());
		result = prime * result + ((last4 == null) ? 0 : last4.hashCode());
		result = prime * result + ((object == null) ? 0 : object.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (expMonth != other.expMonth)
			return false;
		if (expYear != other.expYear)
			return false;
		if (fastpayId == null) {
			if (other.fastpayId != null)
				return false;
		} else if (!fastpayId.equals(other.fastpayId))
			return false;
		if (last4 == null) {
			if (other.last4 != null)
				return false;
		} else if (!last4.equals(other.last4))
			return false;
		if (object == null) {
			if (other.object != null)
				return false;
		} else if (!object.equals(other.object))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
}
