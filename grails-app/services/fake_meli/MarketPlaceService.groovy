package fake_meli

import grails.transaction.Transactional

@Transactional
class MarketPlaceService {

    def purchase(User user, Publication publication){
		boolean succes = false	
		if(publication){
			if (publication.getCantProducts()){
				def purchase = new Purchases(user, publication)
				publication.cantProducts -= 1
				purchase.save()
				succes = true
				
			} 
		}
		return succes
	}
}
