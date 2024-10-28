package br.com.context.validation.phone

import javax.validation.Constraint
import javax.validation.Payload
import kotlin.annotation.AnnotationRetention.RUNTIME
import kotlin.reflect.KClass

@Retention(RUNTIME)
@Constraint(validatedBy = [PhoneValidator::class])
annotation class Phone(
    val message: String = "doesn't seem to be a valid phone number",
    val groups: Array<KClass<out Any>> = [],
    val payload: Array<KClass<Payload>> = []
)
