fun main() {
    var cardPoints = 7_000

    // TODO: replace this if with a when
    // try to use  ranges!

    val cardLevel: String = cardPoints.toString()
    when(cardPoints){
        in 0..1000 -> print("pearl")
        in 1000..5000 -> print("silver")
        in 5_000..10_000 -> print("gold")
        else -> print("platinum")
    }

    val plural = if(cardPoints > 1 || cardPoints == 0) "s" else ""
    println("You have $cardPoints point$plural and are at the $cardPoints level.")
}