<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" href="css/default.css">
         
    </head>
    <body>
        <div id="header-wrapper">
            <div id="header">
		<div id="logo">
			<h1><a href="#">CITYGUIDE</a></h1>
		</div>
            <div id="menu">
			<ul>
				<li class="current_page_item"><a href="log2.jsp" accesskey="1" title="">Login</a></li>
				<li><a href="index.jsp" accesskey="2" title="">Home Page</a></li>
                                
				<li><a href="aboutus.html" accesskey="3" title="">About Us</a></li>
				<li><a href="Register.html" accesskey="4" title="">Registration</a></li>
				<li><a href="#" accesskey="5" title="">Contact Us</a></li>
			</ul>
		</div>
                
                      </div>

           
            <form class="login" action="LoginServlet" method="post" >
           
            <input type= "text" class="login-input" name="username" placeholder="username"/>
            <input type= "text" class="login-input" name="password"placeholder="password"/>
            <input type="submit" class="login-submit" value="login"/>
            <p class="login-help"><a href="">forgetpassword</a></p>
            
            
          



        </form>
            <div id="footer" >
                      <p>&copy; Untitled. All rights reserved. Design by Aarohi Sanjekar <a href="http://templated.co" rel="nofollow">TEMPLATED</a>. Photos by <a href="http://fotogrph.com/">Fotogrph</a>.</p>
      
	
</div>
        </body>
</html>