package com.zhangheng.common;

/**
 * 封装接口返回状态结果集
 * 
 * @author zhangh
 * @date 2018年4月26日下午2:34:37
 */
public enum ResultEnum {
	SUCCESS(1, "成功"), 
	PARAM_ERROR(-1, "参数异常"), 
	AUTHORIZATION_ERROR(-2, "对不起，您的权限不够"), 
	DADABASE_ERROR(-3,"网络超时"), 
	UNKOWN_ERROR(-99, "未知错误");//这里的信息以程序捕获的具体异常信息为主

	private Integer code;
	private String msg;

	ResultEnum(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
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
