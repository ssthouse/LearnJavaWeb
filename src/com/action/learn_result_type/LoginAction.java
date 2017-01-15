package com.action.learn_result_type;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by ssthouse on 14/01/2017.
 */
public class LoginAction extends ActionSupport {

    private static final long serialVersionUID = 1L;

    @Override
    public String execute() throws Exception {
        System.out.print("execute");
        return SUCCESS;
    }

    public String redirect() throws Exception {
        System.out.print("redirect");
        return ERROR;
    }

}
