package com.bootdo.cms.dao;

import com.bootdo.cms.domain.AdvDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2017-12-15 16:54:50
 */
@Mapper
public interface AdvDao {

	AdvDO get(Integer id);
	
	List<AdvDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(AdvDO adv);
	
	int update(AdvDO adv);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
