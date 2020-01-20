package com.virus.pt.db.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.virus.pt.model.dataobject.UserLevel;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author intent
 * @version 1.0
 * @date 2020/1/14 10:32 上午
 * @email zzy.main@gmail.com
 */
public interface LevelDao extends BaseMapper<UserLevel> {
    @Select(value = "SELECT * FROM t_user_level WHERE is_delete = false")
    List<UserLevel> selectAll();
}
