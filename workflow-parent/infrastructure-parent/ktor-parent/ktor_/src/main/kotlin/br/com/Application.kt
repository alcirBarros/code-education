package br.com

import br.com.module.deployment
import br.com.properties.createApplicationConfig
import io.ktor.config.ApplicationConfig
import io.ktor.server.engine.ApplicationEngineEnvironmentBuilder
import io.ktor.server.engine.applicationEngineEnvironment
import io.ktor.server.engine.connector
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

fun ApplicationEngineEnvironmentBuilder.configEnv(applicationConfig: ApplicationConfig) {
    config = applicationConfig
    module {
        deployment()
    }
    connector {
        host = "0.0.0.0"
        port = 8080
    }
}

// fun main(args: Array<String>) {
//    embeddedServer(Netty, port = 8000, module = Application::starter).start(true)
// }

fun maina(args: Array<String>) {

    val envPort = System.getenv("PORT")?.toInt() ?: 8080
    val env = System.getenv("KTOR_ENV")
    val applicationConfig = createApplicationConfig(env)

    val kFunction2 = ApplicationEngineEnvironmentBuilder::configEnv

    val applicationEngineEnvironment = applicationEngineEnvironment {
        config = applicationConfig

        module {
            deployment()
        }

        connector {
            host = "0.0.0.0"
            port = envPort
        }
    }

    embeddedServer(Netty, applicationEngineEnvironment).start(wait = false)

//    val kodein = Kodein {
//        bind<Random>() with singleton { SecureRandom() }
//        bind<Random>(tag = "random") with provider { SecureRandom() }
//    }
//    val start = embeddedServer(Netty, port = 8080) {
//
//        install(CallLogging)
//
//        install(DefaultHeaders) {
//            header("X-Engine", "Ktor") // will send this header with each response
//            header(HttpHeaders.Server, "My ktor server")
//        }
//
//        install(Sessions) {
//            cookie<User>("MY_COOKIE")
//        }
//
// //        install(StatusPages) {
// //            handleException()
// //        }
//
//        install(ContentNegotiation) {
//            jackson {
//                enable(SerializationFeature.INDENT_OUTPUT)
//            }
//        }
//
//        val routing: Routing = routing {
//
//            get("/") {
//                call.respondText("HELLO WORLD!", contentType = ContentType.Text.Plain)
//            }
//
//            get("/json/jackson") {
//                call.respond(mapOf("hello" to "world"))
//            }
//
//            AuthApiServer().apply {
//                index()
//                httpStatusCodeOk()
//                registerUsers()
//                registerAuth()
//                registerOtp()
//            }
//
//            route("/request") {
//
//                suspend fun logPhase(phase: String, applicationCall: ApplicationCall, proceed: suspend () -> Unit) {
//                    proceed()
//                }
//
//                intercept(ApplicationCallPipeline.Setup) {
//                    logPhase("[Setup]", context) { proceed() }
//                }
//                intercept(ApplicationCallPipeline.Monitoring) {
//                    logPhase("[Monitoring]", context) { proceed() }
//                }
//                intercept(ApplicationCallPipeline.Features) {
//                    logPhase("[Features]", context) { proceed() }
//                }
//                intercept(ApplicationCallPipeline.Call) {
//                    logPhase("[Call]", context) { proceed() }
//                }
//                intercept(ApplicationCallPipeline.Fallback) {
//                    logPhase("[Fallback]", context) { proceed() }
//                }
//
//                get("/") {
//                    val random by kodein.instance<Random>(tag = "random")
//                    val range = 0 until 100
//                    call.respondText("Random number in $range: ${random[range]}")
//                }
//            }
//        }
//
//        //   mainModule()
//    }.start(wait = true)
}

// private operator fun Random.get(range: IntRange): Int {
//    val i = range.last - range.first
//    return range.first + this.nextInt(i)
// }
