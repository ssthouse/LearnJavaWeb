package com.action.learn_type_converter;

import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/**
 * Created by ssthouse on 15/01/2017.
 */
public class ListAction extends ActionSupport {

    private static final long serialVersionUID = 1L;

    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String execute() throws Exception {
        for (User user : users) {
            System.out.println(user.getName() + "  " + user.getAge() + "   " + user.getTel());
        }
        return "list";
    }
}
