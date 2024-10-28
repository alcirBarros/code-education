package br.com.context.validation.localdate

import javax.validation.Constraint
import javax.validation.Payload
import kotlin.reflect.KClass

@Constraint(validatedBy = [DateValidator::class])
@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
annotation class Date(
    val message: String = "{validation.constraints.invalid.format}",
    val groups: Array<KClass<out Any>> = [],
    val payload: Array<KClass<Payload>> = []
)
