import org.apache.struts.action.*;
import javax.servlet.http.*;
public class StudentFB extends ActionForm{
//provide setter and getter methods
String studentId;
String studentName;
String fatherName;
public void setStudentId(String studentId) {
this.studentId=studentId;
}
public String getStudentId(){
return studentId;
}
public void setStudentName(String studentName) {
this.studentName=studentName;
}
public String getStudentName(){
return studentName;
}
public void setFatherName(String fatherName) {
this.fatherName=fatherName;
}
public String getFatherName(){
return fatherName;
}
public void reset(ActionMapping mapping,HttpServletRequest request){
setStudentId("9000");
setStudentName("vinod");
setFatherName("raj");
}
public ActionErrors validate(ActionMapping mapping,HttpServletRequest request){
ActionErrors aes=new ActionErrors();
if(studentId==null || studentId.equals("")){
ActionMessage am1=new ActionMessage("studentId.required");
aes.add("error",am1);
} 
if(studentName==null || studentName.equals("")){
ActionMessage am2=new ActionMessage("studentName.required");
aes.add("error",am2);
}  

if(fatherName==null || fatherName.equals("")){
ActionMessage am3=new ActionMessage("fatherName.required");
aes.add("error",am3);
}  
return aes;
}

}