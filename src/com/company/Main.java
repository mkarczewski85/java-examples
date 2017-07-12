package com.company;

import java.util.Arrays;
import java.util.Random;

class ArrMethods {

    //generator liczb pseudolosowych jako obiekt statyczny
    static Random random = new Random();

    //metoda wypełniająca tablicę losowymi wartościami float (0.0-1.0)
    public static float[] InitializeArray(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextFloat();
        }
        return arr;
    }

    //metoda wypełniająca tablicę losowymi wartościami int
    public static int[] InitializeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }
        return arr;
    }

    //metoda wypełniająca tablicę losowymi wartościami float w przedziale od 'min' do 'max'
    public static float[] InitializeArray(float[] arr, float min, float max) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextFloat() * (max - min) + min;
        }
        return arr;
    }

    //metoda wypełniająca tablicę losowymi wartościami int w przedziale od 'min' do 'max'
    public static int[] InitializeArray(int[] arr, int min, int max) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt((max - min) + 1) + min;
        }
        return arr;
    }

    //metoda tworząca i wypełniająca tablicę o podanej długości wartościami losowymi w przedziale od 'min' do 'max'
    public static int[] CreateRandomArrayInt(int length, int min, int max) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt((max - min) + 1) + min;
        }
        return arr;
    }

    //metoda tworząca i wypełniająca tablicę o podanej długości wartościami losowymi w przedziale od 'min' do 'max'
    public static float[] CreateRandomArrayFloat(int length, float min, float max) {
        float[] arr = new float[length];
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextFloat() * (max - min) + min;
        }
        return arr;
    }

}

public class Main {

    public static void main(String[] args) {

        ArrMethods arrayMethods = new ArrMethods();

        int[] arrInt = new int[10];
        float[] arrFloat = new float[10];

        arrayMethods.InitializeArray(arrInt);
        arrayMethods.InitializeArray(arrFloat);

        System.out.println("Działanie metody InitializeArray dla int bez przedziału: " + Arrays.toString(arrInt));
        System.out.println("Działanie metody InitializeArray dla float bez przedziału: " + Arrays.toString(arrFloat));

        arrayMethods.InitializeArray(arrInt, 1, 50);
        arrayMethods.InitializeArray(arrFloat, 1, 50);

        System.out.println("Działanie metody InitializeArray dla int z przedziałem: " + Arrays.toString(arrInt));
        System.out.println("Działanie metody InitializeArray dla float z przedziałem: " + Arrays.toString(arrFloat));

        int[] arrIntRange = arrayMethods.CreateRandomArrayInt(10, 1, 50);
        float[] arrFloatRange = arrayMethods.CreateRandomArrayFloat(10, 1, 50);

        System.out.println("Działanie metody CreateArray dla int z przedziałem: " + Arrays.toString(arrIntRange));
        System.out.println("Działanie metody CreateArray dla float z przedziałem: " + Arrays.toString(arrFloatRange));

    }
}
