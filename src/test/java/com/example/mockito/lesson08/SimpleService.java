package com.example.mockito.lesson08;

import java.io.Serializable;
import java.util.Collection;

public class SimpleService {

    public int method1(int i, String s, Collection<?> c, Serializable ser) {
        throw new RuntimeException();
    }

    public void method2(int i, String s, Collection<?> c, Serializable ser) {
        throw new RuntimeException();
    }
}
