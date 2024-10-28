package ktor.com.br.config.aws.extension

import com.beust.klaxon.Klaxon
import ktor.com.br.config.aws.converter.instantConverter
import ktor.com.br.config.aws.converter.localDateConverter
import ktor.com.br.config.aws.converter.uuidConverter

object KlaxonExtension {
    val mapper: Klaxon by lazy {
        Klaxon()
            .converter(instantConverter)
            .converter(uuidConverter)
            .converter(localDateConverter)
    }
}
