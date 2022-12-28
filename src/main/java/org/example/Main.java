package org.example;

import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int x = service.numberOfSquares(100, 600);
        System.out.println(x);
    }
}