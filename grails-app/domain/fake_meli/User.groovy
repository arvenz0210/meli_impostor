package fake_meli

class User {
	
	static hasMany = [publications: Publication]
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
