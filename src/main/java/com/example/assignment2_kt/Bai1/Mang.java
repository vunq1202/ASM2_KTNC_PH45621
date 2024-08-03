package com.example.assignment2_kt.Bai1;

public class Mang {
    public static int mang(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Vị trí " + index + " không nằm trong mảng " + array.length);
        }
        return array[index];
    }
}
