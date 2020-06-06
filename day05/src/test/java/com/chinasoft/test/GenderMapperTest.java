package com.chinasoft.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.chinasoft.mapper.GenderMapper;
import com.chinasoft.pojo.Gender;
import com.chinasoft.util.SessionUtil;

public class GenderMapperTest {

	SqlSessionFactory factory = SessionUtil.getFactory();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Test
	public void testSelectGenderWithUser() {
		SqlSession session = factory.openSession();
		GenderMapper mapper = session.getMapper(GenderMapper.class);
		Gender gender = mapper.selectOneGenderWithUser(1);
		System.out.println(gender);
	}
}
