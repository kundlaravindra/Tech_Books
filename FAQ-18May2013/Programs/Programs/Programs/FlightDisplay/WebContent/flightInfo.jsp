<!DOCTYPE html>
<html>
<head>
<script language="JavaScript" type="text/javascript">
function bigImg(x)
{
x.style.height="64px";
x.style.width="64px";
if(x.id == "img")
document.getElementById("flight").style.visibility="visible";
if(x.id == "img1")
document.getElementById("flight1").style.visibility="visible";
if(x.id == "img2")
document.getElementById("flight2").style.visibility="visible";
}

function normalImg(x)
{
x.style.height="32px";
x.style.width="22px";

setInterval(function(){
		if(x.id == "img")
		document.getElementById("flight").style.visibility="hidden";
		if(x.id == "img1")
		document.getElementById("flight1").style.visibility="hidden";
		if(x.id == "img2")
		document.getElementById("flight2").style.visibility="hidden";
	},1000);
}
function openCal()
{
	window.open("my.jsp");
}
</script>
</head>
<body>



<label onmouseover="bigImg(this)" id="img" onmouseout="normalImg(this)">FlightOne</label>
<!-- <img onmouseover="bigImg(this)" id="img" onmouseout="normalImg(this)" border="0" src="flight.bmp" alt="FlightOne" width="32" height="32" /></td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 -->

<div id="flight" style='visibility:hidden;'>
<p><textarea rows="5" cols="30" style='visibility'>
Flihht from Delhi
 to Hyderabad time 
  Morning 10 am
</textarea>
<a href="javascript:openCal()">For More Info</a>

</p>
</div>



<img onmouseover="bigImg(this)" id="img1" onmouseout="normalImg(this)" border="0" src="flight.bmp" alt="FlightTwo" width="32" height="32" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

<textarea id="flight1" rows="5" cols="30" style='visibility:hidden;'>
Flihht from Delhi
 to Hyderabad time 
Evening  4 pm
</textarea>
<a href="javascript:openCal()">For More Info</a>




<img onmouseover="bigImg(this)" id="img2" onmouseout="normalImg(this)" border="0" src="flightThree" alt="FlightThree" width="32" height="32" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

<textarea id="flight2" rows="5" cols="30" style='visibility:hidden;'>
Flihht from Delhi
 to Hyderabad time 
 Night 8 pm</textarea>



</body>
</html>