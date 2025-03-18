package com.example.Marco.codes1


import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class ArticleController{

    val articles=mutableListOf( Article(title="My Title",
        content="my content"))

    @GetMapping("/articles")
    fun articles()=articles

    @GetMapping("/articles2")
    fun articles2()=articles


}


