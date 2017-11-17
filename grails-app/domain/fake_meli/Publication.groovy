package fake_meli

class Publication {

	static hasMany = [purchases: Purchases]
	static belongsTo = User
	String title
	String category
	Double price
	int cantProducts
	int used
	
	
	public int getCantProducts() {
		return cantProducts;
	}

	public void setCantProducts() {
		this.cantProducts -= 1;
	}



	//hasmany preguntas
	//Categoria category
	

	
	public Publication(String title, String category, Double price, int cantProducts,
			int used) {
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
