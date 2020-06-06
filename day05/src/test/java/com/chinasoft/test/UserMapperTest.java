package com.chinasoft.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.chinasoft.mapper.UserMapper;
import com.chinasoft.pojo.User;
import com.chinasoft.util.SessionUtil;

public class UserMapperTest {

	public SqlSessionFactory factory = SessionUtil.getFactory();

	public static void main(String[] args) {
//		new UserMapperTest().addUserByPar();
		new UserMapperTest().selectOrderBy();
		
		System.out.println(334);
	}

	public void addUser() {
		SqlSession session = factory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		mapper.addUserNoPar();
		session.commit();
		session.close();
	}

	public void addUserByPar() {
		SqlSession session = factory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		mapper.addUserByPar(new User(6, "黎明", "111", null, null, null, null));
		session.commit();
		session.close();
	}

	//动态添加用户
	@Test
	public void addOneUserDyn() {
		SqlSession session = factory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		mapper.addUserDyn(new User(16, "ClearLove7", "777", "777", "Shanghai", null, "2"));
		session.commit();
		session.close();
	}

	@Test
	public void selectOneUser() {
		SqlSession session = factory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		User user = mapper.selectOneByPar(6);
		System.out.println(user);
		session.close();
	}

	@Test
	public void selectOrderBy() {
		SqlSession session = factory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		List<User> users = mapper.selectUserOrderBy("username");
		for (User user : users) {
			System.out.println(user);
		}
		session.close();
	}

	@Test
	public void selectUserByPages() {
		SqlSession session = factory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		List<User> users = mapper.selectUserByPages(4, 0);
		for (User user : users) {
			System.out.println(user);
		}
		session.close();
	}
	
	@Test
	public void selectAll() {
		SqlSession session = factory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		List<User> users = mapper.selectAll();
		for (User user : users) {
			System.out.println(user);
		}
		session.close();
	}

}
