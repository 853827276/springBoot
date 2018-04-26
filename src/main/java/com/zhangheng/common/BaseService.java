package com.zhangheng.common;

import java.util.List;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;

/**
 * 公用service层
 * @author zhangh
 * @date 2018年4月26日上午9:14:36
 * @param <T>
 */
@Service
public interface BaseService<T extends BaseEntity> {

	public BaseEntity findById(Number id);

	public void add(T t);
	
	public PageInfo<T> pageList(Integer pageNum, Integer pageSize, T t);

	public List<T> findList(T t);

	public void deleteById(Number id);

	public void update(Number id,T t);
}
