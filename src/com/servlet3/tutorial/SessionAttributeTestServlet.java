package com.servlet3.tutorial;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SessionAttributeTestServlet", description = "Servlet with Annotation", urlPatterns = {
		"/SessionAttributeTestServlet" })
public class SessionAttributeTestServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String attributeName = "SessionAttribute";
		String attributeValue = "Initial Value";
		session.setAttribute(attributeName, attributeValue);
		attributeValue = "New Value";
		session.setAttribute(attributeName, attributeValue);
		session.removeAttribute(attributeName);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}