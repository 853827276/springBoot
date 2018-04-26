package com.zhangheng.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

public class AnnotationUtil {

	/**
	 * 获取目标类(父类)的名称（全路经）
	 * 
	 * @param proceedingJoinPoint
	 * @return
	 */
	public static String getTargetClassName(ProceedingJoinPoint proceedingJoinPoint) {
		return proceedingJoinPoint.getTarget().toString();
	}

	/**
	 * 获取代理对象的方法信息（包含返回类型 方法名 参数）
	 * 
	 * @param proceedingJoinPoint
	 * @return
	 */
	public static Signature getSignature(ProceedingJoinPoint proceedingJoinPoint) {
		return proceedingJoinPoint.getSignature();
	}

	/**
	 * 获取代理对象的所属类（返回全路径）
	 * 
	 * @param proceedingJoinPoint
	 * @return
	 */
	public static String getClassName(ProceedingJoinPoint proceedingJoinPoint) {
		return AnnotationUtil.getSignature(proceedingJoinPoint).getDeclaringTypeName();
	}

	/**
	 * 获取代理对象的所属方法名
	 * 
	 * @param proceedingJoinPoint
	 * @return
	 */
	public static String getMethodName(ProceedingJoinPoint proceedingJoinPoint) {
		return AnnotationUtil.getSignature(proceedingJoinPoint).getName();
	}

	/**
	 * 获取目标方法的参数
	 * 
	 * @param proceedingJoinPoint
	 * @return
	 */
	public static Object[] getParams(ProceedingJoinPoint proceedingJoinPoint) {
		return proceedingJoinPoint.getArgs();
	}
}
