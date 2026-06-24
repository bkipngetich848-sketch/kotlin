// when statement
// is when statement is like a switch case whereby if a condition is met a certain case, the statement get printed out otherwise if no condition is met it default to the else block

fun main() {
    val marks=65

    when(marks){
        in 1.. 30-> println{"You failed"}
        in 31.. 50-> println("you have average")
        in 51.. 70-> println("you have average")
        in 71.. 100-> println("Excellent.")
        else->println("Invalid Score....")
      
    }
}