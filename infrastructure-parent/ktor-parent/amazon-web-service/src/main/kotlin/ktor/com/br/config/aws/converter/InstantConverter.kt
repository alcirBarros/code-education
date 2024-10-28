package ktor.com.br.config.aws.converter

import com.beust.klaxon.Converter
import com.beust.klaxon.JsonValue
import com.beust.klaxon.KlaxonException
import java.time.Instant
import java.time.temporal.ChronoUnit

val instantConverter = object : Converter {
    override fun canConvert(cls: Class<*>) = cls == Instant::class.java

    override fun toJson(value: Any): String {
        val time = value as Instant
        return """"${time.truncatedTo(ChronoUnit.MILLIS)}""""
    }

    override fun fromJson(jv: JsonValue): Instant {
        if (jv.string.isNullOrBlank()) throw KlaxonException("Couldn't parse date: ${jv.string}")
        return Instant.parse(jv.string)
    }
}
