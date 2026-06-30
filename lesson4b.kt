fun main() {
    // below is an example that calcucate the sum

    fun addiction(){
        val number1=10
        val number2=30
        val number3=5

        val sum= number1 + number2 + number3
        println("the sum of the number is :$sum")
    }
    
    // invoke the function addiction
    addiction()


    println("==============================")
    // create a function that is able to find the product of three random numbers.
   fun multiplication(){
    val number1=17
    val number2=34
    val number3=52

     val sum= number1 * number2 * number3
        println("the sum of the number is :$sum")
    }

    multiplication()

    println("==============================")

    // Given two numbers, create a function that is able to find the largest and the smallest of the numbers
  fun divition(){
    val number1=8
    val number2=58

    
    if(number1 > number2){
        println("$number1 is greater/largest while $number2 is smaller.")
    }

    else if (number2 >number1){
        println("the number2 is greater while $number1 is smalller")
    }

    else{
        println("both number are equal")

    }

}
 divition()

    println("==============================")

// given 175 minutes, cretae a function that is able to convert the said minutes into hours and show te remainder of the minutes

fun convert(){
    val minutesGiven = 379
    val hours= minutesGiven/ 60
    val remainderMinutes= minutesGiven%60

    println("the $minutesGiven converted to minutes and hours gives $hours hours and $remainderMinutes minutes")

}

    convert()
}