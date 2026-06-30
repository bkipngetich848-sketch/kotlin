fun main() {
    // looping statement in kotlin allows us to repeat block of codes several time untill a condition is made
    // for loop execute fixe number of times i.e


    for(number in 1..10){
        println("the count is :$number")
    }

    println("==============================")
    // create a for loop that is able to print fro 50 to 65

    
    for(number in 50..65){
        println(" $number")
    }

     println("==============================")
    //  reserch on how to put an increment with some stepsby use of the loop
    // create a program that is able to print from 20 to 40 with the steps of 2

    for (i in 20..40 step 2 ){
        println(i)
    }

     println("==============================")
    //  below is a program that print out the odds number between 70 and 100
     for (i in 71..100){
        if(i % 2!=0)
        println(i)
    }

println("==============================")

// create a programthat is able to generate the multiplication tabl of 5
 for (number in 1..5){
   val answer= number * 5
   println("5 * &number = $answer")
 } 
 
}