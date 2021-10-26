package com.raistudies.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.raistudies.forms.LoginForm;

public class LoginAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		LoginForm loginForm = (LoginForm)form;
		String s = loginForm.getUsername();
		System.out.println(s);
		if(loginForm.getUsername() == null || loginForm.getPassword() == null ||
				!loginForm.getUsername().equalsIgnoreCase("rahul") || !loginForm.getPassword().equals("abc")){
			return mapping.findForward("failure");
		}
		else
			return mapping.findForward("success");
	}

}
