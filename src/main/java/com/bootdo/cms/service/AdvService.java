package com.bootdo.cms.service;

import com.bootdo.cms.domain.AdvDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2017-12-15 16:54:50
 */
public interface AdvService {
	
	AdvDO get(Integer id);
	
	List<AdvDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(AdvDO adv);
	
	int update(AdvDO adv);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
