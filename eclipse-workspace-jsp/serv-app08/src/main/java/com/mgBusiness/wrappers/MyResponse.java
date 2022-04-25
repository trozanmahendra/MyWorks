package com.mgBusiness.wrappers;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletResponseWrapper;

public class MyResponse extends HttpServletResponseWrapper {
	HttpServletResponse response;

	public MyResponse(HttpServletResponse response) {
		super(response);
		this.response = response;

	}

	@Override
	public void setContentType(String type) {
		
		super.setContentType("text/html");
	}
}
