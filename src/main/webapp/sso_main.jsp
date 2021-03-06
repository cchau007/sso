<script src="login.js" type="text/javascript"></script>
<link  rel="stylesheet" type="text/css" href="common.css"></link>

<body onload="customTabAccess()">
<div>
<div id="homediv1" class="homediv1"height="100%" width="33%" style="float:left">
</div>

<div id="homediv2" class="homediv2"height="100%" width="34%" style="float:left">

<div id ="resetPassword" style="display:none" class="form-style-5" width="1500" height="550">
	<form>
		<fieldset>
			<legend>
				<span class="number"></span> Enter your new password
			</legend>
			<input type="text" name="newPassword" placeholder="New password *">
			<input type="email" name="repeatNewPassword" placeholder="Re-enter your new password*">
			<input type="submit" value="Submit" style="font-size: unset"/>
		</fieldset>
	</form>
</div>

<div id ="passcode" style="display:none" class="form-style-5" width="1500" height="550">
	<form>
		<fieldset>
			<legend>
				<span class="number"></span> Please enter the passcode emailed to you
			</legend>
			<input type="text" name="passCode" placeholder="Your Passcode *">
			<input onclick="showreset()" type="button" value="Submit" style="font-size: unset"/>
		</fieldset>
	</form>
</div>

<div id ="register" style="display:none" class="form-style-5" >
	<form>
		<fieldset>
			<legend>
				<span class="number"></span> Register
			</legend>
			<input type="text" name="memid" placeholder="Username *">
			<input type="text" name="fName" placeholder="First Name *">
			<input type="text" name="lName" placeholder="Last Name *">
			<input id="password" class="password" type="text" name="registrationPassword" pattern='(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}' placeholder="Pass*(1 lowercase & capital, 1 Number, length:8)">
			<input type="text" pattern='[\+]\d{2}[\(]\d{2}[\)]\d{4}[\-]\d{4}' name="phone" placeholder="Phone * (Format: +1(999)999-9999)">			
			<input id="ssn" class="ssn" type="text" name="ssn" placeholder="SSN *" onBlur = "myFunc()">
			<input type="email" name="registrationEmail" placeholder="Email *">
			<input type="email" name="registrationConfirmEmail" placeholder="Confirm Email *">
			<input type="submit" value="Submit" style="font-size: unset"/>
		</fieldset>
	</form>
</div>

<div id ="about" style="display:none" class="form-style-5" width = "100%" height = "60%">
	<fieldset>
		<h1 align="center">About Us</h1>
		<p>The health and well-being of the people in our communities is important to us. 
		We believe that healthy communities lead to a healthier world. 
		Unigo employees have logged 4.3 million volunteer hours and counting since 2003. 
		Employees have donated more than 400,000 hours for each of the last five years.</p>
	</fieldset>
</div>

<div id ="contact" style="display:none" class="form-style-5" width="1500" height="550">
	<fieldset>
		<header>
			<h1 align="center">Contact Us</h1>
			<h3>Corportae Office</h3>
			<p>Email id : unigoinsurance@gmail.com</p>
			<p>Phone : +1(xxx)-xxx-xxxx</p>
			<br>
			<h3>Customer Care</h3>
			<p>Email id : customercare_unigoinsurance@gmail.com</p>
			<p>Phone : +1(xxx)-xxx-xxxx</p>
		</header>
	</fieldset>		
</div>

<div id ="forgotPassword" style="display:none" class="form-style-5" width="1500" height="550">
		<fieldset>
			<legend>
				<span class="number"></span> Enter the email you are registered with
			</legend>
			<input id="forgotPasswordEmailID" type="email" name="forgotPasswordEmailID" placeholder="Your Email *">
			<input onclick ="generatePasscode()" type="button" value="Submit" style="font-size: unset"/>
		</fieldset>
</div>


<div id="login" style="display:none" class="form-style-5" width="1500" height="550">
	<form action="login">
		<fieldset>
			<legend>
				<span class="number"></span> Login
			</legend>
			<input type="text" name="userid" placeholder="Your username *">
			<input type="text" name="password" placeholder="Your password *">
			<input type="submit" value="Submit" style="font-size: unset"/>
			<br>
			<div style="text-align:center">
				<a onclick="showforgotpassword()"> Forgot Password? </a>
			</div>
		</fieldset>
	</form>
</div>
</div>
</div>

<div id="homediv3" class="homediv3" height="100%" width="33%" style="float:left" >
</div>

<script>
function myFunc() {
   var patt = new RegExp("\d{3}[\-]\d{2}[\-]\d{4}");
   var x = document.getElementById("ssn");
   var res = patt.test(x.value);
   if(!res){
    x.value = x.value
        .match(/\d*/g).join('')
        .match(/(\d{0,3})(\d{0,2})(\d{0,4})/).slice(1).join('-')
        .replace(/-*$/g, '');
   }
}
</script>