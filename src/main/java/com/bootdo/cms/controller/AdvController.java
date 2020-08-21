package com.bootdo.cms.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.cms.domain.AdvDO;
import com.bootdo.cms.service.AdvService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2017-12-15 16:54:50
 */
 
@Controller
@RequestMapping("/cms/adv")
public class AdvController {
	@Autowired
	private AdvService advService;
	
	@GetMapping()
	@RequiresPermissions("cms:adv:adv")
	String Adv(){
	    return "cms/adv/adv";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("cms:adv:adv")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<AdvDO> advList = advService.list(query);
		int total = advService.count(query);
		PageUtils pageUtils = new PageUtils(advList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("cms:adv:add")
	String add(){
	    return "cms/adv/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("cms:adv:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		AdvDO adv = advService.get(id);
		model.addAttribute("adv", adv);
	    return "cms/adv/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("cms:adv:add")
	public R save( AdvDO adv){
		if(advService.save(adv)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("cms:adv:edit")
	public R update( AdvDO adv){
		advService.update(adv);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("cms:adv:remove")
	public R remove( Integer id){
		if(advService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("cms:adv:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		advService.batchRemove(ids);
		return R.ok();
	}
	
}
