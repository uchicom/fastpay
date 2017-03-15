// (c) 2017 uchicom
package com.uchicom.fastpay.dao;

import org.apache.ibatis.session.SqlSession;

import com.uchicom.fastpay.entity.Subscription;

/**
 * @author uchicom: Shigeki Uchiyama
 *
 */
public interface SubscriptionMapper {

	public int insert(Subscription subscription);

	public Subscription select(Subscription subscription);

	public static SubscriptionMapper get(SqlSession sqlSession) {
		return sqlSession.getMapper(SubscriptionMapper.class);
	}
}
