// (c) 2017 uchicom
package com.uchicom.fastpay.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.uchicom.fastpay.entity.Data;

/**
 * @author uchicom: Shigeki Uchiyama
 *
 */
public interface DataMapper {

	public int insert(Data data);

	public List<Data> select(Data data);

	public static DataMapper get(SqlSession sqlSession) {
		return sqlSession.getMapper(DataMapper.class);
	}
}
