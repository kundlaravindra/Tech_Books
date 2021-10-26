
<html>
<head>
<script lang="text/javascript">
function post_value()
{
       opener.document.form.parent_name.value =  document.frm.child_name.value;
    self.close();
}
</script>
<title>Child Window</title>
</head>
<body>

<form name="frm" method=post action=''>
<table border=0 cellpadding=0 cellspacing=0 width=250>
<tr>
<td align="center">
Input Text :
<input type="text" name="child_name" size=12>
<input type="button" value="Submit" onclick="post_value();">
</td>
</tr>
</table>
</form>
</body></html>