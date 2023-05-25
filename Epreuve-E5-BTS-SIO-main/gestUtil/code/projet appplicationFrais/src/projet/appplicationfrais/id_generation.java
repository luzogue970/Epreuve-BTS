/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet.appplicationfrais;

import java.util.Random;

/**
 *
 * @author mleprovost
 */
public class id_generation {

    String caracteres = "abcdef";
    String chiffres = "0123456789";
    Random random = new Random();

    public String id() {

        StringBuilder str = new StringBuilder();
        int randomInt = random.nextInt(caracteres.length());
        char randomChar = caracteres.charAt(randomInt);
        str.append(randomChar);
        
        for (int i = 0; i < 2; i++) {
            int randomInt2 = random.nextInt(chiffres.length());
            char randomChar2 = chiffres.charAt(randomInt2);
            str.append(randomChar2);
        }
        return (str.toString());
    }
}
