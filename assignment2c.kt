// exams eligibility
fun main() {
    val attendance=70
    val coverage=70

    if (attendance>70 && coverage> 80){
        println("Eligible to seat for exams")
    }
    else if (attendance >70 && coverage<80){
        println("not eligible because of attendance")
    }
    else if (attendance <70 && coverage>80){
        println("not eligible bacause of attendance")
    }else{
        println("not eligible")
    }
    
}