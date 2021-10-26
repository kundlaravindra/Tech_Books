package org.spring.jdbc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LoginController implements Controller{

	LoginModel loginModel;
	public void setLoginModel(LoginModel lm){
		loginModel = lm;
	}
	public ModelAndView handleRequest(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");
		String type = loginModel.validate(uname, pass);
		if(type == null)
			return new ModelAndView("/Login.html");
		else if(type.equals("admin"))
			return new ModelAndView("/AdminHome.jsp");
		else
			return new ModelAndView("/UserHome.jsp");
		}

}
