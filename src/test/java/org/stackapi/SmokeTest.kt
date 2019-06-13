package org.stackapi

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.reactive.server.WebTestClient

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SmokeTest {
    @Autowired
    private val webTestClient: WebTestClient? = null

    @Test
    fun testRoot() {
        val question = "java"

        webTestClient!!
                .get()
                .uri(question)
                .exchange()
                .expectStatus().isOk
                .expectHeader().contentType(MediaType.APPLICATION_JSON_UTF8)
                .expectBody<QuestionResponseContainer>(QuestionResponseContainer::class.java)
    }
}
