import java.util.*

    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        println("Enter age: ")
        val AgeGroup = input.nextInt()
        when (AgeGroup) {
            in 0..20 -> print("Family")
            in 60..100 -> print("Senior")
        }
    }