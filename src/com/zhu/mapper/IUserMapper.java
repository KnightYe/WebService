package com.zhu.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.zhu.bean.User;

public interface IUserMapper {
    @Select("SELECT * FROM T_USER WHERE UID = #{userId}") 
	public User select(@Param("userId") String uid);

	public void insert(User user);

	public void delete(User user);

	public void update(User user);

	public void selectAll();
}
