package com.iyang.action.design.adapters;

/**
 * 电话登录适配器
 * <p>
 * 将电话号码登录接口适配到统一的登录系统
 * </p>
 *
 * @author LuoHong
 * @author Yang (optimized)
 * @since 2022/1/6
 */
public class LoginForTelAdapter implements LoginAdapter {

    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter;
    }

    @Override
    public Object login(String id, Object adapter) {
        // 模拟电话登录逻辑
        System.out.println("电话登录成功，手机号: " + id);
        return "TEL_USER_" + id;
    }
}
