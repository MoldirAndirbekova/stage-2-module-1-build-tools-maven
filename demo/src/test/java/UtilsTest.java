import com.epam.demo.Utils;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UtilsTest {
    @Test
    public void testForPositiveNumbers_returnsTrue() {
        List<String> list = new ArrayList<>();
        list.add("10");
        list.add("20");

        assertTrue(Utils.isAllPositiveNumbers(list));
    }

    @Test
    public void testForNegativeNumbers_returnsFalse() {
        List<String> list = new ArrayList<>();
        list.add("-30");
        list.add("-40");

        assertFalse(Utils.isAllPositiveNumbers(list));
    }

    @Test
    public void testForNegativeAndPositiveNumbers_returnsFalse() {
        List<String> list = new ArrayList<>();
        list.add("10");
        list.add("-20");

        assertFalse(Utils.isAllPositiveNumbers(list));
    }
}
