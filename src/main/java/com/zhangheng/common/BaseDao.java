package com.zhangheng.common;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * dao层
 * @author zhangh
 *
 * @param <T>
 */
public interface BaseDao<T extends BaseEntity> {

	/**
	 * 根据主键查询
	 * @param id
	 * @return
	 */
	public BaseEntity findById(@Param("id") Number id);

	/**
	 * 添加数据
	 * @param t
	 */
	public void add(@Param("domain")T t);
	
	/**
	 * 查询数据
	 * @param t
	 * @return
	 */
	public List<T> findList(@Param("domain") T t);
	
	/**
	 * 根据主键删除
	 * @param id
	 */
	public void deleteById(@Param("id") Number id);
	
	/**
	 * 更新数据
	 * @param t
	 */
	public void update(@Param("id") Number id,@Param("domain")T t);
}
