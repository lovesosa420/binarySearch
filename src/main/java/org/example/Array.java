package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class Array {
    static int binarySearch(byte[] a, byte key) {
        return Arrays.binarySearch(a, key);
    }

    static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    static int binarySearch(char[] a, char key) {
        return Arrays.binarySearch(a, key);
    }

    static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    static int binarySearch(double[] a, double key) {
        return Arrays.binarySearch(a, key);
    }

    static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    static int binarySearch(float[] a, float key) {
        return Arrays.binarySearch(a, key);
    }

    static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    static int binarySearch(int[] a, int key) {
        return Arrays.binarySearch(a, key);
    }

    static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    static int binarySearch(long[] a, long key) {
        return Arrays.binarySearch(a, key);
    }

    static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    static int binarySearch(short[] a, short key) {
        return Arrays.binarySearch(a, key);
    }

    static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    static <T> int binarySearch(T[] a, T key, Comparator c) {
        return Arrays.binarySearch(a, key, c);
    }

    static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator c) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key, c);
    }
}