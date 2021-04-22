package com.company;

public class MatrixHandler {
    char[] sequence;
    Character[][] matrix;
    int rowCount;
    int colCount;
    Multiplicity multiplicity;

    MatrixHandler(char[] sequence) {
        multiplicity = new Multiplicity();
        this.sequence = new char[sequence.length];
        this.sequence = sequence;
        rowCount = sequence.length;
        colCount = multiplicity.length;
        matrix = new Character[multiplicity.length][multiplicity.length];
        createMatrix();
    }

    private void createMatrix () {
        int currLetterIndex = 0;
        for (int row = 0; row < sequence.length + 1; row++) {
            currLetterIndex = row - 1;
            for (int col = 0; col < multiplicity.length; col++) {
                if (row == 0) {
                    matrix[row][col] = new Character(row, col, multiplicity.allowedSymbols[col]);
                    continue;
                }
                else if (currLetterIndex >= multiplicity.length) {
                    currLetterIndex = 0;
                    matrix[row][col] = new Character(row, col, multiplicity.allowedSymbols[currLetterIndex]);
                    currLetterIndex++;
                }
                else {
                    if (col == 0) {
                        currLetterIndex = multiplicity.findSymbolIndex(sequence[currLetterIndex]);
                    }
                    matrix[row][col] = new Character(row, col, multiplicity.allowedSymbols[currLetterIndex]);
                    currLetterIndex++;
                }
            }
        }
    }

    public void printMatrix (Character[][] matrix, int length) {
        for (int row = 0; row < sequence.length + 1; row++) {
            for (int col = 0; col < multiplicity.length; col++) {
                System.out.print(matrix[row][col].letter.symbol + " ");
            }
            System.out.println();
        }
    }
}
