package com.mgBusiness.filters;

import java.io.IOException;

import com.mgBusiness.wrappers.MyRequest;
import com.mgBusiness.wrappers.MyResponse;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterFilter extends HttpFilter {
	
	private static final long serialVersionUID = 1L;

	

	public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		
//		MyRequest myRequest = new MyRequest(request);

		chain.doFilter(new MyRequest(request), new MyResponse(response));
	}

	

}
