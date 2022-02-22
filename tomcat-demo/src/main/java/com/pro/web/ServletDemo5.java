package com.pro.web;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


/**
 * Servlet方法介绍
 */

@WebServlet("/demo4")

/**
 * 直接继承自己写的MyHttpServlet类并复写其方法。
 */
public class ServletDemo5 extends MyHttpServlet {

    @Override
    protected void doGet(ServletRequest req, ServletResponse resp) {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(ServletRequest req, ServletResponse resp) {
        super.doPost(req, resp);
    }
}
