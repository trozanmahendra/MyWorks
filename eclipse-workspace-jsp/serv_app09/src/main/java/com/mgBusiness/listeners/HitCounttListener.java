package com.mgBusiness.listeners;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;

public class HitCounttListener implements ServletRequestListener {

   int count = 0;
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
    	
    	System.out.println("Request destroyed.....");
    }
    
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
    	count = count+1;
    	sre.getServletContext().setAttribute("count", count);
    	System.out.println("Request created.....");
    	
    }
	
}
