package br.com

import br.com.jwt.JwtApplication
import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import org.springframework.boot.test.context.SpringBootTest
import java.time.Instant
import java.time.temporal.ChronoUnit
import java.util.*

@SpringBootTest(classes = [JwtApplication::class])
class KotlinApplicationTests {

    private val jwtProvider = JWTAccessTokenProvider("", "", "testsecret")

    @ParameterizedTest
    @ValueSource(longs = [1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377])
    fun `test expiresAt date in days`(days: Long) {

        val numerosQuadrados = Array(5) { i -> (i * i) }
        print(numerosQuadrados)

        val create = jwtProvider.create(
            AccessTokenPayload(
                "",
                "",
                Date.from(Instant.now().plus(days, ChronoUnit.DAYS)),
                setOf()
            )
        )

        print(create)
    }

    @ParameterizedTest
    @ValueSource(longs = [1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946])
    fun `test expiresAt date in hours`(days: Long) {

        val token = JWT.create()
            .withSubject("subject")
            .withIssuer("issuer")
            .withAudience("audience")
            .withIssuedAt(Date())
            .withExpiresAt(Date.from(Instant.now().plus(days, ChronoUnit.HOURS)))
            .withClaim("taxId", "taxId")
            .withClaim("scope", "scope")

        val sign = token.sign(Algorithm.HMAC256("SECRET"))



        print(sign)
    }
}
