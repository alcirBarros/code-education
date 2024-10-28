package br.com

import java.util.Date

class Person(val name: String, private val cpf: String) {

    var dataNascimento: Date = Date()

    var sexo: String? = null
        get() {
            if (field?.isEmpty() == true) {
                return field?.trim() + "."
            }
            return field
        }
        set(value) {
            if (value?.length!! > 0) {
                field = value
            } else {
                throw IllegalArgumentException("Last name too short")
            }
        }

    init {
        println("Este bloco será executado primeiro :p")
    }

    constructor() : this("José", "000000000") {
        println("Chamei o construtor primário #1")
    }

    constructor(name: String) : this(name, "0000000000") {
        println("Chamei o construtor primário #2")
    }

    fun getCpf(): String {
        return cpf + "AAAAAAAAa"
    }
}
