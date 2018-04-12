package com.servlet3.tutorial;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "URLParameter", description = "Passing parameters directly to a Servlet", urlPatterns = {
"/URLParameter" })
public class URLParameter extends HttpServlet {
	private final String Header = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\n";
	private final String InitialBlock1 = "<HTML>\n<HEAD><TITLE>";
	private final String InitialBlock2 = "</TITLE></HEAD>\n<BODY>\n";
	private final String Trailer = "</BODY></HTML>";

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String surname = request.getParameter("surname");
		out.println(Header + InitialBlock1 + "A forms test" + InitialBlock2 + "<H1>URL Parameters</H1>" + "<BR>\n"
				+ "My name is " + name +" " + surname);
	}
}
