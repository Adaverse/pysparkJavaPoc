package com.pyspark.java.poc;

public class AnotherTestClass {
    private static TestClass testClass = new TestClass();

    public static void main(String[] args) {
        testClass.printString("Hi, calling you from Another test class");
    }
}
