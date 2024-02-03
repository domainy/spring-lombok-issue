package com.example.demo

import lombok.extern.slf4j.Slf4j
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import kotlin.math.log

@SpringBootApplication
@Slf4j
class DemoApplication

fun main(args: Array<String>) {
//	log().debug("Starting") // Doesn't work
	runApplication<DemoApplication>(*args)
}
