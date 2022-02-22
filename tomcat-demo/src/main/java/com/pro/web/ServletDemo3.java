package com.pro.web;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/demo2",loadOnStartup = 1)

/**
 * Servlet方法介绍
 */
public class ServletDemo3 implements Servlet {
    private ServletConfig config;

    /**
     * 初始化方法
     * 1.调用时机：默认情况下Servlet被第一次访问时调用
     * 2.调用次数：1
     * 在Servlet被创建时执行，只执行一次。
     * LoadOnStartUp:
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config = config;
        System.out.println("init...");


    }


    /**
     * 获取ServletConfig对象
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    /**
     * 调用时机：每次Servlet被访问时调用
     * 提供服务方法，每次Servlet被访问都会调用该方法
     * @return
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Servlet hello world~");
    }


    /**
     * 获取Servlet信息
     * @return
     */
    @Override
    public String getServletInfo() {
        return null;
    }


    /**
     * 销毁
     * 调用时机：内存释放或者服务器关闭时Servlet对象会被销毁
     * 调用次数：1
     */
    @Override
    public void destroy() {
        System.out.println("destroy...");
    }
}
