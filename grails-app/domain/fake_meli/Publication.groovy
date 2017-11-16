package fake_meli

class Publication {

	String title
	String category
	Double price
	int cantProducts
	boolean used
	//hasmany preguntas
	//Categoria categoia
	

	
	public Publication(String title, String category, Double price, int cantProducts,
			boolean used) {
		super();
		this.title = title;
		this.category = category
		this.price = price;
		this.cantProducts = cantProducts;
		this.used = used;
	}



	static constraints = {
		title blank: false
		price blank: false //min: 0
		cantProducts blank: false//, min: 0
		used blank: false
		
    }
}
