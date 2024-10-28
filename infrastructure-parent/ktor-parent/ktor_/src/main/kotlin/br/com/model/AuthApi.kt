package br.com.model

data class User(
    val id: String?,
    val name: String?,
    val email: String?,
    val groupId: String?
)

data class Policy(
    val id: String,
    val name: String,
    val expiry: Int,
    val leeway: Int,
    val length: Int,
    val letters: Boolean,
    val numbers: Boolean,
    val lowercase: Boolean,
    val uppercase: Boolean
)

// Synthetic class name
class PostPasswordlessStartReqBody(
)

// Synthetic class name
class PostOauthTokenReqBody(
)

// Synthetic class name
data class PostOtpPolicyIdCreateReqBody(
    val username: String
)

// Synthetic class name
data class PostOtpPolicyIdVerifyReqBody(
    val username: String,
    val otp: String
)

// Synthetic class name
data class PostOtpPolicyIdDeleteReqBody(
    val username: String
)
