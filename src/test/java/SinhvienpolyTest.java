import com.example.assignment2_kt.bai2.Sinhvien;
import com.example.assignment2_kt.bai2.Sinhvienpoly;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SinhvienpolyTest {
    Sinhvienpoly sinhvienpoly = new Sinhvienpoly();
    @BeforeEach
    public void setUp(){
        sinhvienpoly.addSV(new Sinhvien("SV1", "Nguyen Van A", "SD18403", "lop1", "ph12345"));
        sinhvienpoly.addSV(new Sinhvien("SV2", "Nguyen Van B", "SD18403", "lop1", "PH12345"));
        sinhvienpoly.addSV(new Sinhvien("SV3", "Nguyen Van C", "SD18403", "", "ph12345"));
        sinhvienpoly.addSV(new Sinhvien("SV4", "Nguyen Van D", "SD18403", "Kiem thu", "PH45678"));
        sinhvienpoly.addSV(new Sinhvien("SV5", "Nguyen Van E", "SD18403", "Kiem thu", "ph45678"));
    }

    @Test
    public void addSV_valid_tenlop(){
        int exp = 6;
        Sinhvien sv1 = new Sinhvien("SV6", "Nguyen Anh Tuan", "SD18403", "K", "PH34455");
        int act = sinhvienpoly.addSV(sv1);
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void addSV_valid_ID(){
        int exp = 6;
        Sinhvien sv2 = new Sinhvien("9", "Nguyen Anh Tuan", "SD18403", "Kiem thu", "PH34455");
        int act = sinhvienpoly.addSV(sv2);
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void addSV_valid_hoten(){
        int exp = 6;
        Sinhvien sv2 = new Sinhvien("SV7", "A", "SD18403", "Kiem thu", "PH34455");
        int act = sinhvienpoly.addSV(sv2);
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void addSV_valid_malop(){
        int exp = 6;
        Sinhvien sv2 = new Sinhvien("SV7", "Nguyen Anh Tuan", "S", "Kiem thu", "PH34455");
        int act = sinhvienpoly.addSV(sv2);
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void addSV_invalid_IDtrong(){
        Sinhvien sv3 = new Sinhvien("", "Nguyen Anh Tuan", "SD18403", "Kiem thu", "PH34455");
        Assertions.assertThrows(NullPointerException.class, ()->{
            sinhvienpoly.addSV(sv3);
        });
    }
    @Test
    public void addSV_invalid_hotentrong(){
        Sinhvien sv3 = new Sinhvien("SV8", "", "SD18403", "Kiem thu", "PH34455");
        Assertions.assertThrows(NullPointerException.class, ()->{
            sinhvienpoly.addSV(sv3);
        });
    }
    @Test
    public void addSV_invalid_maloptrong(){
        Sinhvien sv3 = new Sinhvien("SV8", "Nguyen vu tuan", "", "Kiem thu", "PH34455");
        Assertions.assertThrows(NullPointerException.class, ()->{
            sinhvienpoly.addSV(sv3);
        });
    }
    @Test
    public void addSV_invalid_tenloptrong(){
        Sinhvien sv3 = new Sinhvien("SV8", "Nguyen nam", "SD18403", "", "PH34455");
        Assertions.assertThrows(NullPointerException.class, ()->{
            sinhvienpoly.addSV(sv3);
        });
    }
    @Test
    public void addSV_invalid_masvtrong(){
        Sinhvien sv3 = new Sinhvien("SV8", "Nguyen quach uv", "SD18403", "Kiem thu", "");
        Assertions.assertThrows(NullPointerException.class, ()->{
            sinhvienpoly.addSV(sv3);
        });
    }
    @Test
    public void addSV_invalid_tenlopchuakytudacbiet(){
        Sinhvien sv3 = new Sinhvien("SV8", "Nguyentran anh", "SD18403", "Kiem@thu", "PH34455");
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            sinhvienpoly.addSV(sv3);
        });
    }

//    Phân vùng tương đương
    @Test
    public void searchSV_valid(){
        int exp = 3;
        int act = sinhvienpoly.timKiemTheoMa("ph12345");
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void searchSV_valid2(){
        int exp = 2;
        int act = sinhvienpoly.timKiemTheoMa("PH45678");
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void searchSV_invalid_masvtrong(){
        Assertions.assertThrows(NullPointerException.class, ()->{
            sinhvienpoly.timKiemTheoMa("");
        });
    }
    @Test
    public void searchSV_valid_kocomasv(){
        int exp = 0;
        int act = sinhvienpoly.timKiemTheoMa("psdf4455");
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void searchSV_invalid_masvqua20kytu(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            sinhvienpoly.timKiemTheoMa("PH12345sdfsdf9123456789");
        });
    }
}
