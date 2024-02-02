import com.epam.demo.Utils;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UtilsTest {
    @Test
    public void testForPositiveNumbers_returnsTrue() {
        Utils utils = new Utils();
        List<String> list = new ArrayList<>();
        list.add("10");
        list.add("20");
        assertTrue(utils.isAllPositiveNumbers(list));
    }

    @Test
    public void testForNegativeNumbers_returnsFalse() {
        Utils utils = new Utils();
        List<String> list = new ArrayList<>();
        list.add("-10");
        list.add("-20");
        assertFalse(utils.isAllPositiveNumbers(list));
    }

    @Test
    public void testForNegativeandPositiveNumbers_returnsFalse() {
        Utils utils = new Utils();
        List<String> list = new ArrayList<>();
        list.add("10");
        list.add("-20");
        assertFalse(utils.isAllPositiveNumbers(list));
    }
}
