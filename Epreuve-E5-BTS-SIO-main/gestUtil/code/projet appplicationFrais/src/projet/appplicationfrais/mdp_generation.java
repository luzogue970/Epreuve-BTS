/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet.appplicationfrais;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class mdp_generation {
    
    String setOfCharacters = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        
        public String mdp(){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            int randomInt = random.nextInt(setOfCharacters.length());
            char randomChar = setOfCharacters.charAt(randomInt);
            str.append(randomChar);
        }
        return (str.toString());
        }
                

}
