import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Main testing = new Main();

    @org.junit.jupiter.api.Test
    void sum() {
        Integer result = testing.sum(1,2);
        assertEquals(3, result, "Somma di 1 + 2 dovrebbe essere 3");
    }
    @org.junit.jupiter.api.Test
    void sum_negativo() {
        Integer result = testing.sum(-1,2);
        assertEquals(1, result, "Somma di -1 + 2 dovrebbe essere 1");
    }
    @org.junit.jupiter.api.Test
    void sum_null() {
        Integer result = testing.sum(null,2);
        //assertEquals(1, result, "Somma di null + 2 dovrebbe essere 1");
        assertNull(result, "Se uno dei parametri è null il risultato è null");
    }
    @org.junit.jupiter.api.Test
    void multiply() {
        Integer result = testing.multiply(1,2);
        assertEquals(2, result, "Moltiplicazione di 1 x 2 dovrebbe essere 2");
    }
    @org.junit.jupiter.api.Test
    void multiply_diverso() {
        Integer result = testing.multiply(null,2);
        assertNull(result, "Moltiplicazione con null dovrebbe restituire null");
    }
}