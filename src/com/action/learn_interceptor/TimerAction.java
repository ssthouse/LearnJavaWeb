package com.action.learn_interceptor;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by ssthouse on 17/01/2017.
 */
public class TimerAction extends ActionSupport {

    private static final long serialVersionUID = 1l;

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
