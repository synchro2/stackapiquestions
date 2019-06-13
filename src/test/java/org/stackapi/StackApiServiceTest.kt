package org.stackapi

import org.junit.Assert
import org.junit.Test
import org.springframework.web.reactive.function.client.WebClient

class StackApiServiceTest {
    @Test
    fun getQuestion() {
        val service = StackApiService(WebClient.builder())
        val responseMono = service.getQuestion("java")
        val responseList = responseMono.block()
        Assert.assertNotNull(responseList)
        Assert.assertFalse(responseList!!.questionResponses.isEmpty())
    }
}