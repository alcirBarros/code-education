package br.com.context.validation.phone

import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext

class PhoneValidator : ConstraintValidator<Phone, String> {
    private val pattern = Regex("""^\+?\d*$""")

    override fun isValid(value: String?, context: ConstraintValidatorContext?): Boolean {
        return isValid(value)
    }

    fun isValid(value: String?): Boolean {
        return value.isNullOrBlank() || pattern.matches(value)
    }
}
