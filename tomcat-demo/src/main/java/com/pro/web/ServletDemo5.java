package com.pro.web;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/demo5")
/**
 * Servlet方法介绍
 */

/**
 * 直接继承自己写的MyHttpServlet类并复写其方法。
 */
public class ServletDemo5 extends MyHttpServlet {

    @Override
    protected void doGet(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        System.out.println("get...");
    }

    @Override
    protected void doPost(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        System.out.println("post...");
    }
}
