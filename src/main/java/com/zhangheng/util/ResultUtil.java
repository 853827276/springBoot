package com.zhangheng.util;

import com.zhangheng.common.ResultEnum;
import com.zhangheng.common.ResultInfo;

/**
 * 接口统一返回标准数据格式
 * @author zhangh
 * @date 2018年4月27日上午9:13:36
 */
public class ResultUtil {

	/**
	 * 调用成功
	 * @param obj 返回的数据
	 * @return
	 */
	public static ResultInfo<Object> success(ResultEnum resultEnum,Object obj) {
		return new ResultInfo<Object>(true, resultEnum.getCode(), resultEnum.getMsg(), obj);
	}

	/**
	 * 调用成功 不需要返回数据 只返回状态
	 * @return
	 */
	public static ResultInfo<Object> success(ResultEnum resultEnum) {
		return new ResultInfo<Object>(true, resultEnum.getCode(), resultEnum.getMsg(), null);
	}

	/**
	 * 调用失败
	 * @param code 错误码
	 * @param msg 错误信息
	 * @return
	 */
	public static ResultInfo<Object> error(Integer code, String msg) {
		return new ResultInfo<Object>(false, code, msg, null);
	}

	/**
	 * 从先定义好的枚举类中返回接口信息
	 * @param resultEnum
	 * @return
	 */
	public static ResultInfo<Object> error(ResultEnum resultEnum) {
		return new ResultInfo<Object>(false, resultEnum.getCode(), resultEnum.getMsg(), null);
	}
	
	/**
	 * 重写之前已经实例化的枚举信息 不懂的别随意用
	 * @author zhangh
	 * @date 2018/4/27 10:08:22
	 * @param resultEnum
	 * @return
	 */
	public static ResultInfo<Object> error(ResultEnum resultEnum,String msg) {
		return new ResultInfo<Object>(false, resultEnum.getCode(), msg, null);
	}
}
