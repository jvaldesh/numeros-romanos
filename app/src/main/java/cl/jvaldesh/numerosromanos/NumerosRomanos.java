package cl.jvaldesh.numerosromanos;

import java.util.TreeMap;

public class NumerosRomanos {

    static TreeMap<Integer, String> simbolos = new TreeMap<Integer, String>() {{
        put(1, "I");
        put(5, "V");
        put(10, "X");
        put(50, "L");
        put(100, "C");
        put(500, "D");
        put(1000, "M");
    }};

    public static String convertirARomanos(Integer numero) {
        String resultado = "";
    
        char[] numeroArray = numero.toString().toCharArray();

        for (int i = 0; i < numeroArray.length; i++) {
            int pow = (int)Math.pow(10, numeroArray.length-1-i);
            int num = Character.getNumericValue(numeroArray[i]);
            if (num > 0) {
                resultado += convertir(num, pow);
            }
        }
        
        return resultado;
    }

    private static String convertir(Integer numero, Integer pow) {
        if (simbolos.get(numero * pow) != null) {
            return simbolos.get(numero * pow);
        }

        String floor = simbolos.floorEntry(numero * pow).getValue();
        String simbolo = simbolos.get(pow);

        if (numero == 4 || numero == 9) {
            String ceil = simbolos.ceilingEntry(numero * pow).getValue();
            return simbolo + ceil;
        }

        int count = numero - (int)(simbolos.floorEntry(numero * pow).getKey() / pow);
        return agregarSufijo(floor, simbolo, count);
    }

    private static String agregarSufijo(String origen, String sufijo, int numero) {
        for (int i = 1; i <= numero; i++) {
            origen += sufijo;
        }
        return origen;
    }

    /**
     * 
     * @NOTA: Iteraciones previas TDD
     * 
    private static String convertirUnidad(int unidad) {
        String resultado = null;
        switch (unidad) {
            case 0:
            case 1:
            case 2:
            case 3:
            resultado = agregarSufijo("", "I", unidad);
            break;
            case 4:
            resultado = "IV";
            break;
            case 5:
            case 6:
            case 7:
            case 8:
            resultado = agregarSufijo("V", "I", unidad-5);
            break;
            case 9:
            resultado = "IX";
            break;
        }

        return resultado;
    }

    private static String convertirDecena(int decena) {
        String resultado = null;
        switch (decena) {
            case 0:
            case 1:
            case 2:
            case 3:
            resultado = agregarSufijo("", "X", decena);
            break;
            case 4:
            resultado = "XL";
            break;
            case 5:
            case 6:
            case 7:
            case 8:
            resultado = agregarSufijo("L", "X", decena-5);
            break;
            case 9:
            resultado = "XC";
            break;
        }

        return resultado;
    }
    **/
}