package ktor.com.br.config.aws.extension

import ktor.com.br.config.aws.event.SnsEvent

fun SnsEvent.toJson() = KlaxonExtension.mapper.toJsonString(this)
