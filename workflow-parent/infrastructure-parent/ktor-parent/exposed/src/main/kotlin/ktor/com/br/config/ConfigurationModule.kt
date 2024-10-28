package ktor.com.br.config

import io.ktor.config.ApplicationConfig

fun ApplicationConfig.getString(fieldName: String): String? {
    return propertyOrNull(fieldName)?.getString()
}

fun ApplicationConfig.getInt(fieldName: String): Int? {
    return getString(fieldName)?.toInt()
}

fun ApplicationConfig.getLong(fieldName: String): Long? {
    return getString(fieldName)?.toLong()
}
