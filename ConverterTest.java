import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {
    @Test
    void rub_dol_is_correct() {
        double result= Converter.rub_dol(59.4);
        assertEquals(1, result);
    }
}