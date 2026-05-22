package theory.dataStructuresJava.UsingArrays.SimpleCipher;

import java.util.Arrays;

public class Main {
    static char[] encoder=new char[26];;
    static char[] decoder=new char[26];;

    public static void main(String[] args){
        String word = "hola ñoño";
        int rotation = 3;
        for(int i =0 ; i<26; i ++){
            encoder[i]=(char)('A' +(i+rotation)%26);
//            decoder[i]=(char) (65+i);
            decoder[i] = (char)('A' +(i-rotation+26)%26);
        }
        System.out.println(Arrays.toString(encoder));
        System.out.println(Arrays.toString(decoder));
        String org= "ORIGINAL MESSAGE JUAN MANUEL";
        String encryptOrg=encrypt(org);
        System.out.println(encryptOrg);
        System.out.println(decrypt(encryptOrg));


    }
    public static String encrypt(String message){
        return transform(message,encoder);
    }
    public static String decrypt(String message){
        return transform(message,decoder);
    }
    private static String transform(String original, char[] code) {
        char[] msg = original.toCharArray( );
        for (int k=0; k < msg.length; k++)
            if(Character.isUpperCase(msg[k])) {
                int j = msg[k] - 'A';
                msg[k] = code[j];
            }
        return new String(msg);
    }
}
