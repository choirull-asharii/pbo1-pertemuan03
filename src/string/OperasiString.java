package string;

import java.util.Locale;

public class OperasiString {
    public static void main(String[] args){
        String kota = "Batu Ampar";

        System.out.println(kota);

        char[] uniskaChar = {'u','n','i','s','k','a'};
        String uniskaString = new String(uniskaChar);
        System.out.println(uniskaString);

        System.out.println(kota.toUpperCase());
        System.out.println(kota.toLowerCase());
        System.out.println(kota.substring(5));
        System.out.println(kota.substring(0,4));

    }
}
