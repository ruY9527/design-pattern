package com.iyang.action.design.adapters;

/**
 * QQ 登录适配器
 * <p>
 * 将 QQ 登录接口适配到统一的登录系统
 * </p>
 *
 * @author LuoHong
 * @author Yang (optimized)
 * @since 2022/1/6
 */
public class LoginForQqAdapter implements LoginAdapter {

    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQqAdapter;
    }

    @Override
    public Object login(String id, Object adapter) {
        // 模拟 QQ 登录逻辑
        System.out.println("QQ 登录成功，用户ID: " + id);
        return "QQ_USER_" + id;
    }
}
