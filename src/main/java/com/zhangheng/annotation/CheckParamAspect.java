package com.zhangheng.annotation;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import com.zhangheng.common.ResultEnum;
import com.zhangheng.exception.MyException;
import com.zhangheng.util.AnnotationUtil;

/**
 * 自定义校验参数切面
 * 
 * @author zhangh
 * @date 2018年4月26日上午10:03:32
 */
@Aspect
@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CheckParamAspect {

	private static Logger logger = Logger.getLogger(CheckParamAspect.class);

	@Pointcut("@annotation(com.zhangheng.annotation.CheckParam)")
	public void pointCut() {

	}

	/**
	 * 切面前置处理
	 * 
	 * @param joinPoint
	 */
	@Before("pointCut()")
	public void before(JoinPoint joinPoint) {
		MethodSignature sign = (MethodSignature) joinPoint.getSignature();
		logger.info("打印：" + sign.getDeclaringTypeName() + " 前置日志");
	}

	/**
	 * 切面回环处理 这个方法里不允许出现try catch 异常捕获 必须要往外抛
	 * 
	 * @param proceedingJoinPoint
	 * @return
	 * @throws Throwable
	 * @author zhangh
	 */
	@Around("pointCut()")
	public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		Object[] params = proceedingJoinPoint.getArgs();
		boolean hasAuthor = params != null && params.length > 0 ? true : false;
		if (hasAuthor && !params[0].toString().equals("-1")) {// 模拟校验参数
			return proceedingJoinPoint.proceed();
		} else {
			logger.info("很抱歉  方法" + AnnotationUtil.getClassName(proceedingJoinPoint) + "."
					+ AnnotationUtil.getMethodName(proceedingJoinPoint) + "参数校验失败");
			throw new MyException(ResultEnum.PARAM_ERROR);
		}
	}

	/**
	 * 切面后置处理
	 * 
	 * @param joinPoint
	 */
	@After("pointCut()")
	public void after(JoinPoint joinPoint) {
		logger.info("调用aspect 方法结束");
	}
}
