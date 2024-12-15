package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //დავალება 1
        MtvlelisShvili mtvleli = new MtvlelisShvili();
        mtvleli.countVowel("Hello");
        mtvleli.countVowel("I love testing");

        //დავალება 2
        ReplacerText replacer = new ReplacerText();
        replacer.replaceSymbolA("Lela");
        replacer.replaceSymbolB("Gabelaia");

        //დავალება 3
        int[] arr = {18, -3, 5, -7, 6, 89, 13, 0, -89};
        for(int i = 0; i < arr.length; i++) {
            int pirveli = arr[i];
            for(int j = i + 1; j < arr.length; j++) {
                if(pirveli > arr[j]) {
                    int meore = arr[j];
                    arr[j] = pirveli;
                    arr[i] = meore;
                    pirveli = meore;
                }
            }
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}