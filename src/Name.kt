import java.time.LocalDate
import java.time.LocalDateTime
import java.time.temporal.ChronoUnit
import kotlin.math.floor

fun hours(h: Double) = h.toInt()
fun minutes(h: Double) = ((h - floor(h)) * 60).toInt()

fun main() {
    val GOAL = 200.0
    val DAYS = 31.0
    val DAYGOAL = GOAL / DAYS
    val STARTDAY = "2020-11-30"
    val goal = ChronoUnit.DAYS.between(LocalDate.parse(STARTDAY), LocalDateTime.now()) * DAYGOAL
    print("Enter hours> ")
    val passedhours = readLine()!!.toDouble()
    print("Enter minutes> ")
    val passedminutes = readLine()!!.toDouble()
    val passed = passedhours + (passedminutes / 60)
    val h = (goal - passed)


    val badass = arrayOf("Now or never", "Never look back", "Live without regrets", "Never say never", "Keep Strong", "You can do better")
    val goodass = arrayOf("You are the best!", "Keep it up!", "Great job!", "Excellent result!")

    println("Now you've gone ${"%.2f".format(passed / GOAL * 100)}% of your way\n" +
            "You should spend for Kotlin ${hours(goal)}h ${minutes(goal)}m")
    println("You need ${hours(h)}h ${minutes(h)}m more - " + if (passed < goal) badass[(Math.random() * badass.size).toInt()] else goodass[(Math.random() * goodass.size).toInt()])
}
