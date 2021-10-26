<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<html:html>
<head> 
    <title>add new student</title>
</head>
<body>
<html:errors/>
<html:form action="/ans.do">
student id:<html:text property="studentId"/> 
student name:<html:text property="studentName"/> 
father name:<html:text property="fatherName"/> 
<html:submit property="submit" value="submit"/>

</html:form>
</body>












</html:html>