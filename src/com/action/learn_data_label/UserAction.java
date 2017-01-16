package com.action.learn_data_label;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by ssthouse on 16/01/2017.
 */
public class UserAction extends ActionSupport {
    private static final long serialVersionUID = 1L;

    @Override
    public String execute() throws Exception {
        ActionContext.getContext().put("hello", "hello, this is the msg from UserAction");
        return SUCCESS;
    }
}
