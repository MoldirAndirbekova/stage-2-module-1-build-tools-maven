import com.epam.utils.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    @Test
    public void testForPositiveNumber_returnsTrue() {

        assertTrue(StringUtils.isPositiveNumber("10"));
    }

    @Test
    public void testForNegativeNumber_returnsFalse() {
        assertFalse(StringUtils.isPositiveNumber("-10"));
    }
}
