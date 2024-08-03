package com.example.assignment2_kt.bai2;

import java.util.ArrayList;
import java.util.List;

public class Sinhvienpoly {
    List<Sinhvien> list = new ArrayList<>();

    public List<Sinhvien> getList() {
        return list;
    }

    public int addSV(Sinhvien sinhvien) {
        if (sinhvien.getId().isEmpty() || sinhvien.getHoten().isEmpty() || sinhvien.getMalop().isEmpty() ||
                sinhvien.getTenlop().isEmpty() || sinhvien.getMasv().isEmpty()) {
            throw new NullPointerException("Các trường không được trống");
        } else if (sinhvien.getTenlop().matches(".*[^a-zA-Z0-9_\\s+].*")) {
            throw new IllegalArgumentException("Tên lớp không chứa ký tự đặc biệt");
        } else if (sinhvien.getTenlop().length() > 20 || sinhvien.getId().length() > 20 ||
                sinhvien.getHoten().length() > 20 || sinhvien.getMalop().length() > 20 || sinhvien.getMasv().length() > 20) {
            throw new IllegalArgumentException("Các trường không được quá 20 ký tự");
        } else {
            list.add(sinhvien);
            return list.size();
        }
    }

    public int timKiemTheoMa(String masv) {
        if (masv.isEmpty()) {
            throw new NullPointerException("Mã sv không được trống");
        } else if (masv.length() > 20) {
            throw new IllegalArgumentException("Mã sv không được quá 20 ký tự");
        } else {
            int count = 0;
            for (Sinhvien sinhvien : list) {
                if (sinhvien.getMasv().toLowerCase().contains(masv.toLowerCase())) {
                    count++;
                }
            }
            return count;
        }
    }
}
