package org.stackapi

import com.fasterxml.jackson.annotation.JsonProperty

class QuestionResponseContainer(@param:JsonProperty("items") val questionResponses: List<QuestionResponse>) {

    override fun toString(): String {
        return "QuestionResponseContainer{" +
                "questionResponses=" + questionResponses +
                '}'.toString()
    }
}
