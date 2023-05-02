package Code;

import java.util.Scanner;

public class Co_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();  

        char[] letters = new char[word.length()];  

        
        for (int i = 0; i < word.length(); i++) {
            letters[i] = word.charAt(i);
        }

       
        for (char c : letters) {
            System.out.println("'"+ c + "'");
        }
    }
}
