package com.struts;

import org.apache.struts.action.*;
import javax.servlet.http.*;
public class StudentAction extends Action{

public ActionForward execute(ActionMapping mapping,ActionForm form, HttpServletRequest request,HttpServletResponse response){
StudentFB sfb=(StudentFB)form;
String sid=sfb.getStudentId();
String sname=sfb.getStudentName();
String fname=sfb.getFatherName();
System.out.println("the name is"+sid);
System.out.println("the name is"+sname);
System.out.println("the name is"+fname);
System.out.println("the data stored in db");
System.out.println(".........."+sid);
if(sid=="raj"){
	System.out.println("hi..if");
return mapping.findForward("successing");
}
else{
	System.out.println("hi.....else");
return mapping.findForward("failure");
}
}
}
