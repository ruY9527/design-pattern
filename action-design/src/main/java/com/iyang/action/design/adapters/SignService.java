package com.iyang.action.design.adapters;

/**
 * 登录服务类
 * <p>
 * 核心登录服务，提供注册和登录功能。
 * 可以通过适配器扩展第三方登录方式。
 * </p>
 *
 * @author LuoHong
 * @author Yang (optimized)
 * @since 2022/1/6
 */
public class SignService {

    /**
     * 用户注册
     *
     * @param userName 用户名
     * @param password 密码
     * @return 注册结果
     */
    public Object regist(String userName, String password) {
        System.out.println("用户注册成功: " + userName);
        return "REGIST_SUCCESS_" + userName;
    }

    /**
     * 用户登录
     *
     * @param userName 用户名
     * @param password 密码
     * @return 登录结果
     */
    public Object login(String userName, String password) {
        System.out.println("用户登录成功: " + userName);
        return "LOGIN_SUCCESS_" + userName;
    }
}
