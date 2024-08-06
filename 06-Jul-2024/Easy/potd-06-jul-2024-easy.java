import java.util.* ;
import java.io.*; 
public class Solution {    
    public static String morseToEnglish(String morsecode) {
        // Write your code here
        String[] list = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.",
            "---", ".--.", "--.-", ".-.", "...", "-", "..-",
            "...-", ".--", "-..-", "-.--", "--..", //letters a- z
            "-----", ".----", "..---", "...--", "....-",
            ".....", "-....", "--...", "---..", "----."
            //digits 0-9
        };
        
        //Create a hashMap to map Morse codes to corresponding characters
        HashMap<String, Character> morseToChar = new HashMap<>();
        for (int i = 0; i < 36; i++) {
            if (i < 26) {
                morseToChar.put(list[i], (char) ('a' + i)); //a-z
            } else {
                morseToChar.put(list[i], (char) ('0' + (i - 26))); //0-9
            }
        }

        //Split the input Morse Code by spaces
        String[] morseArray = morsecode.split(" ");
        StringBuilder result = new StringBuilder();

        for (String morse : morseArray) {
            result.append(morseToChar.get(morse));
        }

        return result.toString();
    }

}
