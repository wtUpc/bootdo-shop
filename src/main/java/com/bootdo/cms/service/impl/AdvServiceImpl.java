package com.bootdo.cms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.cms.dao.AdvDao;
import com.bootdo.cms.domain.AdvDO;
import com.bootdo.cms.service.AdvService;



@Service
public class AdvServiceImpl implements AdvService {
	@Autowired
	private AdvDao advDao;
	
	@Override
	public AdvDO get(Integer id){
		return advDao.get(id);
	}
	
	@Override
	public List<AdvDO> list(Map<String, Object> map){
		return advDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return advDao.count(map);
	}
	
	@Override
	public int save(AdvDO adv){
		return advDao.save(adv);
	}
	
	@Override
	public int update(AdvDO adv){
		return advDao.update(adv);
	}
	
	@Override
	public int remove(Integer id){
		return advDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return advDao.batchRemove(ids);
	}
	
}
