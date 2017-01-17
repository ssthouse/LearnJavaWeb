package com.action.learn_interceptor;


import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * Created by ssthouse on 17/01/2017.
 */
public class TimerInterceptor implements Interceptor {
    @Override
    public void destroy() {
    }

    @Override
    public void init() {
    }

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        String className = invocation.getAction().getClass().getName();
        String beforeStr = "----before action: " + className;
        System.out.println(beforeStr);
        long startTime = System.currentTimeMillis();
        String result = invocation.invoke();
        long endTime = System.currentTimeMillis();
        String afterStr = "----end action using time: " + (endTime - startTime) + " ms";
        System.out.println(afterStr);
        return result;
    }
}
