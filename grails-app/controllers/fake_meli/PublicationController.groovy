package fake_meli

class PublicationController {

	MarketPlaceService marketPlaceService
	
	
	def publicate(){
		if (request.post){
			def user = User.get(session.user)
			Double price = params.price as Double
			String title = params.title
			String category = params.category
			int cantProducts = params.cantProducts as Integer
			boolean used = params.used
			
			
			def publication = new Publication(title, category, price, cantProducts, used)
			if(publication.validate()){
				user.addToPublications(publication)			
				publication.save(flush: true)
			}else{
				publication.errors.allErrors.each {
					println it
				}
			}
			def publicationList  = publication.list()
			 
			[publicationList: publicationList]
		}
	}
	
	def publication(){
		def publication = Publication.get(params.id)
		if(publication){
			println publication.title
			[publication: publication]
		}else{
			redirect(controller:"user", action:"search")
		}
	}
	
	def purchase(){
		boolean succes = false
		def user = User.get(session.user)
		def publication = Publication.get(params.id)
		if (publication){
			if (publication.getCantProducts()){
				succes = marketPlaceService.purchase(user, publication)
				publication.cantProducts -= 1
			}
		}
		[soldStatus: succes]
	}
	
}
