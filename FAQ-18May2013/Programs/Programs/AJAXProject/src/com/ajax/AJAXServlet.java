package com.ajax;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*
 * 
 * @author kbaig
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class AJAXServlet extends HttpServlet implements Servlet {
    
    private Map mpCityState;

    public AJAXServlet() {
        super();
        mpCityState = new HashMap();
        
        mpCityState.put("Indianapolis","Indiana");
        mpCityState.put("Atlanta","Georgia");
        mpCityState.put("Chicago","Illinois");
        mpCityState.put("Madison","Wisconsin");
        mpCityState.put("Detroit","Michigan");
        
    }

    private String handleRequest(String param){
        
        
        return null;
    }
    
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        res.setContentType("text/xml");
      //  res.setHeader("Cache-Control", "no-store, no-cache");
        String city = "";
        if(req.getParameter("city") != null) 
        	city = req.getParameter("city").trim();    
        String state = (String)mpCityState.get(city);
        if(state!=null)  
        	res.getWriter().write(state);
        else 
        	res.getWriter().write("State not found for city");
        
    }

    protected void doPost(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
    
    }

}


