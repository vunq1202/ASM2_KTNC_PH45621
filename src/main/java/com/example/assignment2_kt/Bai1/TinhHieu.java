package com.example.assignment2_kt.Bai1;

public class TinhHieu {
    public int hieu(String a, String b) {
        try {
            if (Integer.parseInt(a) < -10000 || Integer.parseInt(a) > 10000 || Integer.parseInt(b) < -10000 || Integer.parseInt(b) > 10000) {
                throw new IllegalArgumentException("Số a, b nằm trong khoảng từ -10000 đến 10000");
            }else {
                int hieu = 0;
                hieu = Integer.parseInt(a) - Integer.parseInt(b);
                return hieu;
            }
        }catch (IllegalArgumentException e){
            throw new IllegalArgumentException("a, b phải là số nguyên");
        }
    }
}
