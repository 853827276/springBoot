package com.zhangheng.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import com.zhangheng.common.ResultInfo;
import com.zhangheng.util.ResultUtil;

@ControllerAdvice
public class MyExceptionHandler {

	/**
	 * 全局异常处理
	 * 
	 * @param e
	 * @return
	 */
	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public ResultInfo<Object> handle(Exception e) {
		if (e instanceof MyException) {
			return ResultUtil.error(((MyException) e).getCode(), e.getMessage());
		}else {
			//String errorInfo = e.getCause().toString().substring(e.getCause().toString().lastIndexOf(":") + 1);
			return ResultUtil.error(-3, e.getMessage());
		}
	}

	/**
	 * MyException 异常处理
	 * 
	 * @param e
	 * @return
	 */
	@ExceptionHandler(value = MyException.class)
	@ResponseBody
	public ResultInfo<Object> MyExceptionHandle(MyException e) {
		if (e instanceof MyException) {
			return ResultUtil.error(((MyException) e).getCode(), e.getMessage());
		} else {
			//String errorInfo = e.getCause().toString().substring(e.getCause().toString().lastIndexOf(":") + 1);
			return ResultUtil.error(-3, e.getMessage());
		}
	}

}
