<html>
	<head>
		<meta name="layout" content="main"/>
	</head>
	<body>
        <section class="container small">
        <g:form action="login">
		    <div class="sectionHeader">
		      <h2>Sign in</h2>
		      <!--p>Editando...</p-->
		      <!--Estado en ABM-->
		    </div>
		    <div class="rowList">
		      <div class="rowItem">
		        <div class="rowName">
		          <p>Username</p>
		        </div>
		        <g:textField type="text" class="rowValue" name="username" value=""/>
		        <div class="rowAggregate">
		          <p>Ej: Arvenz</p>
		        </div>
		      </div>
		
		      <div class="rowItem">
		        <div class="rowName">
		          <p>Password</p>
		        </div>
		        <g:passwordField type="password" class="rowValue" name="password" value="Sign in"/>
		        <div class="rowAggregate">
		          <p>Ej: *****</p>
		        </div>
		      </div>
		    </div>
		    <div class="btn-container">
		      <g:actionSubmit action="login"  value="Sign in" class="btn btn-accept"/>
		    </div>
		    </g:form>
		</section>
	</body>
</html>


