package com.company;

public class Main2 {
    public static void main(String[] args) {
        int maxA = 50, maxB = 50, maxC = 50;
        int countTriangles = 0;

        for (int c = 1; c <= maxC; c++) {
            for (int a = 1; a <= maxA; a++) {
                for (int b = 1; b <= maxB; b++) {
                    if (c * c == a * a + b * b) {
                        countTriangles++;
                        System.out.println(String.format("a = %d b = %d c = %d", a, b, c));
                    }
                }
            }
        }



        System.out.println("countTriangles = " + countTriangles);
    }
}
