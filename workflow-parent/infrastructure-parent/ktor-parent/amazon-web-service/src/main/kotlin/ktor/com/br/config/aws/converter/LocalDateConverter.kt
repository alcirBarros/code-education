package ktor.com.br.config.aws.converter

import com.beust.klaxon.Converter
import com.beust.klaxon.JsonValue
import com.beust.klaxon.KlaxonException
import java.time.LocalDate

val localDateConverter = object : Converter {
    override fun canConvert(cls: Class<*>) = cls == LocalDate::class.java

    override fun toJson(value: Any): String {
        val time = value as LocalDate
        return """"$time""""
    }

    override fun fromJson(jv: JsonValue): LocalDate {
        if (jv.string.isNullOrBlank()) throw KlaxonException("Couldn't parse date: ${jv.string}")
        return LocalDate.parse(jv.string)
    }
}
