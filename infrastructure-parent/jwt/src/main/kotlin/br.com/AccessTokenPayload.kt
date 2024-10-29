package br.com

import java.util.Date

data class AccessTokenPayload(val taxId: String, val subject: String, val expiresAt: Date, val scopes: Set<String>)
