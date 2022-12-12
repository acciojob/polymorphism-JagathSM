package com.driver;

/*
Observations should be, please check:
This class contains 3 methods with same name, but it compiles & run successfully
 */

public class Main {

    public static class Product {
        // Over loaded methods
        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }

        public double product(double x, double y) {
            return x * y;
        }

    }

    public static void main(String[] args) {

       // class Product is like an instance variable of class Main
       // so need to access Product using Main object.
       Product p = new Product();

        System.out.println(p.product(6, 7)); // 42

        System.out.println(p.product(4,5,6)); // 120

        System.out.println(p.product(2.8, 6.2)); // 17.36

    }

}
