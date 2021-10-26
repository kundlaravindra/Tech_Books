import org.apache.struts.action.*;
import javax.servlet.http.*;
public class ActionOne extends Action{
public ActionOne(){
System.out.println("Action object is created ");

}
public ActionForward execute(ActionMapping mapping,ActionForm form, HttpServletRequest request,HttpServletResponse response){
System.out.println("excecte method is ... ");
ActionForward af=null;
return af;


}

}