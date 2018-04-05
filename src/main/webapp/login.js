	function showreset()
	{
		document.getElementById("passcode").style.display="none";
		document.getElementById("resetPassword").style.display="block";
		document.getElementById("register").style.display="none";
		document.getElementById("about").style.display="none";
		document.getElementById("contact").style.display="none";
		document.getElementById("forgotPassword").style.display="none";	
		document.getElementById("login").style.display="none";

		}
	function showpasscode()
	{
		document.getElementById("passcode").style.display="block";
		document.getElementById("resetPassword").style.display="none";
		document.getElementById("register").style.display="none";
		document.getElementById("about").style.display="none";
		document.getElementById("contact").style.display="none";
		document.getElementById("forgotPassword").style.display="none";		
		document.getElementById("login").style.display="none";

		}
	
	function showregister()
	{
		document.getElementById("passcode").style.display="none";
		document.getElementById("resetPassword").style.display="none";
		document.getElementById("register").style.display="block";
		document.getElementById("about").style.display="none";
		document.getElementById("contact").style.display="none";
		document.getElementById("forgotPassword").style.display="none";
		document.getElementById("login").style.display="none";
		
	}
	
	function showabout()
	{
		document.getElementById("passcode").style.display="none";
		document.getElementById("resetPassword").style.display="none";
		document.getElementById("register").style.display="none";
		document.getElementById("about").style.display="block";
		document.getElementById("contact").style.display="none";
		document.getElementById("forgotPassword").style.display="none";
		document.getElementById("login").style.display="none";
		
	}
	
	function showcontact()
	{
		document.getElementById("passcode").style.display="none";
		document.getElementById("resetPassword").style.display="none";
		document.getElementById("register").style.display="none";
		document.getElementById("about").style.display="none";
		document.getElementById("contact").style.display="block";
		document.getElementById("forgotPassword").style.display="none";
		document.getElementById("login").style.display="none";
	
	}
	
	function showforgotpassword()
	{
		document.getElementById("passcode").style.display="none";
		document.getElementById("resetPassword").style.display="none";
		document.getElementById("register").style.display="none";
		document.getElementById("about").style.display="none";
		document.getElementById("contact").style.display="none";
		document.getElementById("forgotPassword").style.display="block";
		document.getElementById("login").style.display="none";
		
	}

	function showlogin()
	{
		document.getElementById("passcode").style.display="none";
		document.getElementById("resetPassword").style.display="none";
		document.getElementById("register").style.display="none";
		document.getElementById("about").style.display="none";
		document.getElementById("contact").style.display="none";
		document.getElementById("forgotPassword").style.display="none";
		document.getElementById("login").style.display="block";

		}
		
	function showabout()
	{
		document.getElementById("passcode").style.display="none";
		document.getElementById("resetPassword").style.display="none";
		document.getElementById("register").style.display="none";
		document.getElementById("about").style.display="block";
		document.getElementById("contact").style.display="none";
		document.getElementById("forgotPassword").style.display="none";
		document.getElementById("login").style.display="none";
		
	}
	
	function showhome()
	{
		document.getElementById("passcode").style.display="none";
		document.getElementById("resetPassword").style.display="none";
		document.getElementById("register").style.display="none";
		document.getElementById("about").style.display="none";
		document.getElementById("contact").style.display="none";
		document.getElementById("forgotPassword").style.display="none";
		document.getElementById("login").style.display="none";
		
	}
	
	

	function generatePasscode()
{	xmlHttp=GetXmlHttpObject() // 1) GET XHTTP object
	var fgt_pwd_email_id=document.getElementById("forgotPasswordEmailID").value; // 2) get html form element
	var url="http://localhost:8080/sendPasscode?forgotPasswordEmailID="+fgt_pwd_email_id;  
	xmlHttp.open("GET",url,true); // 3) Configure HTTP server request
	xmlHttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");// 4) set header values
	xmlHttp.onreadystatechange  = verifyPasscode; // 6) call back function
}	
// returns AJAX / XmlHTTP object based on user browser
function GetXmlHttpObject()
	{ var xmlHttp=null;
	try { // create xhttp object in following browser Firefox, Opera 8.0+, Safari
	 xmlHttp=new XMLHttpRequest(); }
	catch (e)
 {// create xhttp object in Internet Explorer browser 
	 try{ 	xmlHttp=new ActiveXObject("Msxml2.XMLHTTP"); 	  }
	 catch (e) { 	xmlHttp=new ActiveXObject("Microsoft.XMLHTTP"); 	  }
 }	return xmlHttp;
}
 // Callback function to process server’s Http response
function verifyPasscode() {
if (xmlHttp.readyState == 4) {
	if(xmlHttp.status == 200) {
		var response= xmlHttp.responseText; 
		 alert(response);    }
	else {  alert("ajax call failed");
}}}
	