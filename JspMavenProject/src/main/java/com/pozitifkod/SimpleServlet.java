package com.pozitifkod;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description="Simple Servlet",urlPatterns={"/SimpleServlet"})
public class SimpleServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
//		System.out.println("deneme");
			resp.getWriter().print("deneme");
	}
}
