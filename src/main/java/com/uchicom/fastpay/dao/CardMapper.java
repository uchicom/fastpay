// (c) 2017 uchicom
package com.uchicom.fastpay.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.uchicom.fastpay.entity.Card;

/**
 * @author uchicom: Shigeki Uchiyama
 *
 */
public interface CardMapper {

	public int insert(Card card);

	public List<Card> select(Card card);

	public static CardMapper get(SqlSession sqlSession) {
		return sqlSession.getMapper(CardMapper.class);
	}
}
