package com.example.demo.trySpring2;

import lombok.Data;

//ポイント : @Data NO.536
@Data
public class Employee {
	private int employeeId;      //従業員ID
	private String employeeName; //従業員名
	private int age;             //年齢

}
