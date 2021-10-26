package genericEx;

public class ClassCall {
public static void main(String[] args) {
ClassEx<Integer> c=new ClassEx<Integer>(88);
c.showType();
int i=c.getob();
System.out.println(i);
ClassEx<String> s= new ClassEx<String>("rsreddy");
s.showType();
String sa=s.getob();
System.out.println(sa);
ClassEx<Object> o=new ClassEx<Object>("jdldfjha");
o.showType();
/*Object a=()o.getob();
System.out.println(a);*/

	}

}
