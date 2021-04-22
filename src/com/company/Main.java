package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Моля въведете текст за шифроване:");
        char[] userInputP = s.nextLine().toCharArray();
        Multiplicity m = new Multiplicity();
        char[] c = new char[userInputP.length];

        System.out.println("Моля въведете ключ:");
        char[] userInputKey = s.next().toCharArray();

        System.out.println("Матрицата на вашия ключ е:");
        MatrixHandler keyMatrix = new MatrixHandler(userInputKey);
        keyMatrix.printMatrix(keyMatrix.matrix, keyMatrix.rowCount);


        //encrypt
        int keyIterator = 1;
        for (int i = 0; i < userInputP.length; i++) {
            if (keyIterator % keyMatrix.rowCount == 1) {
                keyIterator = 1;
            }

            if (userInputP[i] == ' ') {
                c[i] = ' ';
                continue;
            } else {
                int currSymbolIndex = m.findSymbolIndex(userInputP[i]);
                c[i] = keyMatrix.matrix[keyIterator][currSymbolIndex].letter.symbol;
            }

            keyIterator++;
        }

        System.out.println("Криптограма:");
        //print
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
    }
}
