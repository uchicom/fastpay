// (c) 2016 uchicom
package com.uchicom.fastpay.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author uchicom: Shigeki Uchiyama
 *
 */
public abstract class AbstractEntity {

	@JsonIgnore
	protected Integer id;

	@JsonIgnore
	protected String updated;

	@JsonIgnore
	protected Date updateTime;

	@JsonIgnore
	protected Integer updateSeq;

	@JsonIgnore
	protected String inserted;

	@JsonIgnore
	protected Date insertTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getUpdateSeq() {
		return updateSeq;
	}

	public void setUpdateSeq(Integer updateSeq) {
		this.updateSeq = updateSeq;
	}

	public String getInserted() {
		return inserted;
	}

	public void setInserted(String inserted) {
		this.inserted = inserted;
	}

	public Date getInsertTime() {
		return insertTime;
	}

	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}
}
