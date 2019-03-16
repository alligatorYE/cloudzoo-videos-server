package com.cloudzoo.mapper;

import java.util.List;

import com.cloudzoo.pojo.SearchRecords;
import com.cloudzoo.utils.MyMapper;

public interface SearchRecordsMapper extends MyMapper<SearchRecords> {
	
	public List<String> getHotwords();
}