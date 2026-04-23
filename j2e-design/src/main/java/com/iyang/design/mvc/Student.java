package com.iyang.design.mvc;

/**
 * 学生模型 - MVC 模式 Model 层
 * <p>
 * Model 层职责：
 * 1. 封装应用状态和数据
 * 2. 提供数据访问接口
 * 3. 处理业务逻辑
 * </p>
 *
 * @author Yang
 * @since 2021/3/2
 */
public class Student {

    private String rollNo;
    private String name;

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNo='" + rollNo + "'}";
    }
}
