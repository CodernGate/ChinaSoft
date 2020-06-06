package com.chinasoft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.chinasoft.pojo.User;

public interface UserMapper {

	//没有参数的形式来添加用户
	void addUserNoPar();
	//有参数的形式来添加用户
	void addUserByPar(User user);
	//动态添加用户
	void addUserDyn(User user);
	//有参数有返回值的形式来查找用户
	User selectOneByPar(int id);
	//分页查询
	@Select("select * from user limit #{limit} offset #{offset}")
	List<User> selectUserByPages(@Param("limit") int limit,@Param("offset") int offset);
	//使用注解的方式查找所有用户
	@Select("select * from user")
	List<User> selectAll();
	//使用$来根据需要排序
	List<User> selectUserOrderBy(@Param("column") String column);
}
