package com.wuaipic.mapper;

import com.wuaipic.model.BlogEntity;

public interface BlogEntityMapper {
    int deleteByPrimaryKey(String blogId);

    int insert(BlogEntity record);

    int insertSelective(BlogEntity record);

    BlogEntity selectByPrimaryKey(String blogId);

    int updateByPrimaryKeySelective(BlogEntity record);

    int updateByPrimaryKey(BlogEntity record);
}