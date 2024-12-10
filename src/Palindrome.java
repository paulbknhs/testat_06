import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String benutzerEingabe;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bitte geben Sie ein oder mehrere Wörter ein.");
            benutzerEingabe = scanner.nextLine();
        }
        String[] worte = benutzerEingabe.split("\\s+");

        for (String wort : worte) {
            if (istPalindrom(wort)) {
                System.out.println(wort + " ist ein Palindrom.");
            } else {
                System.out.println(wort + " ist kein Palindrom.");
            }
        }
    }

    /**
     * Diese Methode überprüft, ob ein Wort ein Palindrom ist.
     * 
     * @param wort das zu überprüfende Wort
     * @return true, wenn das Wort ein Palindrom ist, false sonst
     */
    public static boolean istPalindrom(String wort) {
        wort = wort.toLowerCase();
        int anfang = 0;
        int ende = wort.length() - 1;

        while (anfang < ende) {
            if (wort.charAt(anfang) != wort.charAt(ende)) {
                return false;
            }
            anfang++;
            ende--;
        }

        return true;
    }
}