import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class DecipherKtTest{

    @Test
    fun decipher1(){
        val testString = decipher("Ohlwk urfnv")
        assertEquals("Keith rocks", testString)
    }

    @Test
    fun decipher2(){
        val testString = decipher("Vxumxgssotm oy g lbt anotm au ju")
        assertEquals("Programming is a fun thing to do", testString)
    }
    @Test
    fun decipher3(){
        val testString = decipher("Oy jyf acopoc Vyevsx yc Ukgk?")
        assertEquals("Do you prefer Kotlin or Java?", testString)
    }
    @Test
    fun decipher4(){
        val testString = decipher("Lw'v udlqlqj wrgdc")
        assertEquals("It's raining today", testString)
    }
    @Test
    fun decipher5(){
        val testString = decipher("Tajcsvtc, Lfanvjkalq gw Dgfugf")
        assertEquals("Birkbeck, University of London", testString)
    }




}
