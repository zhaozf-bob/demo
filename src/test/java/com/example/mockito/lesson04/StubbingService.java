package com.example.mockito.lesson04;

public class StubbingService {

    public int get() {
        System.out.println("getI");
        return 10;
    }

    public String getS() {
        System.out.println("getS");
        throw new RuntimeException();
    }
}
