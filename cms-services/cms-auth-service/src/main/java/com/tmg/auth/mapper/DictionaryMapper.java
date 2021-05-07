package com.tmg.auth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tmg.model.auth.Dictionary;
import com.tmg.model.auth.Privilege;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DictionaryMapper extends BaseMapper<Dictionary> {

    List<Dictionary> queryForTypeId(int typeId);
}
