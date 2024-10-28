package br.com.routing

import br.com.model.Policy
import br.com.model.PostOauthTokenReqBody
import br.com.model.PostOtpPolicyIdDeleteReqBody
import br.com.model.PostOtpPolicyIdVerifyReqBody
import br.com.model.PostPasswordlessStartReqBody
import br.com.model.User
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*
import java.util.*

/**
 * auth-api
 *
 * null
 */
class AuthApiServer() {

    fun Route.index() {
        get("{id}") {
            val id = call.parameters["id"] ?: return@get call.respondText(
                "Missing or malformed id",
                status = HttpStatusCode.BadRequest
            )
//            val customer = customerStorage.find { it.id == id } ?: return@get call.respondText("No customer with id $id",  status = HttpStatusCode.NotFound )
//            call.respond(customer)
        }

        // POST http://localhost:8080/
        // Content-Type: application/x-www-form-urlencoded
        post {
            val formParameters = call.receiveParameters()
            call.respondText("Customer stored correctly", status = HttpStatusCode.Created)
        }
        delete("{id}") {
            val id = call.parameters["id"] ?: return@delete call.respond(HttpStatusCode.BadRequest)
//            if (customerStorage.removeIf { it.id == id }) {
//                call.respondText("Customer removed correctly", status = HttpStatusCode.Accepted)
//            } else {
//                call.respondText("Not Found", status = HttpStatusCode.NotFound)
//            }
        }
    }

    fun Route.httpStatusCodeOk() {
        get("/customer/{id}") {
            val randomUUID = UUID.randomUUID()
            val request: ApplicationRequest = call.request
            val authorizationHeader = request.headers["Authorization"]
            val s = call.parameters["id"]!!

            val emptyArray: HashMap<String, String> = hashMapOf<String, String>()

            request.headers.entries().map { entry: Map.Entry<String, List<String>> ->
                emptyArray.put(entry.key, entry.value[0])
            }

            val mapOf = mapOf(
                "url" to request.local.uri,
                "method" to request.local.method.value,
                "headers" to emptyArray
            )

            call.respond(HttpStatusCode.OK, mapOf)
        }
    }

    /**
     * users
     */
    fun Routing.registerUsers() {
        post("/users") {
            val body = call.receive<User>()

            call.respondText("Hello, world!", ContentType.Application.Json, HttpStatusCode.OK)
        }
    }

    /**
     * auth
     */
    fun Routing.registerAuth() {
        post("/passwordless/start") {
            val body = call.receive<PostPasswordlessStartReqBody>()

            call.respond(Unit)
        }

        post("/oauth/token") {
            val body = call.receive<PostOauthTokenReqBody>()

            call.respond(Unit)
        }
    }

    /**
     * otp
     */
    fun Routing.registerOtp() {
        post("/policy") {
            val body = call.receive<Policy>()

            call.respond(Unit)
        }

        put("/policy") {
            val body = call.receive<Policy>()

            call.respond(Unit)
        }

        get("/policy/{policyId}") {
            // val policyId = call.getPath<String>("policyId")
            val s = call.parameters["policyId"]!!

            call.respond(
                Policy(
                    id = "id",
                    name = "name",
                    expiry = 180,
                    leeway = 3,
                    length = 6,
                    letters = false,
                    numbers = true,
                    lowercase = false,
                    uppercase = false
                )
            )
        }

        post("/otp/{policyId}/create") {
            val s = call.parameters["policyId"]!!
            //       val policyId = call.getPath<String>("policyId")

            //       val body = call().receive<PostOtpPolicyIdCreateReqBody>()

            call.respond(Unit)
        }

        post("/otp/{policyId}/verify") {
            //      val policyId = call.getPath<String>("policyId")

            val body = call.receive<PostOtpPolicyIdVerifyReqBody>()

            call.respond(Unit)
        }

        post("/otp/{policyId}/delete") {
            //     val policyId = call.getPath<String>("policyId")

            val body = call.receive<PostOtpPolicyIdDeleteReqBody>()

            call.respond(Unit)
        }
    }
}
