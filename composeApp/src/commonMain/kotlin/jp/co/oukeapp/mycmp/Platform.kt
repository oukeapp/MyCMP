package jp.co.oukeapp.mycmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform