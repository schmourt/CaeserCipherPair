import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class EncipherKtTest{

    @Test
    fun encipher1(){
        val testString = encipher("bcdef", 1,"")
        assertEquals("cdefg", testString)
    }
    @Test
    fun encipher2(){
        val testString = encipher("DESIGN_PATTERNS!",30,"")
        assertEquals("IJXOLN_UFYYJWNX!", testString)
    }
    @Test
    fun encipher3(){
        val testString = encipher("Software_Design_Programming(SDP)",499,"")
        assertEquals("Rnesvyqd_Cdrhfm_Oqnfqyllhmf(RCO)", testString)
    }

}
