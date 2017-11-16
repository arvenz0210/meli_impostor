<head>
		<meta name="layout" content="main"/>
	</head>
	
<section class="container small">
    <div class="sectionHeader">
      <h2>Publish product</h2>
      <!--p>Editando...</p-->
      <!--Estado en ABM-->
    </div>
    <g:form action="publicate">
      <div class="rowList">
        <div class="rowItem">
          <div class="rowName">
            <p>Titulo de la publicacion</p>
          </div>
          <g:textField type="text" class="rowValue" name="titulo" value=""/>
          <div class="rowAggregate">
            <p>Ej: Fiat 500</p>
          </div>
        </div>

        <div class="rowItem">
          <div class="rowName">
            <p>Categoria</p>
          </div>
            <g:textField type="text" class="rowValue" name="categoria" value=""/>
        </div>

        <div class="rowItem">
          <div class="rowName">
            <p>Precio</p>
          </div>
          <input type="text" class="rowValue" name="Apellido" value="">
          <div class="rowAggregate">
            <g:textField type="text" class="rowValue" name="precio" value=""/>
          </div>
        </div>

        <div class="rowItem">
          <div class="rowName">
            <p>Estado</p>
          </div>
            <g:textField type="text" class="rowValue" name="usado" value=""/>
        </div>

        <div class="rowItem">
          <div class="rowName">
            <p>stock</p>
          </div>
          <g:textField type="text" class="rowValue" name="cantProducts" value=""/>
        </div>
      </div>

      <div class="btn-container">
        <g:actionSubmit action="publicate"  value="Publicate" class="btn btn-accept"/>
      </div>
    </g:form>
  </section>