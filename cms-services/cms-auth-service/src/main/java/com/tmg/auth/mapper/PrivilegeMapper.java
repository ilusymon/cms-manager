package com.tmg.auth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tmg.model.auth.Privilege;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PrivilegeMapper extends BaseMapper<Privilege> {

    Long selectPrivilegesCount(@Param("privilege") Privilege privilege);

    List<Privilege> selectPrivileges(@Param("privilege") Privilege privilege, @Param("currentPage") Integer currentPage, @Param("pageSize") Integer pageSize);
}
