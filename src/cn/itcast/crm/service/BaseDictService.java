package cn.itcast.crm.service;

import java.util.List;

import cn.itcast.crm.pojo.BaseDict;

public interface BaseDictService {
	
	/*
	 * 根据类别码查询
	 */
	List<BaseDict> queryBaseDictByDictTypeCode(String dictTypeCode);
	
	
}
