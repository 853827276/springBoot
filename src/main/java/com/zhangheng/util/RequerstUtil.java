package com.zhangheng.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.util.StringUtils;

/**
 * request 工具类
 * 
 * @author zhangh
 * @date 2018年4月28日上午9:16:21
 */
public class RequerstUtil {

	/**
	 * 获取key对应的值
	 * 
	 * @author zhangh
	 * @date 2018年4月28日上午9:26:03
	 * @param request
	 * @param key
	 * @return
	 */
	public String getString(HttpServletRequest request, String key) {
		return request.getParameter(key);
	}

	/**
	 * 获取key对应的值 如果为空 则返回默认值 defaultValue
	 * 
	 * @author zhangh
	 * @date 2018年4月28日上午9:25:54
	 * @param request
	 * @param key
	 * @param defaultValue
	 *            默认值
	 * @return
	 */
	public String getString(HttpServletRequest request, String key, String defaultValue) {
		return request.getParameter(key) == null ? defaultValue : request.getParameter(key);
	}

	/**
	 * 获取key对应的值 不存在的话返回null
	 * 
	 * @author zhangh
	 * @date 2018年4月28日上午9:33:33
	 * @param request
	 * @param key
	 * @return
	 */
	public int getInt(HttpServletRequest request, String key) {
		return request.getParameter(key) != null ? Integer.parseInt(request.getParameter(key)) : null;
	}

	/**
	 * 获取key对应的值 不存在的话返回 默认值 defaultValue
	 * 
	 * @author zhangh
	 * @date 2018年4月28日上午9:34:54
	 * @param request
	 * @param key
	 * @param defaultValue
	 *            默认值
	 * @return
	 */
	public int getInt(HttpServletRequest request, String key, int defaultValue) {
		return request.getParameter(key) != null ? Integer.parseInt(request.getParameter(key)) : defaultValue;
	}

	/**
	 * 获取key对应的值 不存在的话返回 默认值 defaultValue
	 * 
	 * @author zhangh
	 * @date 2018年4月28日上午9:38:32
	 * @param request
	 * @param key
	 * @return
	 */
	public float getFloat(HttpServletRequest request, String key) {
		return request.getParameter(key) != null ? Float.parseFloat(request.getParameter(key)) : null;
	}

	/**
	 * 获取key对应的值 不存在的话返回 默认值 defaultValue
	 * 
	 * @author zhangh
	 * @date 2018年4月28日上午9:38:38
	 * @param request
	 * @param key
	 * @param defaultValue
	 * @return
	 */
	public float getFloat(HttpServletRequest request, String key, float defaultValue) {
		return request.getParameter(key) != null ? Float.parseFloat(request.getParameter(key)) : defaultValue;
	}
	
	/**
	 * 获取key对应的值 
	 * @author zhangh
	 * @date 2018年4月28日上午9:41:13
	 * @param request
	 * @param key
	 * @return
	 */
	public double getDouble(HttpServletRequest request, String key){
		return request.getParameter(key) != null ? Double.parseDouble(request.getParameter(key)) : null;
	}
	
	/**
	 * 获取key对应的值 不存在的话返回 默认值 defaultValue
	 * @author zhangh
	 * @date 2018年4月28日上午9:41:17
	 * @param request
	 * @param key
	 * @param defaultValue
	 * @return
	 */
	public double getDouble(HttpServletRequest request, String key,double defaultValue){
		return request.getParameter(key) != null ? Double.parseDouble(request.getParameter(key)) : defaultValue;
	}
	
	/**
	 * 获取key对应的值 转化成date类型
	 * @author zhangh
	 * @date 2018年4月28日上午9:50:09
	 * @param request
	 * @param key
	 * @param format
	 * @return
	 * @throws ParseException
	 */
	public Date getDate(HttpServletRequest request,String key,String format) throws ParseException{
		String keyValue = request.getParameter(key);
		if(StringUtils.isEmpty(keyValue)){
			return null;
		}
		if(StringUtils.isEmpty(format)){
			format ="yyyy-MM-dd";
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.parse(keyValue);
	}
}
