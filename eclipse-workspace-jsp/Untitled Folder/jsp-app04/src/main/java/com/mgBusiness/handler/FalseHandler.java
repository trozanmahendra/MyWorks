package com.mgBusiness.handler;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.TagSupport;

public class FalseHandler extends TagSupport {

	private static final long serialVersionUID = 1L;
	@Override
	public int doStartTag() throws JspException {
		IfHandler handler = (IfHandler)getParent();
		boolean conditon = handler.getConditon();

		if (conditon == false) {
			return EVAL_BODY_INCLUDE;
		} else {
			return SKIP_BODY;

		}
	}
}
