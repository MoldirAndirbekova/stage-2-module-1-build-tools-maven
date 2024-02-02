import com.epam.utils.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    @Test
    public void testForPositiveNumber_returnsTrue() {
        StringUtils stringUtils = new StringUtils();
        assertTrue(stringUtils.isPositiveNumber("10"));
    }

    @Test
    public void testForNegativeNumber_returnsFalse() {
        StringUtils stringUtils = new StringUtils();
        assertFalse(stringUtils.isPositiveNumber("-10"));
    }

    @Test
    public void testForZeroNumber_returnsTrue() {
        StringUtils stringUtils = new StringUtils();
        assertFalse(stringUtils.isPositiveNumber("0"));
    }
}
