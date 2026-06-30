// we can use the loop to loop throuh an array
fun main() {
    // below is an array of number 

    val number = arrayOf(46,62,78,82,3,451,75,02,66)

   
     for (num in nums)(
        println(num)
     )


println("==============================")
// create a array of 8 countoes found in kenya .on index 5 of the contties have a county nairobi. by use of a for loop ,loop thgh the entire array as you check whether nairobi is part of the array or not. ifnairobi is found printin (nairobi found)else printin (nairobi ni=ot found)


fun main() {
    val counties = arrayOf(
        "Mombasa", "Kisumu", "Nakuru", "Kiambu",
        "Machakos", "Nairobi", "Kakamega", "Meru"
    )

    for (county in counties) {
        if (county == "Nairobi") {
            println("Nairobi found")
        }
    }
}
}