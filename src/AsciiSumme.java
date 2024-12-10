public class AsciiSumme {
    public static void main(String[] args) {
        String name = "Sina Piccinno";
        int asciiSumme = 0;

        for (char buchstabe : name.toCharArray()) {
            if (Character.isLetter(buchstabe)) {
                System.out.println("Buchstabe: " + buchstabe + ", ASCII-Code: " + (int) buchstabe);
                asciiSumme += (int) buchstabe;
            }
        }

        System.out.println("Summe der ASCII-Codes: " + asciiSumme);
    }
}