// (c) 2017 uchicom
package com.uchicom.fastpay.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.uchicom.fastpay.entity.Plan;

/**
 * @author uchicom: Shigeki Uchiyama
 *
 */
public interface PlanMapper {

	public int insert(Plan plan);

	public List<Plan> select(Plan plan);

	public static PlanMapper get(SqlSession sqlSession) {
		return sqlSession.getMapper(PlanMapper.class);
	}
}
