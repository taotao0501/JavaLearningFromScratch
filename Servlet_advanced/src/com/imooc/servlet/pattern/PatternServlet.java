package com.imooc.servlet.pattern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class PatternServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = req.getRequestURL().toString();
        System.out.println(url);
        String id = url.substring(url.lastIndexOf("/") + 1);
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.println(id);

        if(id.equals("1")) {
            out.println("张三");
        }else if(id.equals("2")) {
            out.println("李四");
        }
    }
}
