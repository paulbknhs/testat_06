import java.util.Scanner;

public class CaesarChiffre {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bitte wählen Sie eine Option:");
            System.out.println("1. Verschlüsseln");
            System.out.println("2. Entschlüsseln");
            int option = scanner.nextInt();
            scanner.nextLine(); // leerer Zeilenvorschub entfernen

            System.out.println("Bitte geben Sie den Text ein:");
            String text = scanner.nextLine().toLowerCase();

            System.out.println("Bitte geben Sie den Schlüssel ein:");
            int schluessel = scanner.nextInt();

            scanner.close();
            switch (option) {
                case 1 -> System.out.println("Verschlüsselter Text: " + verschluesseln(text, schluessel));
                case 2 -> System.out.println("Entschlüsselter Text: " + entschluesseln(text, schluessel));
                default -> System.out.println("Ungültige Option");
            }
        }
    }

    /**
     * Diese Methode verschlüsselt den Text, indem sie jeden Buchstaben um den Schlüsselwert verschiebt.
     * 
     * @param text der zu verschlüsselnde Text
     * @param schluessel der Schlüsselwert
     * @return der verschlüsselte Text
     */
    public static String verschluesseln(String text, int schluessel) {
        StringBuilder verschluesselterText = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char verschluesselterBuchstabe = (char) ((c - 'a' + schluessel) % 26 + 'a');
                verschluesselterText.append(verschluesselterBuchstabe);
            } else {
                verschluesselterText.append(c);
            }
        }
        return verschluesselterText.toString();
    }

    /**
     * Diese Methode entschlüsselt den Text, indem sie den Schlüsselwert von 26 abzieht und dann die verschluesseln()-Methode aufruft.
     * 
     * @param text der zu entschlüsselnde Text
     * @param schluessel der Schlüsselwert
     * @return der entschlüsselte Text
     */
    public static String entschluesseln(String text, int schluessel) {
        return verschluesseln(text, 26 - schluessel);
    }
}