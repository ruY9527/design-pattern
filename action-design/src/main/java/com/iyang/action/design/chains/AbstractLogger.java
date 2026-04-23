package com.iyang.action.design.chains;

/**
 * 抽象日志记录器 - 责任链模式
 * <p>
 * 责任链模式核心思想：
 * 为请求创建一个接收者对象的链。每个接收者都包含对下一个接收者的引用。
 * 如果一个对象不能处理该请求，它会将请求传递给链中的下一个对象。
 * </p>
 * <p>
 * 优点：
 * 1. 降低耦合度：请求发送者不需要知道具体的接收者
 * 2. 灵活分配职责：可以在运行时动态改变链中的成员
 * 3. 符合开闭原则：新增处理者无需修改现有代码
 * </p>
 *
 * @author Yang
 * @since 2021/2/5
 */
public abstract class AbstractLogger {

    /**
     * 日志级别常量
     */
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    /**
     * 当前处理者的日志级别
     */
    protected int level;

    /**
     * 链中的下一个处理者
     */
    protected AbstractLogger nextLogger;

    /**
     * 设置下一个处理者
     *
     * @param nextLogger 下一个日志处理者
     */
    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    /**
     * 处理日志消息
     * <p>
     * 如果当前级别能够处理该消息，则处理；否则传递给下一个处理者
     * </p>
     *
     * @param level   日志级别
     * @param message 日志消息
     */
    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    /**
     * 写入日志（抽象方法，由子类实现）
     *
     * @param message 日志消息
     */
    protected abstract void write(String message);
}