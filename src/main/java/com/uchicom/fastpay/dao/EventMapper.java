// (c) 2017 uchicom
package com.uchicom.fastpay.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.uchicom.fastpay.entity.Event;

/**
 * @author uchicom: Shigeki Uchiyama
 *
 */
public interface EventMapper {

	public int insert(Event event);

	public List<Event> select(Event event);

	public static EventMapper get(SqlSession sqlSession) {
		return sqlSession.getMapper(EventMapper.class);
	}
}
