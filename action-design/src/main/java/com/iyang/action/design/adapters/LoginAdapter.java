package com.iyang.action.design.adapters;

/**
 * 登录适配器接口
 * <p>
 * 适配器模式核心接口，用于统一不同登录方式的处理逻辑。
 * 每种第三方登录方式都需要实现此接口。
 * </p>
 *
 * @author LuoHong
 * @author Yang (optimized)
 * @since 2022/1/6
 */
public interface LoginAdapter {

    /**
     * 判断是否支持当前适配器类型
     *
     * @param adapter 适配器对象
     * @return true 表示支持
     */
    boolean support(Object adapter);

    /**
     * 执行登录操作
     *
     * @param id      用户标识（如 QQ号、手机号、微博账号等）
     * @param adapter 适配器对象
     * @return 登录结果（用户信息或 token）
     */
    Object login(String id, Object adapter);
}
