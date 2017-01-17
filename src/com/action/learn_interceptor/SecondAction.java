package com.action.learn_interceptor;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by ssthouse on 17/01/2017.
 */
public class SecondAction extends ActionSupport{

    private static final long serialVersionUID = 1l;

    private String secondCountry;

    public String getSecondCountry() {
        return secondCountry;
    }

    public void setSecondCountry(String secondCountry) {
        this.secondCountry = secondCountry;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
