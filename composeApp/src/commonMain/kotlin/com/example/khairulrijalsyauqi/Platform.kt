package com.example.khairulrijalsyauqi

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform