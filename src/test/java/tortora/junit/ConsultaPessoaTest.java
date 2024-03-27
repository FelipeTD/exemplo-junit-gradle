package tortora.junit;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ConsultaPessoaTest {

    @BeforeAll
    static void configuraConexao() {
        Database.iniciarConexao();
    }

    @BeforeEach
    void inserePessoa() {
        Database.insertData(new Pessoa("Joao", LocalDate.now()));
    }

    @AfterAll
    static void finalizaConexao() {
        Database.finalizarConexao();
    }

    @AfterEach
    void removePessoa() {
        Database.removeData(new Pessoa("Joao", LocalDate.now()));
    }

    @Test
    void validarDadosRetorno() {
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosRetorno2() {
        Assertions.assertTrue(true);
    }

}
