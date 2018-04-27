package com.zhangheng.common;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.zhangheng.annotation.CheckParam;
import com.zhangheng.util.ResultUtil;

/**
 * 通用的实体操作控制器
 * 
 * @author zhangh
 *
 * @param <Domain>
 * @param <CommonService>
 * @param <Id>
 */
public class BaseController<Domain extends BaseEntity, CommonService extends BaseService<Domain>, Id extends Number> {

	@Resource
	private CommonService commonService;

	/**
	 * 根据ID查询
	 * 
	 * @param id
	 * @return
	 */
	@CheckParam
	@RequestMapping("/findById/{id}")
	public ResultInfo<Object> findById(@PathVariable("id") Id id) {
		return ResultUtil.success(ResultEnum.SUCCESS,commonService.findById(id));
	}

	/**
	 * 添加
	 * 
	 * @param user
	 * @return
	 */
	@CheckParam
	@PostMapping("/add")
	@ResponseBody
	public ResultInfo<Object> add(@RequestBody Domain domain) {
		commonService.add(domain);
		return ResultUtil.success(ResultEnum.SUCCESS,domain);
	}

	/**
	 * 分页查询
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @param condition
	 * @return
	 */
	@PostMapping("/findListPage/{pageNum}/{pageSize}")
	public ResultInfo<Object> pageListPage(@PathVariable Integer pageNum, @PathVariable Integer pageSize,
			@RequestBody(required = false) Domain condition) {
		return ResultUtil.success(ResultEnum.SUCCESS,commonService.pageList(pageNum, pageSize, condition == null ? null : condition));
	}

	/**
	 * 查询数据
	 * 
	 * @param condition
	 * @return
	 */
	@PostMapping("/findList")
	public ResultInfo<Object> findList(@RequestBody(required = false) Domain condition) {
		return ResultUtil.success(ResultEnum.SUCCESS,commonService.findList(condition));
	}

	/**
	 * 根据主键删除
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteById/{id}")
	public ResultInfo<Object> deleteById(@PathVariable Integer id) {
		commonService.deleteById(id);
		return ResultUtil.success(ResultEnum.SUCCESS);
	}

	/**
	 * 更新数据
	 * 
	 * @param id
	 * @param condition
	 * @return
	 */
	@PostMapping("/update/{id}")
	public ResultInfo<Object> update(@PathVariable Integer id, @RequestBody Domain condition) {
		commonService.update(id, condition);
		return ResultUtil.success(ResultEnum.SUCCESS);
	}
}
