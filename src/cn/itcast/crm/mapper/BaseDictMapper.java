package cn.itcast.crm.mapper;

import java.util.List;

import cn.itcast.crm.pojo.BaseDict;

public interface BaseDictMapper {
	/*
	 * 根据类别码查询数据
	 */
	List<BaseDict> queryBaseDictByDictTypeCode(String dictTypeCode);
	
}
