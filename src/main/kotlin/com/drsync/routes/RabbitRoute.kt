package com.drsync.routes


import com.drsync.data.model.Rabbit
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

private const val BASE_URL = "http://192.168.205.90:8000"
private val rabbits = listOf(
    Rabbit("Carl", "A cute brown rabbit", "$BASE_URL/rabbits/rabbit1.jpg"),
    Rabbit("Emma", "Emma likes to eat apples", "$BASE_URL/rabbits/rabbit2.jpg"),
    Rabbit("Florian", "Florian is always hungry", "$BASE_URL/rabbits/rabbit3.jpg"),
    Rabbit("Amber", "Amber is loveable rabbit", "$BASE_URL/rabbits/rabbit4.jpg"),
    Rabbit("Gina", "Gina is true beauty", "$BASE_URL/rabbits/rabbit5.jpg")
)

fun Route.randomRabbit() {
    get("/randomrabbit") {
        call.respond(
            HttpStatusCode.OK,
            rabbits.random()
        )
    }
}