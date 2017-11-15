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
				session.user = username
				redirect(controller:"user", action:"home")
			}else{
				redirect(controller: "user", action:"login")
			}
		}
    }
	def home(){
		session.user ? [Ses: session.user] : redirect(controller: "user", action:"login")
	}
}
