// (c) 2017 uchicom
package com.uchicom.fastpay.entity;

import java.util.Arrays;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author uchicom: Shigeki Uchiyama
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Charge extends AbstractEntity {

	@JsonProperty("id")
	private String fastpayId;

	private String object;

	private boolean livemode;

	private String currency;

	private String description;

	private Integer amount;

	@JsonProperty("amount_refunded")
	private Integer amountRefunded;

	private Date created;

	private boolean paid;

	private boolean refunded;

	@JsonProperty("failure_code")
	private String failureCode;

	@JsonProperty("failure_message")
	private String failureMessage;

	private Card card;

	private boolean captured;

	private Refund[] refunds;

	private String customer;

	public String getFastpayId() {
		return fastpayId;
	}

	public void setFastpayId(String fastpayId) {
		this.fastpayId = fastpayId;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public boolean isLivemode() {
		return livemode;
	}

	public void setLivemode(boolean livemode) {
		this.livemode = livemode;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getAmountRefunded() {
		return amountRefunded;
	}

	public void setAmountRefunded(Integer amountRefunded) {
		this.amountRefunded = amountRefunded;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = new Date(created.getTime() * 1000);
	}

	public boolean isPaid() {
		return paid;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	public boolean isRefunded() {
		return refunded;
	}

	public void setRefunded(boolean refunded) {
		this.refunded = refunded;
	}

	public String getFailureCode() {
		return failureCode;
	}

	public void setFailureCode(String failureCode) {
		this.failureCode = failureCode;
	}

	public String getFailureMessage() {
		return failureMessage;
	}

	public void setFailureMessage(String failureMessage) {
		this.failureMessage = failureMessage;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public boolean isCaptured() {
		return captured;
	}

	public void setCaptured(boolean captured) {
		this.captured = captured;
	}

	public Refund[] getRefunds() {
		return refunds;
	}

	public void setRefunds(Refund[] refunds) {
		this.refunds = refunds;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((amountRefunded == null) ? 0 : amountRefunded.hashCode());
		result = prime * result + (captured ? 1231 : 1237);
		result = prime * result + ((card == null) ? 0 : card.hashCode());
		result = prime * result + ((created == null) ? 0 : created.hashCode());
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((failureCode == null) ? 0 : failureCode.hashCode());
		result = prime * result + ((failureMessage == null) ? 0 : failureMessage.hashCode());
		result = prime * result + ((fastpayId == null) ? 0 : fastpayId.hashCode());
		result = prime * result + (livemode ? 1231 : 1237);
		result = prime * result + ((object == null) ? 0 : object.hashCode());
		result = prime * result + (paid ? 1231 : 1237);
		result = prime * result + (refunded ? 1231 : 1237);
		result = prime * result + Arrays.hashCode(refunds);
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
		Charge other = (Charge) obj;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (amountRefunded == null) {
			if (other.amountRefunded != null)
				return false;
		} else if (!amountRefunded.equals(other.amountRefunded))
			return false;
		if (captured != other.captured)
			return false;
		if (card == null) {
			if (other.card != null)
				return false;
		} else if (!card.equals(other.card))
			return false;
		if (created == null) {
			if (other.created != null)
				return false;
		} else if (!created.equals(other.created))
			return false;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (failureCode == null) {
			if (other.failureCode != null)
				return false;
		} else if (!failureCode.equals(other.failureCode))
			return false;
		if (failureMessage == null) {
			if (other.failureMessage != null)
				return false;
		} else if (!failureMessage.equals(other.failureMessage))
			return false;
		if (fastpayId == null) {
			if (other.fastpayId != null)
				return false;
		} else if (!fastpayId.equals(other.fastpayId))
			return false;
		if (livemode != other.livemode)
			return false;
		if (object == null) {
			if (other.object != null)
				return false;
		} else if (!object.equals(other.object))
			return false;
		if (paid != other.paid)
			return false;
		if (refunded != other.refunded)
			return false;
		if (!Arrays.equals(refunds, other.refunds))
			return false;
		return true;
	}
}
