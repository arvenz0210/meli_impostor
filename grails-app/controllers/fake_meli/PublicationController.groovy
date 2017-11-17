package fake_meli

class PublicationController {

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
			 
			[Message: publicationList]
		}
	}
	
	def publication(){
		def publication = Publication.get(params.id)
		if(publication){
			println publication.title
			[Message: publication]
		}else{
			redirect(controller:"user", action:"search")
		}
	}
	
	def purchase(){
		def user = User.get(session.user)
		def publication = Publication.get(params.id)
		if(publication){
			if (publication.getCantProducts()){
				publication.setCantProducts()
				user.addToPurchases(publication).save()
				publication.save()
			} else {
				redirect(controller:"user", action:"search")
			}
		} else {
			redirect(controller:"user", action:"search")
		}
	}
}
