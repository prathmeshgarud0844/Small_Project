package com.example.Marco.codes1

import java.util.*

fun String.toslug():String =lowercase(Locale.getDefault())

        .replace("\n","")
        .replace("[a-z\\d\\s]".toRegex()," ")
        .split(" ")
        .joinToString("-")
        .replace("-+".toRegex(),"-")