<!DOCTYPE html>
<%@page import="beans.*"%>
<%@page import="model.*" %>
<%@page import="java.util.* "%>
<html lang="en">
<head>
<title>Home</title>
<meta charset="utf-8">
<link rel="stylesheet" href="css/reset.css" type="text/css" media="all">
<link rel="stylesheet" href="css/layout.css" type="text/css" media="all">
<link rel="stylesheet" href="css/style.css" type="text/css" media="all">
<script type="text/javascript" src="js/jquery-1.5.2.js" ></script>
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/cufon-replace.js"></script>
<script type="text/javascript" src="js/Molengo_400.font.js"></script>
<script type="text/javascript" src="js/Expletus_Sans_400.font.js"></script>
<!--[if lt IE 9]>
<script type="text/javascript" src="js/html5.js"></script>
<style type="text/css">
	.bg, .box2 {behavior:url(js/PIE.htc)}
</style>
<![endif]-->
<!--[if lt IE 7]>
	<div style=' clear: both; text-align:center; position: relative;'>
		<a href="http://www.microsoft.com/windows/internet-explorer/default.aspx?ocid=ie6_countdown_bannercode">
		<img src="http://www.theie6countdown.com/images/upgrade.jpg" border="0"  alt="" /></a>
	</div>
<![endif]-->
</head>

<body id="page1">
	<div class="body1">
		<div class="main">
<!-- header -->
			<header>
				<div class="wrapper">
					<nav>
						<ul id="menu">
						<%String u=Login.getUname(); %>
							<li><a href="userHome.jsp"><%=u %></a></li>
							<li><a href="editProfile.jsp">Edit Profile</a></li>
							<li><a href="companyList.jsp">Placement Preparation</a></li>
							<li><a href="contact.jsp">Contact Us</a></li>
							<li><a href="signOut.jsp">Sign Out</a></li>
						</ul>
					</nav>
					
					
						<%if(u==null){
						%>
						<jsp:forward page="login.jsp" />
					<%} %>
				
				</div>
				<div class="wrapper">
					<h1><a href="index.jsp" id="logo">PLACEMENT PREPARATION</a></h1>
				</div>
				
				<div id="slogan">
					PLACEMENT PREPARATION
					</div>
				
				<br>
				<ul class="banners">
					<li><a href="#"><img src="images/banner1.jpg" alt=""></a></li>
					</ul>
					
					<div id="slogan">
					We Will Open The World<span><br>of knowledge for you!</span>
				</div>
				<br>
				
					
		</div>
	</div>
				<br>
				<br>
				
						
		
		<form id="select" action="SelectCompanyServlet">	
		<center><input type="text" class="font1" value="<%=request.getParameter("id")%>" name="company"/></center>
		</form>
		
		<form id="sele" action="SelectIQServlet">	
		<center><input type="hidden" class="font1" value="<%=request.getParameter("id")%>" name="company"/></center>
		</form>
		
		<br><br>
				<center>
				<a href="#" class="button" onclick="document.getElementById('select').submit()"><span><span><strong>View Written Questions</strong></span></span></a>
				<a href="#" class="button" onclick="location.href='addWrittenQ.jsp'"><span><span><strong>Add Written Questions</strong></span></span></a><br><br>
				<a href="#" class="button" onclick="document.getElementById('sele').submit()"><span><span><strong>View Interview Questions</strong></span></span></a>
				<a href="#" class="button" onclick="location.href='addInterviewQ.jsp'"><span><span><strong>Add Interview Questions</strong></span></span></a>
				</center>