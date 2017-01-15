package com.action.learn_type_converter;

import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * Created by ssthouse on 15/01/2017.
 */
public class MapAction extends ActionSupport {

    private static final long serialVersionUID = 1L;

    private Map<String, User> mUserMap;

    public Map<String, User> getmUserMap() {
        return mUserMap;
    }

    public void setmUserMap(Map<String, User> mUserMap) {
        this.mUserMap = mUserMap;
    }

    @Override
    public String execute() throws Exception {
        return "map";
    }
}
