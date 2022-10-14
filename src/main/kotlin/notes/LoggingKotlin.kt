package notes

import mu.KotlinLogging

private val logger = KotlinLogging.logger{}

fun main() {
    println("Hello")

    logger.trace {"This is a trace log"}
    logger.debug {"This is a debugging log"}
    logger.info { "This is an info log" }
    logger.warn {"This is a warn log"}
    logger.error { "This is a error log" }
}