package com.zhangheng.entity;

import com.zhangheng.common.BaseEntity;

/**
 * user 实体类
 * 
 * @author zhangh
 * @date 2018年4月26日上午9:15:47
 */
public class User extends BaseEntity {

	private Integer id;
	private String phone;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}