package com.zhangheng.common;

import java.util.List;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageInfo;

/**
 * 公用service层
 * 
 * @author zhangh
 * @date 2018年4月26日上午9:14:36
 * @param <T>
 */
@Service
public interface BaseService<T extends BaseEntity> {

	/**
	 * 根据主键ID查询数据
	 * 
	 * @param id
	 * @return
	 */
	public BaseEntity findById(Number id);

	/**
	 * 添加实体类
	 * 
	 * @param t
	 */
	public void add(T t);

	/**
	 * 分页查询数据 返回一个分页对象（包含分页的导航页）
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @param t
	 *            查询条件
	 * @return
	 */
	public PageInfo<T> pageList(Integer pageNum, Integer pageSize, T t);

	/**
	 * 查询
	 * 
	 * @param t
	 * @return
	 */
	public List<T> findList(T t);

	/**
	 * 根据主键删除
	 * 
	 * @param id
	 */
	public void deleteById(Number id);

	/**
	 * 根据主键更新
	 * 
	 * @param id
	 * @param t
	 */
	public void update(Number id, T t);
}
