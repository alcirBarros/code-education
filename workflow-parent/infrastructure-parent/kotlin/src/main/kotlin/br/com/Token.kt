package br.com

import java.util.Date
import java.util.UUID

class Token(
    private val id: UUID
) {

    private var taxId: String? = null
    private var subject: String? = null
    private var expiresAt: Date? = null
    private var scopes: Set<String>? = null

    val lazyValue: String by lazy {
        println("computed!")
        "Hello"
    }

    constructor(id: UUID, taxId: String, subject: String, expiresAt: Date, scopes: Set<String>) : this(id) {
        this.taxId = taxId
        this.subject = subject
        this.expiresAt = expiresAt
        this.scopes = scopes
    }
}
