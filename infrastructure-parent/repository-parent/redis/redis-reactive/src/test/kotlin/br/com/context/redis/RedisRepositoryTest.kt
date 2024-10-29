package br.com.context.redis


import br.com.context.repository.redis.model.Person
import br.com.context.repository.redis.repository.RedisSerializerRepository
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class RedisRepositoryTest(
    @Autowired
    private val redisSerializerRepository: RedisSerializerRepository
) {

    @Test
    fun tes001() {
        val person = Person("QQQQQQQQQQ", "AAAAAAAAAAAAAA", "AAAAAAAAAAAAAA")
        val save = redisSerializerRepository.save(person)
        print(save)
    }

    @Test
    fun tes002() {
        val findById = redisSerializerRepository.findById("QQQQQQQQQQ")
        print(findById)
    }
}
