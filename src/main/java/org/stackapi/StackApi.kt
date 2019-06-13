package org.stackapi

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class StackApi {
    //just concept
    fun main(args: Array<String>) {
        SpringApplication.run(StackApi::class.java, *args)
    }
}
