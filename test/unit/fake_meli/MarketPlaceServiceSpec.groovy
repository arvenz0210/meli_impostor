package fake_meli

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(MarketPlaceService)
class MarketPlaceServiceSpec extends Specification {
	
	def purchase(){
		def user = User.get(session.user)
		def publication = Publication.get(params.id)
		if(publication){
			if (publication.getCantProducts()){
				publication.cantProducts -= 1
				user.addToPurchases(publication).save()
				publication.save().addToBuyers(user)
				println publication.id
				println publication.buyers
				println user.purchases
				println user.publications
			} else {
				redirect(controller:"user", action:"search")
			}
		} else {
			redirect(controller:"user", action:"search")
		}
		render "asd"
	}
    
}
