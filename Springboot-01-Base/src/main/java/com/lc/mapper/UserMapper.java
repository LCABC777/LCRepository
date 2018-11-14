package com.lc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.lc.pojo.User;

public interface UserMapper {
	@Select("select name,pwd from user where 1=1")
	List<User> selAll();
	@Insert("insert into user values(default,#{0},#{1})")
	void insUser(String name, String pwd);
	@Insert("insert into checkbox values(#{0})")
	void insHobby(String hobby);
}
