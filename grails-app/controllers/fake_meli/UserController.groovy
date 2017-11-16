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
	 def userList  = User.list()
	  
	 [Message: userList]
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
				redirect(controller:"user", action:"home")
			}else{
				redirect(controller: "user", action:"login")
			}
		}
    }
	def home(){
		session.user ? [Ses: session.user] : redirect(controller: "user", action:"login")
	}
	def search(){
		if (request.post){
			String search = params.search
			def c = Publication.createCriteria()
			def output = c.list{
				 like ("title", "%" + search + "%")
			}
			println output
			render(view: "resulta2", model: [message: output]) //render
		}
	}
}
