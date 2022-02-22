package com.pro.web;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet方法介绍
 */

@WebServlet("/demo6")
public class ServletDemo6 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        System.out.println("Get...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
        System.out.println("Post...");
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
        } else if("POST".equals(method)){
            ////post 方式的处理逻辑
        }
    }
}
