package com.action.learn_form_label;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by ssthouse on 17/01/2017.
 */
public class CheckListAction extends ActionSupport {
    private static final long serialVersionUID = 1l;

    private String[] characters;
    private String[] interests;

    public String[] getCharacters() {
        return characters;
    }

    public void setCharacters(String[] characters) {
        this.characters = characters;
    }

    public String[] getInterests() {
        return interests;
    }

    public void setInterests(String[] interests) {
        this.interests = interests;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
