import com.example.assignment2_kt.Bai1.TrungBinhCong;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrungBinhCongTest {
    @Test
    public void tbc_invalid() {
        List<Integer> numbers = Arrays.asList();
        Assertions.assertThrows(ArithmeticException.class, ()->{
            TrungBinhCong.tbc(numbers);
        });
    }

    @Test
    public void tbc_valid() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        double exp = 3.0;
        double act = TrungBinhCong.tbc(numbers);
        Assertions.assertEquals(exp, act);
    }
}
