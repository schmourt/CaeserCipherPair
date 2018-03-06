fun encipher(s : String, n : Int, init : String) : String{
    val lowerCaseAlpha = "abcdefghijklmnopqrstuvwxyz".toCharArray()
    val upperCaseAlpha = "ABCDEFGHIJKLMOPQRSTUVWXYZ".toCharArray()
    return if(s.isEmpty()){
        init
    }
    else{
        val first = s[0]
        var out = when (first) {
            in lowerCaseAlpha -> (lowerCaseAlpha[((lowerCaseAlpha.indexOf(first) + n) % 25)])
            in upperCaseAlpha -> ((upperCaseAlpha[(((upperCaseAlpha.indexOf(first) + n) % 25))]))
            else -> (first)
        }
        var build = init + out
        encipher(s.substring(1), n, build)
    }

}


fun main(args: Array<String>) {
    println(encipher("WOWEE!!! :D", 6, ""))
}