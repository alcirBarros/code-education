package ktor.com.br.config.aws.converter

import com.beust.klaxon.Converter
import com.beust.klaxon.JsonValue
import com.beust.klaxon.KlaxonException
import java.util.UUID

val uuidConverter = object : Converter {
    override fun canConvert(cls: Class<*>) = cls == UUID::class.java

    override fun toJson(value: Any): String {
        return """"$value""""
    }

    override fun fromJson(jv: JsonValue): UUID {
        if (jv.string.isNullOrBlank()) throw KlaxonException("Couldn't parse UUID: ${jv.string}")
        return UUID.fromString(jv.string)
    }
}
