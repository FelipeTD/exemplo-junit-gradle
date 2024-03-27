package tortora.junit;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class ChooseOrderTest {


    @Test
    @DisplayName("A")
    // @Order(4)
    void primeiroTeste() {
        System.out.println("primeiro teste");
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("B")
    // @Order(3)
    void segundoTeste() {
        System.out.println("segundo teste");
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("C")
    // @Order(2)
    void terceiroTeste() {
        System.out.println("terceiro teste");
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("D")
    // @Order(1)
    void quartoTeste() {
        System.out.println("quarto teste");
        Assertions.assertTrue(true);
    }

}
