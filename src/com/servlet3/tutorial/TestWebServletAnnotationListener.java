package com.servlet3.tutorial;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener
public class TestWebServletAnnotationListener implements HttpSessionAttributeListener {
	/**
	 * Default constructor.
	 */
	public TestWebServletAnnotationListener() {
	}

	@Override
	public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {
		System.out.println("Attribute has been added");
		String attributeName = httpSessionBindingEvent.getName();
		Object attributeValue = httpSessionBindingEvent.getValue();
		System.out.println("Attribute Name ::" + attributeName);
		System.out.println("Attribute Value ::" + attributeValue.toString());
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {
		System.out.println("Attribute has been Removed");
		String attributeName = httpSessionBindingEvent.getName();
		Object attributeValue = httpSessionBindingEvent.getValue();
		System.out.println("Attribute Name ::" + attributeName);
		System.out.println("Attribute Value ::" + attributeValue.toString());
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {
		System.out.println("Attribute has been Replaced");
		String attributeName = httpSessionBindingEvent.getName();
		Object attributeValue = httpSessionBindingEvent.getValue();
		System.out.println("Attribute Name ::" + attributeName);
		System.out.println("Attribute Value ::" + attributeValue.toString());
	}
}