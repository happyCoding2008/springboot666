package com.example.demo.service.impl;

import com.example.demo.entity.TUser;
import com.example.demo.mapper.TUserMapper;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author huangguizhao
 */
@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private TUserMapper userMapper;

    @Override
    public TUser getById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
