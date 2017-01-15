package com.action.learn_model_driven;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Created by ssthouse on 15/01/2017.
 */
public class LoginAction extends ActionSupport implements ModelDriven<UserModel> {
    private static final long serialVersionUID = 1L;

    private UserModel mUserModel = new UserModel();

    @Override
    public UserModel getModel() {
        return mUserModel;
    }

    @Override
    public String execute() throws Exception {
        ActionContext actionContext = ActionContext.getContext();
        actionContext.put("user", mUserModel);
        return SUCCESS;
    }

}
