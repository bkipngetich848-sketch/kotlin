fun main() {
    var points=200

    when(points){
        in 0..100->println("you do not qualify")
        in 101..400->println("you win a smartphone")
        in 401..1000->println("you win a laptop")
       else->println("you win a trip to canada")
    }
}