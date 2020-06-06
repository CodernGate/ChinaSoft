package com.chinasoft.mapper;

import java.util.List;

import com.chinasoft.pojo.Gender;
import com.chinasoft.pojo.Student;

public interface GenderMapper {

	Gender selectOneGenderWithUser(int id);
}
