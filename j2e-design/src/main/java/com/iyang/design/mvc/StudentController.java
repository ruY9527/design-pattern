package com.iyang.design.mvc;

/**
 * 学生控制器 - MVC 模式 Controller 层
 * <p>
 * Controller 层职责：
 * 1. 接收用户输入
 * 2. 调用 Model 处理业务逻辑
 * 3. 选择合适的 View 展示结果
 * 4. 作为 Model 和 View 的中介
 * </p>
 *
 * @author Yang
 * @since 2021/3/2
 */
public class StudentController {

    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * 设置学生姓名
     *
     * @param name 学生姓名
     */
    public void setStudentName(String name) {
        model.setName(name);
    }

    /**
     * 获取学生姓名
     *
     * @return 学生姓名
     */
    public String getStudentName() {
        return model.getName();
    }

    /**
     * 设置学生学号
     *
     * @param rollNo 学生学号
     */
    public void setStudentRollNo(String rollNo) {
        model.setRollNo(rollNo);
    }

    /**
     * 获取学生学号
     *
     * @return 学生学号
     */
    public String getStudentRollNo() {
        return model.getRollNo();
    }

    /**
     * 更新视图显示
     */
    public void updateView() {
        view.printStudentDetail(model.getName(), model.getRollNo());
    }

    public Student getModel() {
        return model;
    }

    public void setModel(Student model) {
        this.model = model;
    }

    public StudentView getView() {
        return view;
    }

    public void setView(StudentView view) {
        this.view = view;
    }
}
