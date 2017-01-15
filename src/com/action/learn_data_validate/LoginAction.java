package com.action.learn_data_validate;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by ssthouse on 15/01/2017.
 */
public class LoginAction extends ActionSupport {

    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private String tel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String execute() throws Exception {
        System.out.println("execute");
        return SUCCESS;
    }

    public String log() throws Exception {
        System.out.println("log");
        return "hello";
    }

    @Override
    public void validate() {
        super.validate();
        System.out.println("validate");
    }

    public void validateLog() {
        System.out.println("validate log");
        if (age < 10 || age > 30) {
            addFieldError("age", "age must be from 10 to 30");
        }
    }
}
