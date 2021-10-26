<html>
<head>
<title>PArent Window</title>
</head>
<body>
<form method=post name="form">
<table border=0 cellpadding=0 cellspacing=0 width=550>
<tr>
<td>
<font size=2>Given Text is :</font>
<input type="text" name='parent_name' size='8'>
<input type="button" value="Get Text" onClick="javascript:window.open("child.jsp")" >
</td>
</tr>
</table>
</form> 
<!-- <script type="text/javascript">
function call(){
	window.open("child.jsp");
}
</script> -->
</body>
</html>