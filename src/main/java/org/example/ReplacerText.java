package org.example;

public class ReplacerText implements IReplaceSymbolA,IReplaceSymbolB{
    @Override
    public void replaceSymbolA(String text) {
        String replaceLela = text.replace('a', 'z');
        System.out.println(replaceLela);
    }

    @Override
    public void replaceSymbolB(String text) {
        String replaceGabelia = text.replace('b', 'w');
        System.out.println(replaceGabelia);
    }
}
