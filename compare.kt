fun main(args: Array<String>)
{
    print("Enter a number")

    val number = Integer.valueOf(readLine())

    print("enter another number" )

    val number2 = Integer.valueOf(readLine())

    val cmp = number.compareTo(number2)
    println(cmp)
}