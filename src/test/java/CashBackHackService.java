import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class CashBackHackService {

    private final int bonusBound = 1000;

    public int remain(int amount) {
        boolean isNeedMore = amount % bonusBound != 0;
        if (!isNeedMore) {
            return 0;
        }

        int remain = bonusBound - amount % bonusBound;
        return remain;
    }

    @ParameterizedTest
    @CsvFileSource(resources = "testData.cvs", numLinesToSkip = 1)
    void cashBackTest(int expected, int amount, String message) {
        assertEquals(expected, remain(amount), message);
    }

    @Test
    void cashBackTest2() {
        assertNotEquals(1000, remain(1000), "Wrong data to expected");

    }

}
