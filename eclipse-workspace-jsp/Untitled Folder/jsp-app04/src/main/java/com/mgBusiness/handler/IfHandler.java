package com.mgBusiness.handler;

import jakarta.servlet.jsp.tagext.TagSupport;

import jakarta.servlet.jsp.JspException;



public class IfHandler extends TagSupport{

	private static final long serialVersionUID = 1L;
	
	private boolean condition;
	public void setCondition(boolean condition) {
		this.condition = condition;
	}
public boolean getConditon() {
		
		return condition;
	}
	@Override
	public int doStartTag()throws  JspException{
		
		return EVAL_BODY_INCLUDE;
	}
	

}
