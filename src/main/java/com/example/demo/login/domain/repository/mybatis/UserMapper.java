package com.example.demo.login.domain.repository.mybatis;


import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.login.domain.model.User;

//ポイント1 : @Mapper
@Mapper
public interface UserMapper {

	//ポイント2 : 変数の指定
	//登録用メソッド
	@Insert("INSERT INTO m_user("
			+"user_id,"
			+"password,"
			+"user_name,"
			+"biethday,"
			+"age,"
			+"marriage,"
			+"role)"
			+" VALUES("
			+" #{userId},"
			+" #{password},"
			+" #{userName},"
			+" #{birthday},"
			+" #{age},"
			+" #{marriage},"
			+" #{role},")
	public boolean insert(User user);


	//ポイント3 : カラム名
	//1件検索用メソッド
	@Select("SELECT user_id AS userId,"
			+"password,"
			+"user_name AS userName,"
			+"birthday,"
			+"age,"
			+"marriage,"
			+"role,"
			+"FROM m_user"
			+" WHERE user_id=#{userId}")
	public User selectOne(String userId);


	//全件検索用メソッド
	@Select("SELECT user_id AS userId,"
			+"password,"
			+"user_name AS userName,"
			+"birthday,"
			+"age,"
			+"marriage,"
			+"role,"
			+"FROM m_user")
	public List<User> slectMany();


	//1件更新用メソッド
	@Update("UPDATE m_user SET"
			+"password=#{password},"
			+"user_name=#{userName},"
			+"birthday=#{birthday},"
			+"age=#{age},"
			+"marriage=#{marriage},"
			+"WHERE userId=#{userId}")
	public boolean updateOne(User user);


	//1件削除用メソッド
	@Delete("DELETE FROM m_user WHERE user_id=#{userId}")
	public boolean deleteOne(String userId);
}