package com.cgg.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.cgg.entity.User;
import com.cgg.repository.UserMapper;
import com.cgg.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.List;

/**
 * @author cgg
 * @version 1.0.0
 * @date 2021/10/25
 */
@Service
@Slf4j
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private DataSource dataSource;

    @Override
    public List<User> queryUserList() {
        List<User> userList = userMapper.queryUserList();
        userList.forEach(user -> System.out.println(user.toString()));
        return userList;
    }

    @Override
    public User queryUserById(Long id) {

        User user = userMapper.selectOne(Wrappers.<User>lambdaQuery().eq(User::getId, id));
        System.out.println(user.toString());
        return user;
    }

    @Override
    public void InsertUser() {
        for (int i = 20; i < 40; i++) {
            User user = new User();
            user.setName("XX-" + i);
            int count = userMapper.insert(user);
            System.out.println(count);
        }
    }


}
