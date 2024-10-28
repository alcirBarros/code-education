//package br.com.context.repository.h2
//
//import org.slf4j.LoggerFactory
//import org.springframework.beans.factory.annotation.Value
//import org.springframework.context.annotation.Configuration
//import org.springframework.core.Ordered
//import org.springframework.core.annotation.Order
//import javax.annotation.PostConstruct
//
//@Configuration
//@Order(Ordered.LOWEST_PRECEDENCE)
//class H2ViewConfig() {
//
//    companion object {
//        private val log = LoggerFactory.getLogger(H2ViewConfig::class.java)
//    }
//
//    @Value("\${server.application.name:}")
//    private val applicationName: String? = null
//
//    @Value("\${server.port:}")
//    private val serverPort: String? = null
//
//    @Value("\${server.servlet.context-path:}")
//    private val contextPath: String? = null
//
//    @Value("\${spring.profiles.active:}")
//    private val activeProfile: String? = null
//
//    @PostConstruct
//    fun init() {
//        val application = """
//----------------------------------------------------------
//    Application '$applicationName' is running! Access URLs:
//    Swagger: 	 http://localhost:$serverPort$contextPath
//    Profile(s):	 [$activeProfile]
//----------------------------------------------------------"""
//        log.info(application)
//    }
//}
