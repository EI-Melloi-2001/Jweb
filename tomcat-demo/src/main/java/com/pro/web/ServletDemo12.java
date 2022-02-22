package com.pro.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * urlPattern:
 * * 任意匹配：/(或者/*)
 * * 二者区别:当我们的项目中的Servlet配置了"/",会覆盖掉tomcat中的DefaultServlet,当其他的url-pattern都匹配不上去时都会走这个Servlet.
 * *        而当我们的项目中配置了"/*",意味着匹配任意访问路径。
 * * 当一个目录既满足精确匹配又满足目录匹配,越精确的目录优先级越高。
 */

@WebServlet(urlPatterns = "/*")
public class ServletDemo12 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("demo12 get...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("demo8 post...");
    }
}
