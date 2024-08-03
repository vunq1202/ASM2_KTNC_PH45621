import com.example.assignment2_kt.Bai1.TinhTich;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TinhTichTest {
    TinhTich tinhTich = new TinhTich();
    //    Phân vùng tương đương
    @Test
    public void tich_valid() {
        int exp = 15;
        int act = tinhTich.tich("5", "3");
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void tich_invalid_nhohonam10000() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            tinhTich.tich("-15000", "2");
        });
    }

    @Test
    public void tich_invalid_lonhon10000() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            tinhTich.tich("15000", "-2000");
        });
    }

    @Test
    public void tich_invalid_abnhohonam10000() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            tinhTich.tich("-15000", "-12000");
        });
    }

    @Test
    public void tich_invalid_ablonhon10000() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            tinhTich.tich("15000", "12000");
        });
    }

    @Test
    public void tich_invalid_abnull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            tinhTich.tich(null, null);
        });
    }

    @Test
    public void tich_invalid_abtrong() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            tinhTich.tich("", "");
        });
    }

    @Test
    public void tich_invalid_chuakhoangtrang() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            tinhTich.tich(" 5000", " 2000");
        });
    }

    //    Phân tích giá trị biên
    @Test
    public void tich_valid_bienduoi() {
        int exp = 100000000;
        int act = tinhTich.tich("-10000", "-10000");
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void tich_valid_bientren() {
        int exp = 100000000;
        int act = tinhTich.tich("10000", "10000");
        Assertions.assertEquals(exp, act);
    }
}
