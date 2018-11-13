package com.lc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.lc.pojo.User;

public interface UserMapper {
	@Select("select * from t_user where uname=#{0} and pwd=#{1}")
	User checkUser(String uname, String pwd);
	
	@Update("update t_user set pwd=#{1} where uid=#{0}")
	int updateUser(int uid, String newpwd);
	
	@Select("select * from t_user")
	List<User> showInfo();

}
