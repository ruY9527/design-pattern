package com.iyang.design.mvc;

/**
 * 学生视图 - MVC 模式 View 层
 * <p>
 * View 层职责：
 * 1. 展示数据给用户
 * 2. 提供用户交互界面
 * 3. 不包含业务逻辑
 * </p>
 *
 * @author Yang
 * @since 2021/3/2
 */
public class StudentView {

    /**
     * 打印学生详细信息
     *
     * @param studentName   学生姓名
     * @param studentRollNo 学生学号
     */
    public void printStudentDetail(String studentName, String studentRollNo) {
        System.out.println("========== 学生信息 ==========");
        System.out.println("姓名: " + studentName);
        System.out.println("学号: " + studentRollNo);
        System.out.println("==============================");
    }
}
