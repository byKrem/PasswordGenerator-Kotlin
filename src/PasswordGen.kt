import kotlin.math.abs
import kotlin.random.Random

class PasswordGen {

    //TODO: Must be at least one symbol from each category:
    // Number
    // low_case char
    // UPPER_CASE char
    // Special symbol
    fun generate(length: Int): String{
        if(length < 8){
            throw IllegalArgumentException("Password length must be at least 8 symbols")
        }

        val result = StringBuilder()

        for(i in 0..<length){
            val index = abs(Random.nextInt()) % availableChars.length
            result.append(availableChars[index])
        }

        return result.toString()
    }

    companion object {
        var availableChars: String
        init{
            val chars = StringBuilder()
            for(i in 'A'..'Z'){
                chars.append(i)
            }
            for(i in 'a'..'z'){
                chars.append(i)
            }
            for(i in '0'..'9'){
                chars.append(i)
            }
            chars.append("!@#$%^&*()")

            availableChars = chars.toString()
        }
    }
}