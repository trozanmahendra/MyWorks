package com.mgBusiness.handler;

import java.io.IOException;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.PageContext;
import jakarta.servlet.jsp.tagext.Tag;

public class HelloHandler implements Tag {
	PageContext pagecontext;
	String name;
	public void setName(String name) {
		this.name = name;
	}
	

	@Override
	public void setPageContext(PageContext pagecontext) {
		this.pagecontext = pagecontext;

	}

	@Override
	public int doStartTag() throws JspException {
		try {
			
			JspWriter out = pagecontext.getOut();
			out.println("<html><body><h1>HELLO "+name+"</h1></body></html>");
		} catch (IOException e) {

			e.printStackTrace();
		}
		return EVAL_BODY_INCLUDE;
	}

	@Override
	public int doEndTag() throws JspException {
		
		return SKIP_PAGE;
	}

	@Override
	public Tag getParent() {

		return null;
	}

	@Override
	public void release() {
		

	}

	@Override
	public void setParent(Tag t) {
		

	}

}
