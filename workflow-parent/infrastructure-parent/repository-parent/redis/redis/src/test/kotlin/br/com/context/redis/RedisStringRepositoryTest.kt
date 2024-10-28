package br.com.context.redis


import br.com.context.repository.redis.model.Person
import br.com.context.repository.redis.repository.RedisStringRepository
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class RedisStringRepositoryTest(
    @Autowired
    private val redisStringRepository: RedisStringRepository
) {

    @Test
    fun tes001() {
        val person = Person("QQQQQQQQQQ", "AAAAAAAAAAAAAA", "AAAAAAAAAAAAAA")
        val save = redisStringRepository.save("AAAAAAAAAAa", person)
        print(save)
    }

    @Test
    fun tes002() {
        val findById = redisStringRepository.findById("QQQQQQQQQQ")
        print(findById)
    }
}
