package com.driver;

/*
Observations:
This class contains 3 methods with same name, but it compiles & run successfully

 */

public class Main {

    class Product {
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

       Main.Product p = (new Main()).new Product();

        System.out.println(p.product(6, 7)); // 42

        System.out.println(p.product(4,5,6)); // 120

        System.out.println(p.product(2.8, 6.2)); // 17.36

    }



}



