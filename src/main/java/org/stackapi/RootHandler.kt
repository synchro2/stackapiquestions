package org.stackapi

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody
import reactor.core.publisher.Mono

@Controller
class RootHandler(private val stackApiService: StackApiService) {

    @RequestMapping(value = ["/{question}"], method = [RequestMethod.GET])
    @ResponseBody
    internal fun index(@PathVariable("question") question: String): Mono<QuestionResponseContainer> {
        //TODO security, error handling, hasMore
        return stackApiService.getQuestion(question)
    }
}
