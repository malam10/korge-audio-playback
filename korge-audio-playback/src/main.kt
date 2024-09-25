import com.soywiz.korge.Korge
import com.soywiz.korge.sound.readSound
import com.soywiz.korim.color.Colors
import com.soywiz.korim.font.DefaultTtfFont
import com.soywiz.korim.text.TextAlignment
import com.soywiz.korma.geom.vector.rect
import com.soywiz.korma.geom.vector.roundRect
import com.soywiz.korau.sound.play

suspend fun main() = Korge(width = 512, height = 512) {
    val startTime = kotlin.system.getTimeMillis()
    val sound = resourcesVfs["abdul-basit.mp3"].readSound()
    val loadTime = kotlin.system.getTimeMillis() - startTime
    println("Audio loaded in $loadTime ms")
    
    val playTime = kotlin.system.getTimeMillis()
    sound.play()
    val playbackDelay = kotlin.system.getTimeMillis() - playTime
    println("Audio playback started after $playbackDelay ms")
}

