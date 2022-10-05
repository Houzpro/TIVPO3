import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {
    @Test
    void rub_dol_is_correct() {
        double result= Converter.rub_dol(59.4);
        assertEquals(1, result);
    }
    @Test
    void rub_eur_is_correct() {
        double result= Converter.rub_eur(58.06);
        assertEquals(1, result);
    }
    @Test
    void rub_uan_is_correct() {
        double result= Converter.rub_uan(8.36);
        assertEquals(1, result);
    }

}