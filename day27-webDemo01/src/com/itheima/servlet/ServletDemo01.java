package com.itheima.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * 2.5版本下的Servlet,到WEB-INF文件中进行配置
 * Servelet的生命周期的介绍.从servlet创建到Servlet销毁的整个过程
 * servlet什么时候创建,默认情况下第一次访问这个servlet
 * servlet什么时候销毁,关闭服务器时候
 *servelet的生命周期方法
 * init()方法在实列被创造的时候调用
 * service()方法每次访问这个servlet都被调用
 * destroy()方法实列被销毁时候调用
 *
 */

public class ServletDemo01 implements Servlet
{
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("zfffinnt");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service1234");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy11223");
    }
}
