fun main() {
    val score=100
    if ((score>0)&&(score<40)){
    println("Got grade E. Failed")
}

else if ((score>=40) && (score<50)){
    println("You gpt grade D.Pull up your socks")
}
else if((score>=50) &&(score<60)){
    println("You got grade C.You can do better")
}
else if((score>=60) &&(score<70)){
    println("You got grade B.Thats good,One floor up much better")
}

else if((score>=70) &&(score<=100)){
    println("You got grade A.Excellent Maintain the same ...")
}

else{
    println("Invalid score....")
}
}