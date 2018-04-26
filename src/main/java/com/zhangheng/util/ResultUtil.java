package com.zhangheng.util;

import com.zhangheng.common.ResultEnum;
import com.zhangheng.common.ResultInfo;

public class ResultUtil {

	public static ResultInfo<Object> success(Object obj){
		return new ResultInfo<Object>(true, 1, "成功", obj);
	}
	public static ResultInfo<Object> success(){
		return new ResultInfo<Object>(true, 1, "成功", null);
	}
	public static ResultInfo<Object> error(Integer code,String msg){
		return new ResultInfo<Object>(false, code, msg, null);
	}
	public static ResultInfo<Object> error(Integer code){
		return new ResultInfo<Object>(false, code, "发生位置错误", null);
	}
	public static ResultInfo<Object> error(ResultEnum resultEnum){
		return new ResultInfo<Object>(false, resultEnum.getCode(), resultEnum.getMsg(), null);
	}
}
