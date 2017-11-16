import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_fake_MeLi_publicationpublicate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/publication/publicate.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',2,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
})
invokeTag('captureHead','sitemesh',3,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('textField','g',17,['type':("text"),'class':("rowValue"),'name':("title"),'value':("")],-1)
printHtmlPart(4)
invokeTag('textField','g',27,['type':("text"),'class':("rowValue"),'name':("category"),'value':("")],-1)
printHtmlPart(5)
invokeTag('textField','g',34,['type':("text"),'class':("rowValue"),'name':("price"),'value':("")],-1)
printHtmlPart(6)
invokeTag('textField','g',42,['type':("text"),'class':("rowValue"),'name':("used"),'value':("")],-1)
printHtmlPart(7)
invokeTag('textField','g',49,['type':("text"),'class':("rowValue"),'name':("cantProducts"),'value':("")],-1)
printHtmlPart(8)
invokeTag('actionSubmit','g',54,['action':("publicate"),'value':("Publicate"),'class':("btn btn-accept")],-1)
printHtmlPart(9)
})
invokeTag('form','g',56,['action':("publicate")],1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1510848752000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
