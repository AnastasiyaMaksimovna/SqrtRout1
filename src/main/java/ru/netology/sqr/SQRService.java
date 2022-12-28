package ru.netology.sqr;

public class SQRService {
    public int numberOfSquares(int i, int z) {
        int x = 0;

        for (int c = 10; c <= 99; c = c + 1) {
            if ((c * c) >= i) {
                if ((c * c) <= z) {
                    x++;
                }
            }
        }

        return x;
    }
}
