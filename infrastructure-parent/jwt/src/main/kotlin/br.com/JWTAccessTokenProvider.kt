package br.com

import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm
import java.util.Date

class JWTAccessTokenProvider(
    private val issuer: String,
    private val audience: String,
    private val secret: String
) {

    fun create(payload: AccessTokenPayload): String {
        val token = JWT.create()
            .withSubject(payload.subject)
            .withIssuer(issuer)
            .withAudience(audience)
            .withIssuedAt(Date())

            .withExpiresAt(payload.expiresAt)
            .withClaim("taxId", payload.taxId)
            .withClaim("scope", payload.scopes.joinToString(" "))

        return token.sign(Algorithm.HMAC256(secret))
    }
}
