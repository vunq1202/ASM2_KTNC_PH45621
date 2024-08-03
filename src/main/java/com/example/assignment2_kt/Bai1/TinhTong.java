package com.example.assignment2_kt.Bai1;

public class TinhTong {
    public int tong(String a, String b) {
        try {
            if (Integer.parseInt(a) < -10000 || Integer.parseInt(a) > 10000 || Integer.parseInt(b) < -10000 || Integer.parseInt(b) > 10000) {
                throw new IllegalArgumentException("Số a, b nằm trong khoảng từ -10000 đến 10000");
            }else {
                int sum = 0;
                sum = Integer.parseInt(a) + Integer.parseInt(b);
                return sum;
            }
        }catch (IllegalArgumentException e){
            throw new IllegalArgumentException("a, b phải là số nguyên");
        }
    }

}
