package com.action.learn_result_type;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by ssthouse on 14/01/2017.
 */
public class LoginAction extends ActionSupport {

    private static final long serialVersionUID = 1L;

    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String execute() throws Exception {
        System.out.print("execute");
        info = "login success";
        return SUCCESS;
    }

    public String redirect() throws Exception {
        System.out.print("redirect");
        info = "login redirect";
        return ERROR;
    }

    public String finish() throws Exception {
        System.out.print("finish");
        info = "login finish";
        return "finish";
    }
}
