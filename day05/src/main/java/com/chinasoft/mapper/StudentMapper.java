package com.chinasoft.mapper;

import java.util.List;

import com.chinasoft.pojo.Gender;
import com.chinasoft.pojo.Student;

public interface StudentMapper {

	List<Student> SelectAllStudent();
	//���һ��ѯ
	Student SelectOneAll(int id);
	//һ�Զ��ѯ
	List<Gender> SelectOneStudentMany(int id);
}
