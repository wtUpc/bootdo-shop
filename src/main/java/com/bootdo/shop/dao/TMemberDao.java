package com.bootdo.shop.dao;

import com.bootdo.shop.domain.TMemberDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2017-10-15 15:07:36
 */
@Mapper
public interface TMemberDao {

	TMemberDO get(Long id);
	
	List<TMemberDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(TMemberDO tMember);
	
	int update(TMemberDO tMember);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
