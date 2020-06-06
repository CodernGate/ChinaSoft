package com.chinasoft.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.chinasoft.mapper.StudentMapper;
import com.chinasoft.pojo.Gender;
import com.chinasoft.pojo.Student;
import com.chinasoft.util.SessionUtil;

public class StudentMapperTest {

	public SqlSessionFactory factory = SessionUtil.getFactory();

	@Test
	public void SelectAllStudent() {
		SqlSession session = factory.openSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		List<Student> students = mapper.SelectAllStudent();
		for (Student student : students) {
			System.out.println(student);
		}
		session.close();
	}

	@Test
	public void SelectOneStudentWithGender() {
		SqlSession session = factory.openSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		Student student = mapper.SelectOneAll(5);
		System.out.println(student);
		session.close();
	}

	@Test
	public void SelectOneStudentMany2One() {
		SqlSession session = factory.openSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		List<Gender> genders = mapper.SelectOneStudentMany(1);
		for (Gender gender : genders) {
			System.out.println(gender);
		}
		session.close();
	}
}
