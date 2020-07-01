package com.hj.demo.servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/myServlet") //访问路径
public class MyServlet extends HttpServlet {
    private  static final long serialVersionUIR = -4112312321321321323L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().print("springBoot Servlet"); //往前台输出信息
        resp.getWriter().flush();
        resp.getWriter().close();
    /**
     *PrintWriter对象的flush()和close()方法说明：
     * 1. flush()将缓冲区的数据强制输出，用于清空缓冲区，若直接调用close()方法，则可能会丢失缓冲区的数据。所以通俗来讲它起到的是刷新的作用。
     * 2. close()用于关闭数据流
     */
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
