package com.action.learn_interceptor;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by ssthouse on 17/01/2017.
 */
public class FirstAction extends ActionSupport {

    private static final long serialVersionUID = 1l;

    private String firstCountry;

    public String getFirstCountry() {
        return firstCountry;
    }

    public void setFirstCountry(String firstCountry) {
        this.firstCountry = firstCountry;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
