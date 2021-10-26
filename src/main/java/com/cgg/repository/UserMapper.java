package com.cgg.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cgg.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author cgg
 * @version 1.0.0
 * @date 2021/10/25
 */
@Repository
public interface UserMapper extends BaseMapper<User> {


    List<User> queryUserList();

}
