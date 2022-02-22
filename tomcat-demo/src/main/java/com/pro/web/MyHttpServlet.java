package com.pro.web;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Servlet方法介绍
 */

@WebServlet("/demo4")
public class MyHttpServlet implements Servlet {


    protected void doGet(ServletRequest req, ServletResponse resp)  {
        //super.doGet(req, resp);
        System.out.println("Get...");
    }


    protected void doPost(ServletRequest req, ServletResponse resp) {
        //super.doPost(req, resp);
        System.out.println("Post...");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        //根据请求方式的不同,进行分别的处理。

        HttpServletRequest request = (HttpServletRequest) req;
        //1.获取请求方式
        String method = request.getMethod();
        //2.判断请求方式为Get或者Post
        if("GET".equals(method)){
            //get 方式的处理逻辑
            doGet(req,res);
        } else if("POST".equals(method)){
            //post 方式的处理逻辑
            doPost(req,res);
        }
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
