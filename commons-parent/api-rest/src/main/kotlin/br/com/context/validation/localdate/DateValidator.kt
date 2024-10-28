package br.com.context.validation.localdate

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.ResolverStyle
import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext

class DateValidator : ConstraintValidator<Date, String> {
    private val formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd").withResolverStyle(ResolverStyle.STRICT)

    override fun isValid(value: String?, context: ConstraintValidatorContext?): Boolean {
        return isValid(value)
    }

    private fun isValid(value: String?): Boolean {
        return runCatching {
            if (!value.isNullOrEmpty()) {
                LocalDate.parse(value, formatter)
                true
            } else true
        }.getOrElse {
            false
        }
    }
}
