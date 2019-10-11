import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CashBackHackService {

    private final int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
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
