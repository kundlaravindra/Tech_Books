package com.deepak.session.mgmt;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoSession
 */
@WebServlet("/DemoSession")
public class DemoSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoSession() {
        super();
        System.out.println("Inside constructor...");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet method starts...");
		
		Cookie[] cookies = request.getCookies();
		
		for(Cookie cookie :cookies ){
			if(cookie.getName().equalsIgnoreCase("testCookie")){
				System.out.println("Cookie Already exists..");
			}
		}
		Cookie cookie = new Cookie("testCookie", "TestValue");
		cookie.setMaxAge(60*60*24);
		
		response.addCookie(cookie);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost method starts...");
	}

}
