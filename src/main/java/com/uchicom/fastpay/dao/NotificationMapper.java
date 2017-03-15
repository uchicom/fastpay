// (c) 2017 uchicom
package com.uchicom.fastpay.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.uchicom.fastpay.entity.Notification;

/**
 * @author uchicom: Shigeki Uchiyama
 *
 */
public interface NotificationMapper {

	public int insert(Notification notification);

	public List<Notification> select(Notification notification);

	public static NotificationMapper get(SqlSession sqlSession) {
		return sqlSession.getMapper(NotificationMapper.class);
	}
}
