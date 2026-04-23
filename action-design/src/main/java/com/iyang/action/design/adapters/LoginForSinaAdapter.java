package com.iyang.action.design.adapters;

/**
 * 新浪微博登录适配器
 * <p>
 * 将新浪微博登录接口适配到统一的登录系统
 * </p>
 *
 * @author LuoHong
 * @author Yang (optimized)
 * @since 2022/1/6
 */
public class LoginForSinaAdapter implements LoginAdapter {

    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForSinaAdapter;
    }

    @Override
    public Object login(String id, Object adapter) {
        // 模拟新浪微博登录逻辑
        System.out.println("新浪微博登录成功，用户ID: " + id);
        return "SINA_USER_" + id;
    }
}
