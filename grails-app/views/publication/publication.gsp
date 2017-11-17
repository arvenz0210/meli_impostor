<head>
	<meta name="layout" content="main"/>
</head>

  <div class="container">
    <div class="row">
      <div class="col-sm-8 col-centered sectionsContainer">
        <div class="row">

          <div class="col-sm-6">
            <section class="sectionMaxHeight sectionImg">
              <img src="${createLinkTo(dir: 'images', file: 'product_img_not_found.png')}" />
            </section>
          </div>

          <div class="col-sm-6">
            <section>
              <div class="sectionHeader">
                <h2>${publication.title}</h2>
              </div>
              <div class="rowList">
                <div class="rowItem">
                  <div class="rowName">
                    <p>Price</p>
                  </div>
                  <p class="rowValue onlyShow">$${publication.price}</p>
                </div>

                <div class="rowItem">
                  <div class="rowName">
                    <p>Stock</p>
                  </div>
                  <p class="rowValue onlyShow">${publication.cantProducts}</p>
                </div>


                <div class="rowItem">
                  <div class="rowName">
                    <g:if test="${publication.id}">
                    	<p>Used</p>
                    </g:if>
					<g:else>
						<p>New</p>
					</g:else>
                  </div>
                </div>

                <div class="rowItem">
                  <div class="rowName">
                    <p>${publication.category}</p>
                  </div>
                </div>
                
                <div class="rowItem">
                  <div class="rowName">
                    <g:set var="url" value="/purchase/${publication.id}"/>
	           		<a href="${createLink(uri: url)}">
	           			¡to buy!
					</a>
                  </div>
                </div>
                
                
               </div>
            </section>
          </div>


        </div>
      
      	<div class="row">
      		<div class="col-sm-12 col-centered sectionsContainer">
      		<section>
            	<div class="sectionHeader">
            		<h2>Preguntas</h2>
            	</div>
            </section>
      		</div>
      	</div>
      </div>
    </div>

  </div>