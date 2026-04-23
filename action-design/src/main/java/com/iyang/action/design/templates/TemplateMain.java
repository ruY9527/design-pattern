package com.iyang.action.design.templates;

/**
 * 模板方法模式演示
 * <p>
 * 展示模板方法模式的使用：
 * 1. 通过父类的模板方法控制整体流程
 * 2. 子类实现具体的业务逻辑
 * 3. 钩子方法允许子类自定义部分流程
 * </p>
 *
 * @author LuoHong
 * @author Yang (optimized)
 * @since 2022/1/6
 */
public class TemplateMain {

    public static void main(String[] args) {
        System.out.println("===== 板球游戏演示 =====");
        Game cricket = new Cricket();
        cricket.play();

        System.out.println("\n===== 足球游戏演示 =====");
        Game football = new Football();
        football.play();
    }
}
