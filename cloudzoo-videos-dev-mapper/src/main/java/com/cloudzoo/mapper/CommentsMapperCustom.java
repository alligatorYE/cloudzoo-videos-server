package com.cloudzoo.mapper;

import java.util.List;

import com.cloudzoo.pojo.Comments;
import com.cloudzoo.pojo.vo.CommentsVO;
import com.cloudzoo.utils.MyMapper;

public interface CommentsMapperCustom extends MyMapper<Comments> {
	
	public List<CommentsVO> queryComments(String videoId);
}