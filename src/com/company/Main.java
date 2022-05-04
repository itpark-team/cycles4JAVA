package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int maxRowNum = 10;
        int maxColumnNum = 10;

        for (int row = 1; row <= maxRowNum; row++) {
            for (int column = 1; column <= maxColumnNum; column++) {
                System.out.print(row * column + " ");
            }
            System.out.println();
        }
    }
}
