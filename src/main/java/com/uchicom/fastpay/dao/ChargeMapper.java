// (c) 2017 uchicom
package com.uchicom.fastpay.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.uchicom.fastpay.entity.Charge;

/**
 * @author uchicom: Shigeki Uchiyama
 *
 */
public interface ChargeMapper {

	public int insert(Charge charge);

	public Charge selectOne(Charge charge);

	public List<Charge> select(Charge charge);

	public static ChargeMapper get(SqlSession sqlSession) {
		return sqlSession.getMapper(ChargeMapper.class);
	}
}
