package org.stackapi

import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.Mono

@Service
class StackApiService(webClientBuilder: WebClient.Builder) {

    private val webClient: WebClient = webClientBuilder.baseUrl("https://api.stackexchange.com").build()

    internal fun getQuestion(question: String): Mono<QuestionResponseContainer> {
        return this.webClient.get().uri("/2.2/search?order=desc&sort=activity&intitle={question}&site=stackoverflow", question)
                .retrieve().bodyToMono<QuestionResponseContainer>(QuestionResponseContainer::class.java)
    }
}
