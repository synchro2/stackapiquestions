package org.stackapi

import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*

class QuestionResponse(@param:JsonProperty("title") val title: String, @param:JsonProperty("is_answered") val isAnswered: Boolean,
                       @param:JsonProperty("owner") val owner: Owner, @param:JsonProperty("creation_date") val creationDate: Date) {

    override fun toString(): String {
        return "QuestionResponse{" +
                "title='" + title + '\''.toString() +
                ", isAnswered=" + isAnswered +
                ", creationDate=" + creationDate +
                ", owner=" + owner +
                '}'.toString()
    }

    class Owner(@param:JsonProperty("display_name") val displayName: String) {

        override fun toString(): String {
            return "Owner{" +
                    "displayName='" + displayName + '\''.toString() +
                    '}'.toString()
        }
    }
}
