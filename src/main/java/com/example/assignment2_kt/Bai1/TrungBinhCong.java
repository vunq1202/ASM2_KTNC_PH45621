package com.example.assignment2_kt.Bai1;

import java.util.List;

public class TrungBinhCong {
    public static double tbc(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new ArithmeticException("Danh sách không được rỗng");
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return sum / (double) numbers.size();
    }
}
