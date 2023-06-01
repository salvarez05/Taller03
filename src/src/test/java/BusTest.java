import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void asociarViaje() {
        Viaje viaje= new Viaje("s","a","13","15");
        Bus bus = new Bus("a","d","s");
        bus.asociarViaje(viaje);
        assertTrue(viaje.getBus()==bus);
        assertEquals(1,bus.getViaje().size());
    }
}