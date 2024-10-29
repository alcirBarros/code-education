package br.com.module.router

import java.security.SecureRandom
import java.util.Random

class RandomClassImpl() : RandomClass {
    override suspend fun radom(): Random {
        return SecureRandom()
    }
}
