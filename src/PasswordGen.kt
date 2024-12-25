import kotlin.math.abs
import kotlin.random.Random

class PasswordGen {

    fun generate(length: Int): String{
        val result = StringBuilder()


        for(i in 0..<length){
            val index = abs(Random.nextInt() % availableChars.length)
            result.append(availableChars[index])
        }

        return result.toString()
    }

    companion object {
        var availableChars: String = ""
        init{
            val chars = StringBuilder()
            chars.append(CharRange('A','Z'))
            chars.append(CharRange('a','z'))
            chars.append(CharRange('0','9'))
            chars.append("!@#$%^&*()")

            availableChars = chars.toString()
        }
    }
}