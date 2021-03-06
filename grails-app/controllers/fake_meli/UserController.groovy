package fake_meli

class UserController {
	
	def register(){
		def user = new User("Arvenz", "0210")
		if(user.validate()){
			user.save()
		}else{
			user.errors.allErrors.each {
				println it
			}
		}
		def user2 = new User("Saenz", "0210")
		if(user2.validate()){
			user2.save()
		}else{
			user2.errors.allErrors.each {
				println it
			}
		}
		def userList  = User.list()
		 
		[userList: userList]
	}
	
    def login() {
		if(session.user) redirect(controller:"user", action:"home")		
		if(request.post){		
			String username = params.username
			String password = params.password
					
			def query = User.where {
				username == username
				password == password
			}
			def user = query.findAll()
					
			if(user){
				session.user = user.id
				
				render (view : "home", model: [Ses: session.user])
			}else{
				redirect(controller: "user", action:"login")
			}
		}
    }
	def home(){
		def publicationList  = Publication.list()
		session.user ? [ Ses: session.user, publicationList: publicationList ] : redirect(controller: "user", action:"login")
	}
	def search(){
		if (request.post){
			String search = params.search
			def c = Publication.createCriteria()
			def searchResult = c.list{
				 like ("title", "%" + search + "%")
			}
			render(view: "publicationList", model: [searchResult: searchResult, searchActual: search]) //render
		}
	}
	def searchNew(){
		if (request.post){
			String search = params.search
			int used= params.used as Integer
			def c = Publication.createCriteria()
			def searchResult = c.list{
				 like ("title", "%" + search + "%")
				 eq ("used", used)
			}
			
			render(view: "publicationList", model: [searchResult: searchResult, searchActual: search]) //render
		}
	}
	
	def myPurchases(){
		def user = User.get(session.user)
		def purchasesResult = user.purchases
		[purchasesResult: purchasesResult]
		
	}
}
