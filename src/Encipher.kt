fun encipher(s : String, n : Int){
    val lowerCaseAlpha = "abcdefghijklmnopqrstuvwxyz".toCharArray()
    val upperCaseAlpha = "ABCDEFGHIJKLMOPQRSTUVWXYZ".toCharArray()
    if(s.isEmpty()){
        return
    }
    val first = s[0]
    val out = when (first) {
        in lowerCaseAlpha -> ((lowerCaseAlpha[((lowerCaseAlpha.indexOf(first) + n) % 25)]))
        in upperCaseAlpha -> ((upperCaseAlpha[(((upperCaseAlpha.indexOf(first) + n) % 25))]))
        else -> (first)
    }
    print(out)
    encipher(s.substring(1), n)
}


fun main(args: Array<String>) {
    encipher("dead", 3)
}