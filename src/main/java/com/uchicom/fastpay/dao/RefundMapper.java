// (c) 2017 uchicom
package com.uchicom.fastpay.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.uchicom.fastpay.entity.Refund;

/**
 * @author uchicom: Shigeki Uchiyama
 *
 */
public interface RefundMapper {

	public int insert(Refund refund);

	public List<Refund> select(Refund refund);

	public static RefundMapper get(SqlSession sqlSession) {
		return sqlSession.getMapper(RefundMapper.class);
	}
}
