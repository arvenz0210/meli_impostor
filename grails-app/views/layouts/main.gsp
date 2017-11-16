<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title><g:layoutTitle default="fakeMeLi"/></title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<!--link rel="shortcut icon" href="${assetPath(src: 'favicon.ico')}" type="image/x-icon"-->
		
		<link href="https://fonts.googleapis.com/css?family=Roboto:300" rel="stylesheet">
  		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
  		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
		
  		<asset:stylesheet src="main.css"/>
		<asset:javascript src="application.js"/>
		<g:layoutHead/>
	</head>
	<body>
	
		<header class="container-fluid">
			<nav>
		    	<g:form controller="user" action="search" class="rowList">
			        <div class="rowItem dontMargin">
			          <g:textField type="text" class="rowValue searchInput" name="search" value=""/>
			        
			          <g:actionSubmit controller="user" action="search"  value="Buscar" class="btn btn-action"/>
			          
			        </div>
		      	</g:form>
			  <a href="home.gsp">Fake MeLi</a>
			  	<g:if test="${false}">
      			  
			      <ul class="CL_topMenu">
				    	<li><a href="login.gsp">My purchases</a></li>
				        <li><a href="register.gsp">Log out</a></li>
				     	<li><a href="../publication/publicate.gsp">publish</a></li>
				      </ul>
      			</g:if>
      			
				<g:else>
					<ul class="CL_topMenu">
			    	<li><a href="login.gsp">Sign in </a></li>
			    	<li><a href="../publication/publicate.gsp">publish</a></li>
			        <li><a href="register.gsp">Sign up</a></li>
			      </ul>
			      
				</g:else>
			  	    	
				</nav>
		 	</header>
		 	
		 	
	
		


		
		<g:layoutBody/>
	</body>
</html>
