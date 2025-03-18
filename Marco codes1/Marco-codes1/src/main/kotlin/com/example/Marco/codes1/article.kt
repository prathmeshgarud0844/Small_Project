git pull
package com.example.Marco.codes1

import java.time.LocalDateTime

data class Article(
   val title:String,
    val content:String,
    val createdAt: LocalDateTime= LocalDateTime.now(),
    val slug: String =title.toslug()
)