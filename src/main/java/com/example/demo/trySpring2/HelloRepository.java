package com.example.demo.trySpring2;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//ポイント1 : @Repository No.520
@Repository
public class HelloRepository {


	//ポイント2 : JdbcTemplate No.520
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Map<String,Object>findOne(int id){

		//SELECT文
		String query="SELECT"
			+ " employee_id,"
			+ "employee_name,"
			+ "age "
			+ "FROM employee "
			+ "WHERE employee_id=?";

		//検索実行
		Map<String,Object>employee = jdbcTemplate.queryForMap(query,id);
		return employee;
	}
}
