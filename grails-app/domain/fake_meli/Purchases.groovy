package fake_meli

class Purchases {
	
	User user
	Publication publication
	
	Purchases (User user, Publication publication){
		this.user = user
		this.publication = publication
	}

		
    static constraints = {
    }
}
