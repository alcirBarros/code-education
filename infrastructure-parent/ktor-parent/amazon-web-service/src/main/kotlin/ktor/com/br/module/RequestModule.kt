package ktor.com.br.module

import io.ktor.application.Application
import io.ktor.application.ApplicationCall
import io.ktor.application.ApplicationCallPipeline
import io.ktor.application.call
import io.ktor.application.log
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.route
import io.ktor.routing.routing
import org.kodein.di.instance
import org.kodein.di.ktor.di
import org.kodein.di.on
import java.util.Random

fun Application.requestModule() {
    routing {
        route("/request") {
            suspend fun logPhase(
                phase: String,
                applicationCall: ApplicationCall,
                proceed: suspend () -> Unit
            ) {
                val random by di().on(applicationCall).instance<Random>()
                log.info("Context $applicationCall / Kodein ${di().container} / $phase Random instance: $random")
                proceed()
            }

            intercept(ApplicationCallPipeline.Setup) {
                logPhase("[Setup]", context) { proceed() }
            }
            intercept(ApplicationCallPipeline.Monitoring) {
                logPhase("[Monitoring]", context) { proceed() }
            }
            intercept(ApplicationCallPipeline.Features) {
                logPhase("[Features]", context) { proceed() }
            }
            intercept(ApplicationCallPipeline.Call) {
                logPhase("[Call]", context) { proceed() }
            }
            intercept(ApplicationCallPipeline.Fallback) {
                logPhase("[Fallback]", context) { proceed() }
            }

            get {
           //     val random by di().on(context).instance()<Random>()
            //    application.log.info("Kodein ${di().container} / Random instance: $random")
                logPhase("[GET", context) {
                    call.respondText("Request processing...")
                }
            }
        }
    }
}
