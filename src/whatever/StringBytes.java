package whatever;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringBytes {
    public static void main(String[] args) {
        String texto = "Hola";

        // 1. Convertir el String a un arreglo de bytes
        byte[] bytes = texto.getBytes(StandardCharsets.UTF_16);
        System.out.println(Arrays.toString(bytes));
        // 2. Iterar por cada byte y mostrar sus 8 bits
        for (byte b : bytes) {
            // Se usa & 0xFF para evitar la extensión de signo
            String binario = String.format("%8s", Integer.toBinaryString(b & 0xFF))
                    .replace(' ', '0');
            System.out.print(binario + " ");
        }
        // Salida esperada para "Hi": 01001000 01101001
    }
}
