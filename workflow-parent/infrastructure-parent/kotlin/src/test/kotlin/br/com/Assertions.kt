package br.com

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Assertions.assertNotSame
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.platform.commons.util.StringUtils

class Assertions {

    @Test
    fun teste01() {

        StringUtils.isNotBlank("text")

        assertNull(null)
        assertFalse(false)
        assertTrue(true)
        assertNotEquals("", "text")
        assertNotSame("", "text")
    }
}
