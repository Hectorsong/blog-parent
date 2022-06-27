package com.mszlu.blog.service;

import com.mszlu.blog.dao.pojo.SysUser;
import com.mszlu.blog.vo.Result;

public interface SysUserService {

    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    SysUser findUserById(Long id);

    /**
     * 根据用户名，密码查询用户信息
     * @param account
     * @param password
     * @return
     */
    SysUser findUser(String account, String password);

    /**
     * 根据taken查询用户信息
     * @param token
     * @return
     */
    Result findUserByToken(String token);
}
