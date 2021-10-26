<!DOCTYPE html>
<html>
<head>
<script>
function bigImg(x)
{
	alert("message");
}

function normalImg(x)
{
x.style.height="32px";
x.style.width="32px";
}
</script>
</head>
<body>
vinod

<img onmouseover="bigImg(this)" onmouseout="normalImg(this)" border="0" src="C:\Users\Vinod\Desktop\vinod.jpg" alt="Smiley" width="32" height="32" />

<p>The function bigImg() is triggered when the user moves the mouse pointer over the image. This function enlarges the image.</p>
<p>The function normalImg() is triggered when the mouse pointer is moved out of the image. That function changes the height and width of the image back to normal.</p>

</body>
</html>

