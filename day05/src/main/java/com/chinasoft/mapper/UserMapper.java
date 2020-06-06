package com.chinasoft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.chinasoft.pojo.User;

public interface UserMapper {

	//û�в�������ʽ������û�
	void addUserNoPar();
	//�в�������ʽ������û�
	void addUserByPar(User user);
	//��̬����û�
	void addUserDyn(User user);
	//�в����з���ֵ����ʽ�������û�
	User selectOneByPar(int id);
	//��ҳ��ѯ
	@Select("select * from user limit #{limit} offset #{offset}")
	List<User> selectUserByPages(@Param("limit") int limit,@Param("offset") int offset);
	//ʹ��ע��ķ�ʽ���������û�
	@Select("select * from user")
	List<User> selectAll();
	//ʹ��$��������Ҫ����
	List<User> selectUserOrderBy(@Param("column") String column);
}
