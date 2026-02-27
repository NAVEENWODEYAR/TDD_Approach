package com.unit.mockito.service;

/**
 * @author Naveen K Wodeyaar,
 * @Date 26-Feb-2026
 */

class Parent {
    void show(Object obj) {
        System.out.println("Parent Object");
    }

    void show(String str) {
        System.out.println("Parent String");
    }
}

class Child extends Parent {
    @Override
    void show(Object obj) {
        System.out.println("Child Object");
    }
}

public class OnverRidingVsOverLoading {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show("Hello");
    }
}