import com.example.assignment2_kt.Bai1.TinhTong;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TinhTongTest {
    TinhTong tinhTong = new TinhTong();

    //    Phân vùng tương đương
    @Test
    public void tong_valid() {
        int exp = 11;
        int act = tinhTong.tong("5", "6");
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void tong_invalid_nhohonam10000() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            tinhTong.tong("-25000", "3000");
        });
    }

    @Test
    public void tong_invalid_lonhon10000() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            tinhTong.tong("15000", "-2000");
        });
    }

    @Test
    public void tong_invalid_abnhohonam10000() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            tinhTong.tong("-15000", "-12000");
        });
    }

    @Test
    public void tong_invalid_ablonhon10000() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            tinhTong.tong("15000", "12000");
        });
    }

    @Test
    public void tong_invalid_abnull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            tinhTong.tong(null, null);
        });
    }

    @Test
    public void tong_invalid_abtrong() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            tinhTong.tong("", "");
        });
    }

    @Test
    public void tong_invalid_chuakhoangtrang() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            tinhTong.tong(" 5000", " 2000");
        });
    }

    //    Phân tích giá trị biên
    @Test
    public void tong_valid_bienduoi() {
        int exp = -20000;
        int act = tinhTong.tong("-10000", "-10000");
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void tong_valid_bientren() {
        int exp = 20000;
        int act = tinhTong.tong("10000", "10000");
        Assertions.assertEquals(exp, act);
    }
}
