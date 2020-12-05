import java.time.LocalDate
import java.time.LocalDateTime
import java.time.temporal.ChronoUnit

fun main() {
    val GOAL = 200
    val DAYS = 31
    val DAYGOAL = GOAL / DAYS
    val STARTDAY = "2020-11-30"
    val goal  = ChronoUnit.DAYS.between(LocalDate.parse(STARTDAY), LocalDateTime.now()) * DAYGOAL
    val passed = readLine()!!.toFloat()

    val badass = arrayOf("Now or never", "Never look back", "Live without regrets", "Never say never", "Keep Strong", "You can do better")
    val goodass = arrayOf("You are the best!", "Keep it up!", "Great job!", "Excellent result!")

    println("Now you've gone ${"%.2f".format(passed / GOAL * 100)}% of your way\n" +
            "You need ${"%.2f".format(goal - passed)}h more\n")

    println(if (passed < goal) "${badass[(Math.random() * badass.size).toInt()]}" else "${goodass[(Math.random() * goodass.size).toInt()]}")
}



