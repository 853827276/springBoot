package com.zhangheng.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 公用service实现层
 * @author zhangh
 * @date 2018年4月26日上午9:15:01
 */
public class BaseServiceImpl implements BaseService<BaseEntity> {

	@Autowired
	private BaseDao<BaseEntity> baseDao;

	@Override
	public BaseEntity findById(Number id) {
		return baseDao.findById(id);
	}

	@Override
	public void add(BaseEntity t) {
		baseDao.add(t);
	}
	
	@Override
	public PageInfo<BaseEntity> pageList(Integer pageNum, Integer pageSize, BaseEntity t) {
		Page<BaseEntity> pag= PageHelper.startPage(pageNum, pageSize);
		findList(t);
		PageInfo<BaseEntity> pageInfo = new PageInfo<>(pag);
		return pageInfo;
	}

	@Override
	public List<BaseEntity> findList(BaseEntity t) {
		return baseDao.findList(t==null?null:t);
	}


	@Override
	public void deleteById(Number id) {
		baseDao.deleteById(id);
	}

	@Override
	public void update(Number id,BaseEntity t) {
		baseDao.update(id,t);
	}

}
