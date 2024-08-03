import com.example.assignment2_kt.Bai1.Mang;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MangTest {
    @Test
    public void mang_invalid_bienduoi() {
        int[] array = {1, 6, -7};
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            Mang.mang(array, -1);
        });
    }
    @Test
    public void mang_invalid_bientren() {
        int[] array = {1, 6, -7};
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            Mang.mang(array, 3);
        });
    }

    @Test
    public void mang_valid_vitri0() {
        int[] array = {1, 6, -7};
        Assertions.assertEquals(1, Mang.mang(array,0));
    }
    @Test
    public void mang_valid_vitri1() {
        int[] array = {1, 6, -7};
        Assertions.assertEquals(6, Mang.mang(array,1));
    }
    @Test
    public void mang_valid_vitri2() {
        int[] array = {1, 6, -7};
        Assertions.assertEquals(-7, Mang.mang(array,2));
    }
}
