package com.action.learn_get_servlet_context;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by ssthouse on 15/01/2017.
 */
public class UserAction extends ActionSupport {
    private static final long serialVersionUID = 1L;

    @Override
    public String execute() throws Exception {
        ActionContext actionContext = ActionContext.getContext();
        actionContext.getApplication().put("name", "application name");
        actionContext.getSession().put("name", "session name");
        actionContext.put("name", "action context(request) name");
        return "hello";
    }

}
