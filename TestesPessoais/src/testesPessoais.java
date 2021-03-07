//package cifracesar;
//
//import java.util.Scanner;
//
//public class testesPessoais {
//    public static String criptografar(String texto) {
//        int chave = 3;
//        String cript = "";
//
//        for (int i=0; i< texto.length(); i++) {
//            cript = cript+ (char)(texto.charAt(i) + chave);
//        }
//        return cript;
//    }
//    public static String descriptografar(String texto) {
//        int chave = 3;
//        String cript = "";
//
//        for (int i=0; i< texto.length(); i++) {
//            cript = cript+ (char)(texto.charAt(i) - chave);
//        }
//        return cript;
//    }
//    public static void main(String[] args) {
//        System.out.println("Digite sua chave aqui:");
//        System.out.println(criptografar("galo"));
//        System.out.println(descriptografar("jdor doido"));
//    }
//}

package cifracesar;

import java.util.Scanner;

public class testesPessoais {
    public static String encrypt(String texto) {
        String textoEnriptado= "";
        int chave = 3;
        for (int i = 0; i < texto.length(); i ++) {
            char caractere = texto.charAt(i);
            if(Character.isLetter(caractere)) {
                char lower = Character.toLowerCase(caractere);
                char c = (char)(lower  + chave);
                if (c > 'z') {
                    textoEnriptado += (char)(lower  - (26 - chave));
                }
                else {
                    textoEnriptado += c;
                }
            }
            else {
                textoEnriptado += caractere ;
            }
        }
        return textoEnriptado;
    }
    public static String decrypt(String texto) {
        String textoDesecnriptado = "";
        int chave = 3;
        for (int i = 0; i < texto.length(); i ++) {
            char caractere  = texto.charAt(i);
            if(Character.isLetter(caractere )) {
                char lower = Character.toLowerCase(caractere);
                char c = (char)(lower - chave);
                if (c < 'a') {
                    textoDesecnriptado += (char)(lower  + (26 - chave));
                }
                else {
                    textoDesecnriptado += c;
                }
            }
            else {
                textoDesecnriptado += caractere ;
            }
        }
        return textoDesecnriptado;
    }
    public static void main(String[] args) {
        System.out.println("Digite sua chave aqui:");
        System.out.println(encrypt("sejam bem vindos ao Acelera Brasil 2019"));
        System.out.println(decrypt("Vhmdp ehp ylqgrv dr dfhohud eudvlo 2019"));
    }
}