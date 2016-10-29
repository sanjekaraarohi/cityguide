<html>

<head>
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
				<li><a href="index.jsp" accesskey="5" title="">Logout</a></li>
			</ul>
		</div>
                </div>
                  
        <div id="banner">
        <div class="container">
           
        <section class="register">
        <script language="JavaScript">
        function getOptions(city) {
	var list;
	var listValue;
	if (city == "Indore") {
		list = new Array("Rajwada","Khajrana","Nehru Park","Lalbag","Regional Park");
		listValue = new Array("Rajwada","Khajrana","Nehru Park","Lalbag","Regional Park");
	}
	if (city == "Mumbai") {
		list = new Array("Gateway of India","Siddhivinayak Mandir","Elephanta Caves","Marine Drive","Girgaon Chowpatty");
		listValue = new Array("Gateway of India","Siddhivinayak Mandir","Elephanta Caves","Marine Drive","Girgaon Chowpatty");
	}
	if (city == "Pune") {
		list = new Array("Dagdusheth Ganpati Mandir","Shaniwar Wada","Sinhagad fort","Parvati Hill","Aga Khan Palace ");
		listValue = new Array("Dagdusheth Ganpati Mandir","Shaniwar Wada","Sinhagad fort","Parvati Hill","Aga Khan Palace ");
	}
	//for (var i = 0; i < document.OptionMaker.CityType.length; i++) { //Clear the 2nd menu
		//document.OptionMaker.City.options[i] = null;
	//}
	for (var i = 0; i < list.length; i++) { //Repopulate 2nd menu
		document.OptionMaker.City.options[i] = new Option(list[i],listValue[i],0,0);
	}
}
</script>
<title>Dynamic Options</title>
        

<form name="OptionMaker" action="Display" method="post">
    <h1><b>Welcome <%= session.getAttribute("username")%>!</b></h1>
                 <br>
  <p><select  name="CityType" onchange="getOptions(this.value)">
    <option value="Indore">Indore</option>
    <option value="Mumbai">Mumbai</option>
    <option value="Pune">Pune</option>
    
  </select>&nbsp;&nbsp;&nbsp;&nbsp; <select  name="City">
      <input type="submit"  value="Submit"/>
  </select></p>
  </div>
             </div>
</form>

</body>

</html>