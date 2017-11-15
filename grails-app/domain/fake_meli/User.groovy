package fake_meli

class User {
	String username
	String password
	
	User(String username, String password){
		this.username = username
		this.password = password
	}
	
    static constraints = {
		username blank: false, unique: true
		password blank: false
    }
}
