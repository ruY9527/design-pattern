package com.iyang.action.design.adapters;

/**
 * 第三方登录通行证接口
 * <p>
 * 适配器模式的应用场景：
 * 统一不同第三方平台的登录接口，使客户端代码可以统一处理不同来源的登录请求。
 * </p>
 *
 * @author LuoHong
 * @author Yang (optimized)
 * @since 2022/1/6
 */
public interface PassportForThird {

    /**
     * QQ 登录
     *
     * @param id QQ 用户标识
     * @return 登录结果
     */
    Object loginForQq(String id);

    /**
     * 新浪微博登录
     *
     * @param id 新浪微博用户标识
     * @return 登录结果
     */
    Object loginForSina(String id);

    /**
     * 电话号码登录
     *
     * @param id 电话号码
     * @return 登录结果
     */
    Object loginForTel(String id);
}
