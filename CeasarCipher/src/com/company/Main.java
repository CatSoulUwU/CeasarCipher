package com.company;

public class Main {

    public static void main(String[] args) {
        String path;
        Reader reader = new Reader();
        DeCipher deCipher = new DeCipher();

        path = "src/resources/cipher.txt";
        deCipher.iterations(reader.readFile(path));
    }
}
