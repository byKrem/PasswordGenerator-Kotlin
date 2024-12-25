fun main(){
    val passwordGen = PasswordGen()

    for(i in 8..50){
        println(passwordGen.generate(length = i))
    }

    // IllegalArgumentException
    println(passwordGen.generate(length = 3))
}