<head>
	<meta name="layout" content="main"/>
</head>
<div class="container">
      <div class="row">

        <div class="col-sm-12 col-md-4">
          <section>
            <div class="sectionHeader">
              <h2>Filtrar</h2>
            </div>
            <div class="category">
              <ul>
                <li>Categoria #1</li>
                <li>Categoria #2</li>
                <li>Categoria #3</li>
                <li>Categoria #4</li>
                <li>Categoria #5</li>
                <li>Categoria #6</li>
                <li>Categoria #7</li>
                <li>Categoria #8</li>
                <li>Categoria #9</li>
                <li>Categoria #10</li>
                <li>Categoria #11</li>
                <li>Categoria #12</li>

              </ul>
            </div>
          </section>
        </div>
        
        <div class="col-sm-12 col-md-8">
          <section>
            <div class="sectionHeader">
              <h2>Resultados</h2>
            </div>
			<div class="productList">
            <g:each in="${message}" var="publication">
            
            <a href="#" class="">
                <div class="productItemBox">
                  <h3>${publication.title}</h3>
                  <span>$${publication.price}</span>
                  <span>${publication.used}</span>
                </div>
              </a>
				</g:each>	
			</div>
          </section>
        </div>
      </div>
    </div>