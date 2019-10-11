import org.junit.jupiter.api.Test;

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

    @Test
    void cashBackTest() {
        assertEquals(100, remain(900), "Wrong data to expected");
    }

    @Test
    void cashBackTest2() {
        assertNotEquals(1000, remain(1000), "Wrong data to expected");

    }

}
