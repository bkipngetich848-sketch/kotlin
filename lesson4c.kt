// function with parameters
// parameters are values that get passed as argument when invoking a function
// in kotlin, when you add a parameter into a function, you must specify its datatype 


fun main() {
    // below is a function with parameters
    fun sayHello(name: String){
        println("Hello $name, Hope you are doing fine?")
    }


    // Below we invoke our function as we pass the name argument
    sayHello("Max")

       println("==============================")

    //    Below is a function that is able to calculate the BMI of an individual
    fun BMI(weight:Int, height:Double) {
        val answer=weight/(height*height)

        println("The BMI of the person is :$answer")
    }
        // invoke the function
        BMI(78,1.73)
        BMI(58,1.53)

        println("==============================")
        // given the child was born in the midnight of the 1st june 2026, how old will the child be in the midnight of 30th june 30th june 2026 in terms of days ,hours,minutes and seconds .create a function that is able to calculate the same


    fun convert(){
    val days = 29
    val hours= days* 29
    val min= hours *60
    val sec=min * 60

    println("The age in days of the child will be $days days, $hours hours, &minutes minutes, $sec seconds old by then")

    }
convert()

}