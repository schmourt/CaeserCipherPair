fun decipher (s: String) : String{

    val freqMap = mapOf<Char, Double>('E' to 12.02, 'T' to 9.10, 'A' to 8.12, 'O' to 7.68, 'I' to 7.31, 'N' to 6.95,
            'S' to 6.95, 'R' to 6.02, 'H' to 5.92, 'D' to 4.32, 'L' to 3.98, 'U' to 2.88, 'C' to 2.71, 'M' to 2.61,
            'F' to 2.30, 'Y' to 2.11, 'W' to 2.09, 'G' to 2.03, 'P' to 1.82, 'B' to 1.49, 'V' to 1.11, 'K' to 0.69,
            'X' to 0.17, 'Q' to 0.11, 'J' to 0.10, 'Z' to 0.07)
    var maxValue = 0.0
    var outputString = ""
    for (i in 1..25){
        var tempString = encipher(s, i, "")
        var tempCounter = 0.0
        for (j in tempString){
            tempCounter += freqMap.getOrDefault(j.toUpperCase(),0.0)
        }
        if (tempCounter > maxValue) {
            maxValue = tempCounter
            outputString = tempString
        }
    }

    return (outputString)

    }

fun main(args: Array<String>) {
    (decipher("Ohlwk urfnv"))
}

