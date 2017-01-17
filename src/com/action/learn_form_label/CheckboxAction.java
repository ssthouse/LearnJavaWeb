package com.action.learn_form_label;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by ssthouse on 17/01/2017.
 */
public class CheckboxAction extends ActionSupport {

    private static final long serialVersionUID = 1L;

    private String sex;
    private String isStudent;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIsStudent() {
        return isStudent;
    }

    public void setIsStudent(String isStudent) {
        this.isStudent = isStudent;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

}
