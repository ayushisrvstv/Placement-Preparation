<!DOCTYPE html>
<html lang="en">
<head>
<title>register</title>
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
							<li><a href="index.jsp">About</a></li>
							<li><a href="login.jsp">Login</a></li>
							<li><a href="register.jsp">Register</a></li>
							<li><a href="contact.jsp">Contact Us</a></li>
						</ul>
					</nav>
					
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
					
			</header>
<!-- / header -->
		</div>
	</div>
	<br>
	<br>
	<article class="col_4 pad_left2">
	                                  <div class="font2">
	                                  <h3>
                                           <%
                                           String a=(String)request.getAttribute("mesg");
                                           if(a!=null)
                                           out.println(a);
                                           
                                           
                                           %>
                                           </h3>
									</div>

									<form id="register" action="RegServlet" method="post">
								    
                                  	
                                  	<h3>Username:</h3>
										<div class="wrapper">
										<div class="bg"><input class="tb5" type="text" name="uname"></div>
										
										
										</div>
										
										
										
										<br>
									
							
										
										<h3>Name:</h3>
										<div class="wrapper">
										<div class="bg"><input class="tb5" type="text" name="name"></div>
										
										
										</div>
										
										
										<br>
							
										
										<h3>Password:</h3>
										<div class="wrapper">
										<div class="bg"><input class="tb5" type="password" name="pswd"></div>
										
										
										</div>
										
										<h3>Confirm Password:</h3>
										<div class="wrapper">
										<div class="bg"><input class="tb5" type="password" name="cpswd"></div>
										
										
										</div>
										
										
										<br>
										<h3>College:</h3>
										<div class="wrapper">
										<div class="bg"><input class="tb5" type="text" name="college"></div>
										
										
										</div>
										
										<br>
										<h3>Branch:</h3>
										<div class="wrapper">
										<div class="bg"><input class="tb5" type="text" name="branch"></div>
										
										
										</div>
										
										<br>
										<h3>Mobile:</h3>
										<div class="wrapper">
										<div class="bg"><input class="tb5" type="text" name="mobile"></div>
										
										
										</div>
										
										<br>
										<h3>e-mail:</h3>
										<div class="wrapper">
										<div class="bg"><input class="tb5" type="text" name="mail"></div>
										
										
										</div>
										<br>
									
                      <br>
                      <br>
							<a href="#" class="button" onclick="document.getElementById('register').submit()"><span><span><strong>Register</strong></span></span></a>
                             <a href="#" class="button" onclick="location.href='register.jsp'"><span><span><strong>Reset</strong></span></span></a>
									</form>

								</article>
	
