package com.tmg.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tmg.model.auth.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author laixm
 * @since 2021-04-28
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
