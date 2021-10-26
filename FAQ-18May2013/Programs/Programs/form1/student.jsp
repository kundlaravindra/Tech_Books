<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<html:html>
<head> 
    <title>add new student</title>
</head>
<body>
<html:errors/>
<html:form action="/ans.do">
student id:<html:text property="studentId"/> </br>
student name:<html:text property="studentName"/> </br>
father name:<html:text property="fatherName"/> </br>
<html:submit property="submit" value="submit"/></br>

</html:form>
</body>












</html:html>