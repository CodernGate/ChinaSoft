package com.chinasoft.mapper;

import java.util.List;

import com.chinasoft.pojo.Gender;
import com.chinasoft.pojo.Student;

public interface StudentMapper {

	List<Student> SelectAllStudent();
	//多对一查询
	Student SelectOneAll(int id);
	//一对多查询
	List<Gender> SelectOneStudentMany(int id);
}
