<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>vinod</h1>
<script type="text/javascript"> function getWithdrawAmmount()

{document.getElementById('hidden').type = withdraw;
	var withdraw=document.forms["WithdrawDeposit"]["AmountToWithdraw"].value; document.getElementById('hidden').type = withdraw; } </script>
<form method="POST" name="WithdrawDeposit" onsubmit="getWithdrawAmmount()"> <table> <tr><td><input type="text" size=5 name="AmountToWithdraw"></td> <td><input type="button" value="Withdraw"></td></tr> </table> </form> <input type="hidden" name="hidden" value=""> 
//<% String AmountWithdraw = request.getParameter("hidden");  %> <%! public void Withdraw(){          int Amount = Integer.parseInt("AmountWithdraw");
//Deposit deposit = new Deposit(); 
//deposit.WithdrawMoney(AmountWithdraw);  
} %> 

</body>
</html>