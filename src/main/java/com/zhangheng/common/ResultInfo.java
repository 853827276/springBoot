package com.zhangheng.common;

/**
 * 接口统一返回包装类
 * @author zhangh
 * @date 2018年4月26日上午10:26:08
 * @param <T>
 */
public class ResultInfo<T> {

	private Boolean status;
	private Integer code;
	private String msg;
	private T data;
	
	public ResultInfo() {
		super();
	}

	
	public ResultInfo(Boolean status, Integer code, String msg, T data) {
		super();
		this.status = status;
		this.code = code;
		this.msg = msg;
		this.data = data;
	}


	public ResultInfo(Boolean status, T data) {
		super();
		this.status = status;
		this.data = data;
	}
	public ResultInfo(Boolean status) {
		super();
		this.status = status;
		this.data = null;
	}
	

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
