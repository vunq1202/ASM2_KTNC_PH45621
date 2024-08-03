import com.example.assignment2_kt.Bai1.TinhHieu;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TinhHieuTest {
    TinhHieu tinhHieu = new TinhHieu();
    //    Phân vùng tương đương
    @Test
    public void hieu_valid() {
        int exp = 2;
        int act = tinhHieu.hieu("5", "3");
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void hieu_invalid_nhohonam10000() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            tinhHieu.hieu("-15000", "2000");
        });
    }

    @Test
    public void hieu_invalid_lonhon10000() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            tinhHieu.hieu("15000", "-2000");
        });
    }

    @Test
    public void hieu_invalid_abnhohonam10000() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            tinhHieu.hieu("-15000", "-12000");
        });
    }

    @Test
    public void hieu_invalid_ablonhon10000() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            tinhHieu.hieu("15000", "12000");
        });
    }

    @Test
    public void hieu_invalid_abnull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            tinhHieu.hieu(null, null);
        });
    }

    @Test
    public void hieu_invalid_abtrong() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            tinhHieu.hieu("", "");
        });
    }

    @Test
    public void hieu_invalid_chuakhoangtrang() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            tinhHieu.hieu(" 5000", " 2000");
        });
    }

    //    Phân tích giá trị biên
    @Test
    public void hieu_valid_bienduoi() {
        int exp = 0;
        int act = tinhHieu.hieu("-10000", "-10000");
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void hieu_valid_bientren() {
        int exp = 0;
        int act = tinhHieu.hieu("10000", "10000");
        Assertions.assertEquals(exp, act);
    }
}
