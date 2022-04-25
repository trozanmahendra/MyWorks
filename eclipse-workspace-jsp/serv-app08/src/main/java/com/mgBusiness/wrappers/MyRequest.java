package com.mgBusiness.wrappers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;

public class MyRequest extends HttpServletRequestWrapper {
	HttpServletRequest request;

	public MyRequest(HttpServletRequest request) {
		super(request);
		this.request = request;
	}

	@Override
	public String getParameter(String name) {

		String val= "";
		val = request.getParameter(name);
		if(name.equals("umail") && !val.endsWith("@mg.com")){
			return val= val+"@mg.com";
		}
				
			return super.getParameter(name);
		

	}

}
