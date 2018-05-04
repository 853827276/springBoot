package com.zhangheng.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="author")
public class AuthorBean {

	private String name;
	
	private String email;
	private Integer age;
	private String neck;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getNeck() {
		return neck;
	}
	public void setNeck(String neck) {
		this.neck = neck;
	}
	@Override
	public String toString() {
		return "AuthorBean [name=" + name + ", email=" + email + ", age=" + age + ", neck=" + neck + "]";
	}
	
	
}
