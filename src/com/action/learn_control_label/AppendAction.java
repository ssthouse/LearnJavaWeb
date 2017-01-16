package com.action.learn_control_label;

import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ssthouse on 16/01/2017.
 */
public class AppendAction extends ActionSupport {
    private static final long serialVersionUID = 1L;

    private List<String> mListOne;
    private List<String> mListTwo;
    private List<String> mListThree;

    public List<String> getmListOne() {
        return mListOne;
    }

    public void setmListOne(List<String> mListOne) {
        this.mListOne = mListOne;
    }

    public List<String> getmListTwo() {
        return mListTwo;
    }

    public void setmListTwo(List<String> mListTwo) {
        this.mListTwo = mListTwo;
    }

    public List<String> getmListThree() {
        return mListThree;
    }

    public void setmListThree(List<String> mListThree) {
        this.mListThree = mListThree;
    }

    @Override
    public String execute() throws Exception {
        mListOne = new ArrayList<>();
        mListOne.add("1");
        mListOne.add("2");
        mListOne.add("3");
        mListTwo = new ArrayList<>();
        mListTwo.add("a");
        mListTwo.add("b");
        mListTwo.add("c");
        mListThree = new ArrayList<>();
        mListThree.add("A");
        mListThree.add("B");
        mListThree.add("C");
        return SUCCESS;
    }
}
