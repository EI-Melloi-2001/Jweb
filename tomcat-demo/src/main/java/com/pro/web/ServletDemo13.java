package com.pro.web;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;


/**
 * 使用XML配置方式编写Servlet(用到web.xml)
 * Servlet 从3.0版本后开始支持使用注解配置，3.0版本前只支持XML配置文件的配置方式。(注解方便很多,此方法仅供了解)
 * 步骤:
 * 1.编写Servlet类
 * 2.在web.xml中配置该Servlet
 */
public class ServletDemo13 extends MyHttpServlet{
    @Override
    protected void doGet(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        System.out.println("demo13 get...");
    }

    @Override
    protected void doPost(ServletRequest req, ServletResponse resp) throws ServletException, IOException {

    }
}
