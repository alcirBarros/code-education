package br.com.context.util

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

private enum class EnumClass01Test {
    SA, SS
}

private enum class EnumClass02Test(val value: String) {
    SA("SA"),
    SS("SS")
}
