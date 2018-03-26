<style>

* {
    margin:0;
    padding:0;
 }
 </style>
<div>
	<div id="header" style="height:18%;width:100%">
		<jsp:include page="header.jsp" />
	</div>
	
	<div id="body" style="height:77%;width:100%;overflow:scroll" >
		<div id="body1" style="height:77%;width:33%;float:left;text-align:center">
			<jsp:include page="register.jsp" />
		</div>
		
		<div id="body2" style="height:77%;width:34%;float:left">
			<jsp:include page="sso_main.jsp" />
		</div>
		
		<div id="body3" style="height:77%;width:33%;float:left;text-align:center">
		<jsp:include page="advertisement.jsp" />
		</div>
	</div>
		
	<div id="footer"  style="height:5%;width:100%">
		<jsp:include page="footer.jsp" />
	</div>
</div> 