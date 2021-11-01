package com.cgg.service;

import com.cgg.entity.User;

import java.util.List;

/**
 * @author cgg
 * @version 1.0.0
 * @date 2021/10/25
 */
public interface IUserService {

    /**
     * 根据id查询指定用户
     *
     * @param id 用户id
     * @return 用户信息
     */
    User queryUserById(Long id);

    /**
     * 查询所有用户
     *
     * @return 用户集合
     */
    List<User> queryUserList();

    /**
     * 插入用户
     */
    void InsertUser();
}
