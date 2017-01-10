package com.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by ssthouse on 10/01/2017.
 */
public class TestAction extends ActionSupport {
    //Action 属性
    private String hello;

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    @Override
    public String execute() throws Exception {
        hello = "hello, world";
        return SUCCESS;
    }
}
