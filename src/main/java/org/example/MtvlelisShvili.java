package org.example;

class MtvlelisShvili extends Mtvleli {

    @Override
    void countVowel(String text) {
        int count = 0;

        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);

            if (letter == 'a') {
                count++;
            }

            if (letter == 'e') {
                count++;
            }

            if (letter == 'i') {
                count++;
            }

            if (letter == 'o') {
                count++;
            }

            if (letter == 'u') {
                count++;
            }
        }

        System.out.println("ამ სტრიქონში არის " + count + " ხმოვანი");
    }
}