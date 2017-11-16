class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
		"/publications/$id"(controller:"publication", action:"publication")
        "/purchase/$id"(controller:"publication", action:"purchase")
		"500"(view:'/error')
	}
}
