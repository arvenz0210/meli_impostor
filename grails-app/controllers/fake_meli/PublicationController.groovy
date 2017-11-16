package fake_meli

class PublicationController {

	def publicate(){
		def user = User.get(session.user)
		String title = params.title
		String category = params.category
		Double price = params.price
		int cantProducts = params.cantProducts
		boolean used = params.used
		
		def publication = new Publication(title, category, price , cantProducts, used)
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
