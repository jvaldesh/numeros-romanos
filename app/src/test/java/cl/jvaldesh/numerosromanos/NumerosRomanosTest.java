package cl.jvaldesh.numerosromanos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumerosRomanosTest {
    @Test
    void convertirSingle() {
        System.out.println("Resultado: " + NumerosRomanos.convertirARomanos(1477));
        assertEquals("MCDLXXVII", NumerosRomanos.convertirARomanos(1477));
    }

    @Test
    void convertirARomanos() {
        assertEquals("I", NumerosRomanos.convertirARomanos(1));
        assertEquals("III", NumerosRomanos.convertirARomanos(3));
        assertEquals("IV", NumerosRomanos.convertirARomanos(4));
        assertEquals("V", NumerosRomanos.convertirARomanos(5));
        assertEquals("VIII", NumerosRomanos.convertirARomanos(8));
        assertEquals("IX", NumerosRomanos.convertirARomanos(9));
        assertEquals("X", NumerosRomanos.convertirARomanos(10));
        assertEquals("XI", NumerosRomanos.convertirARomanos(11));
        assertEquals("XIII", NumerosRomanos.convertirARomanos(13));
        assertEquals("XIV", NumerosRomanos.convertirARomanos(14));
        assertEquals("XV", NumerosRomanos.convertirARomanos(15));
        assertEquals("XVIII", NumerosRomanos.convertirARomanos(18));
        assertEquals("XIX", NumerosRomanos.convertirARomanos(19));
        assertEquals("XX", NumerosRomanos.convertirARomanos(20));
        assertEquals("XXI", NumerosRomanos.convertirARomanos(21));
        assertEquals("XXIII", NumerosRomanos.convertirARomanos(23));
        assertEquals("XXIV", NumerosRomanos.convertirARomanos(24));
        assertEquals("XXV", NumerosRomanos.convertirARomanos(25));
        assertEquals("XXVIII", NumerosRomanos.convertirARomanos(28));
        assertEquals("XXIX", NumerosRomanos.convertirARomanos(29));
        assertEquals("XL", NumerosRomanos.convertirARomanos(40));
        assertEquals("L", NumerosRomanos.convertirARomanos(50));
        assertEquals("LX", NumerosRomanos.convertirARomanos(60));
        assertEquals("LXIV", NumerosRomanos.convertirARomanos(64));
        assertEquals("LXVII", NumerosRomanos.convertirARomanos(67));
        assertEquals("LXXXVIII", NumerosRomanos.convertirARomanos(88));
        assertEquals("XC", NumerosRomanos.convertirARomanos(90));
        assertEquals("XCIV", NumerosRomanos.convertirARomanos(94));
        assertEquals("XCVII", NumerosRomanos.convertirARomanos(97));
        assertEquals("C", NumerosRomanos.convertirARomanos(100));
        assertEquals("CCC", NumerosRomanos.convertirARomanos(300));
        assertEquals("CD", NumerosRomanos.convertirARomanos(400));
        assertEquals("D", NumerosRomanos.convertirARomanos(500));
        assertEquals("DCC", NumerosRomanos.convertirARomanos(700));
        assertEquals("DCCCXLIII", NumerosRomanos.convertirARomanos(843));
        assertEquals("CM", NumerosRomanos.convertirARomanos(900));
        assertEquals("CMLVIII", NumerosRomanos.convertirARomanos(958));
        assertEquals("M", NumerosRomanos.convertirARomanos(1000));
    }
}