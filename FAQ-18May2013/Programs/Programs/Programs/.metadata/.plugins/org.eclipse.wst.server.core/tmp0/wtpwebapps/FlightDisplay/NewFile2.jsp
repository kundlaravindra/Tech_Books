

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <style type="text/css">
 
 body{
  font-family: Trebuchet MS, Lucida Sans Unicode, Arial, sans-serif;
  margin-top:0px;
     
 }
 .bodyText{
  padding-left:10px;
  padding-right:10px;
  border-top:1px solid #000000; 
 }
 .bodyText p{
  margin-top:8px;
 }
 #mainContainer{
  width:760px;
  height:600px;
  border:6px solid #000000;
  margin:1 auto;
  background-image:url('flight.bmp');
  background-repeat:no-repeat;
  padding-top:85px;   
 }
 #mainMenu{
  background-color: #fff; /* Background color of main menu */
  //font-family: Trebuchet MS, Lucida Sans Unicode, Arial, sans-serif; /* Fonts of main menu items */
  
  font-size:1.1em; /* Font size of main menu items */
  border-bottom:1px solid #000000; /* Bottom border of main menu */
  height:50px; /* Height of main menu */
  
  position:relative; /* Don't change this position attribute */
  
 }
 #mainMenu a{
  padding-left:5px;<br> /* Spaces at the left of main menu items */
  padding-right:555px; /* Spaces at the right of main menu items */
  font-weight:Berlin Sans FB;
  /* Don't change these two options */
  position:absolute;
  bottom:-1px; /* Change this value to -2px if you're not using a strict doctype */
 }
 #submenu{  
  font-family: Trebuchet MS, Lucida Sans Unicode, Arial, sans-serif; /* Font  of sub menu items */
  background-color:#E2EBED; /* Background color of sub menu items */
  
  width:100%; /* Don't change this option */
  
 } 
 #submenu div{
  white-space:nowrap; /* Don't change this option */
  
 }
 /*
 Style attributes of active menu item 
 */
 #mainMenu .activeMenuItem{
  /* Border options */
  border-left:1px solid #0E0E;
  border-top:1px solid #0FF0;
  border-right:1px solid #0BB00;  
  background-color: #AABBFF; /* Background color */
  
  cursor:pointer; /* Cursor like a hand when the user moves the mouse over the menu item */
 }
 
 #mainMenu .activeMenuItem img{
  position:absolute;
  bottom:1px;
  right:1px;
 }
  
 /*
 Style attributes of inactive menu items
 */
 #mainMenu .inactiveMenuItem{  
  color: #00FF; /* Text color */
  cursor:pointer; /* Cursor like a hand when the user moves the mouse over the menu item */
 }
 
 #submenu a{ 
  text-decoration:underline; /* No underline on sub menu items - use text-decoration:underline; if you want the links to be underlined */
  padding-left:10px; /* Space at the left of each sub menu item */
  padding-right:5px; /* Space at the right of each sub menu item */
  color: #000; /* Text color */
  font-size:1.0em; 
 }
 
 #submenu a:hover{
  color: #FFEE; /* Red color when the user moves the mouse over sub menu items */
 }
 
 </style>
 <script type="text/javascript">
 
 var menuAlignment = 'left'; // Align menu to the left or right?  
 var topMenuSpacer = 4; // Horizontal space(pixels) between the main menu items 
 var activateSubOnClick = false; // if true-> Show sub menu items on click, if false, show submenu items onmouseover
 var leftAlignSubItems = false;  // left align sub items t
 
 var activeMenuItem = false; // Don't change this option. It should initially be false
 var activeTabIndex = 0; // Index of initial active tab (0 = first tab) - If the value below is set to true, it will override this one.
 var rememberActiveTabByCookie = true; // Set it to true if you want to be able to save active tab as cookie
 
 var MSIE = navigator.userAgent.indexOf('MSIE')>=0?true:false;
 var Opera = navigator.userAgent.indexOf('Opera')>=0?true:false;
 var navigatorVersion = navigator.appVersion.replace(/.*?MSIE ([0-9]\.[0-9]).*/g,'$1')/1;
  
 
 function Get_Cookie(name) { 
     var start = document.cookie.indexOf(name+"="); 
     var len = start+name.length+1; 
     if ((!start) && (name != document.cookie.substring(5,name.length))) return null; 
     if (start == -1) return null; 
     var end = document.cookie.indexOf(";",len); 
     if (end == -1) end = document.cookie.length; 
     return unescape(document.cookie.substring(len,end)); 
  } 
  // This function has been slightly modified
  function Set_Cookie(name,value,expires,path,domain,secure) { 
   expires = expires * 60*60*24*1000;
   var today = new Date();
   var expires_date = new Date( today.getTime() + (expires) );
      var cookieString = name + "=" +escape(value) + 
         ( (expires) ? ";expires=" + expires_date.toGMTString() : "") + 
         ( (path) ? ";path=" + path : "") + 
         ( (domain) ? ";domain=" + domain : "") + 
         ( (secure) ? ";secure" : ""); 
      document.cookie = cookieString; 
  } 
 
 function showHide()
 {
  if(activeMenuItem){
   activeMenuItem.className = 'inactiveMenuItem';  
   var theId = activeMenuItem.id.replace(/[^0-9]/g,'');
   document.getElementById('submenu_'+theId).style.display='none';
   var img = activeMenuItem.getElementsByTagName('IMG');
   if(img.length>0)img[0].style.display='none';   
  }

  var img = this.getElementsByTagName('IMG');
  if(img.length>0)img[0].style.display='inline';
    
   activeMenuItem = this;  
  this.className = 'activeMenuItem';
  var theId = this.id.replace(/[^0-9]/g,'');
  document.getElementById('submenu_'+theId).style.display='block';
   

    
  if(rememberActiveTabByCookie){
   Set_Cookie('dhtmlgoodies_tab_menu_tabIndex','index: ' + (theId-1),100);
  }
 }
 
 function initMenu()
 {
  var mainMenuObj = document.getElementById('mainMenu');
  var menuItems = mainMenuObj.getElementsByTagName('A');
  if(document.all){
   mainMenuObj.style.visibility = 'hidden';
   document.getElementById('submenu').style.visibility='hidden';
  }  
  if(rememberActiveTabByCookie){
   var cookieValue = Get_Cookie('dhtmlgoodies_tab_menu_tabIndex') + '';
   cookieValue = cookieValue.replace(/[^0-9]/g,'');
   if(cookieValue.length>0 && cookieValue<menuItems.length){
    activeTabIndex = cookieValue/1;
   }   
  }
  
  var currentLeftPos = 15;
  for(var no=0;no<menuItems.length;no++){   
   if(activateSubOnClick)menuItems[no].onclick = showHide; else menuItems[no].onmouseover = showHide;
   menuItems[no].id = 'mainMenuItem' + (no+1);
   if(menuAlignment=='left')
    menuItems[no].style.left = currentLeftPos + 'px';
   else
    menuItems[no].style.right = currentLeftPos + 'px';
   currentLeftPos = currentLeftPos + menuItems[no].offsetWidth + topMenuSpacer; 
   
   var img = menuItems[no].getElementsByTagName('IMG');
   if(img.length>0){
    img[0].style.display='none';
    if(MSIE && !Opera && navigatorVersion<7){
     img[0].style.bottom = '-1px';
     img[0].style.right = '-1px';
    }
   }
      
   if(no==activeTabIndex){
    menuItems[no].className='activeMenuItem';
    activeMenuItem = menuItems[no];
    var img = activeMenuItem.getElementsByTagName('');
    if(img.length>0)img[0].style.display='inline'; 
       
   }else menuItems[no].className='inactiveMenuItem';
   if(!document.all)menuItems[no].style.bottom = '-1px';
   if(MSIE && navigatorVersion < 6)menuItems[no].style.bottom = '-2px';
   

  }  
  
  var mainMenuLinks = mainMenuObj.getElementsByTagName('A');
  
  var subCounter = 1;
  var parentWidth = mainMenuObj.offsetWidth;
  while(document.getElementById('submenu_' + subCounter)){
   var subItem = document.getElementById('submenu_' + subCounter);
   
   if(leftAlignSubItems){
    // No action
   }else{       
    var leftPos = mainMenuLinks[subCounter-1].offsetLeft;
    document.getElementById('submenu_'+subCounter).style.paddingLeft =  leftPos + 'px';
    subItem.style.position ='absolute';
    if(subItem.offsetWidth > parentWidth){
     leftPos = leftPos - Math.max(0,subItem.offsetWidth-parentWidth);  
    }
    subItem.style.paddingLeft =  leftPos + 'px';
    subItem.style.position ='static';
     
    
   }
   if(subCounter==(activeTabIndex+1)){
    subItem.style.display='block';
   }else{
    subItem.style.display='none';
   }
   
   subCounter++;
  }
  if(document.all){
   mainMenuObj.style.visibility = 'visible';
   document.getElementById('submenu').style.visibility='visible';
  }  
  document.getElementById('submenu').style.display='Red';
 }
 window.onload = initMenu; 
 function openCal()
 {
  window.open("New.jsp",40,70);
 }
 
 </script>

</head>
<body>
<!-- This is the start of the menu -->
<div id="mainMenu">
 <a>AirIndia</a><br><br><br>
 <a>KingFisher</a><br><br><br>
 <a>TravelData</a><br><br><br>
 <a>AmericanAirLines</a><br><br><br>
 
</div>
<div id="submenu">
 <!-- The first sub menu -->
 <div id="submenu_1">
  <a href onmouseover="javascript:openCal()" >FlightMap

 

 

</a>
 <!-- <br> <a href="javascript:openCal()">Delhi
 </a>
  <br><a href="javascript:openCal()">Mumbai</a> -->
 </div>
 <!-- Second sub menu -->
 <div id="submenu_2">
  <a href="javascript:openCal()">MoreInfo<textarea id="flight1" rows="5" cols="30" style='visibility;'>
Flihht from Delhi
 to Hyderabad time 
Evening  4 pm
</textarea>
  </a><br>
  <!-- <a href="javascript:openCal()">Hyderabad</a><br>
  <a href="javascript:openCal()">Bangalore</a><br> -->
 </div>
 <!-- Third sub menu -->
 <div id="submenu_3">
 <a href="javascript:openCal()">PassingerData</a><br>
  <a href="javascript:openCal()">FlightData</a><br>
  <a href  onmouseover="javascript:openCal()">DisplayMap <iframe src="my.jsp" 
 style="float: center; 
 width: 300px; height: 200px; 
 margin-left: 12px; border: 1px solid black;" 
 name="#boogiejack">
</iframe> </a>

 </div>
 <!-- Fourth sub menu -->
 <div id="submenu_4">
  <a href="javascript:openCal()">Sidny</a><br>
  <a href="javascript:openCal()">New Delhi</a><br>
  <a href="javascript:openCal()">London</a><br>
  <a href="javascript:openCal()">Moscow</a><br>
  <a href="javascript:openCal()">Beijil</a><br>
  <a href="javascript:openCal()">TokyoIslamabad</a><br>

 </div>
</div>


</body>
</html>