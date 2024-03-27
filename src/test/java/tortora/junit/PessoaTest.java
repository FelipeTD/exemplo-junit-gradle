package tortora.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa pessoa = new Pessoa("Tortora", LocalDate.of(1994, 1, 1));

        Assertions.assertEquals(30, pessoa.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa pessoa = new Pessoa("Fofura", LocalDate.of(1992, 1, 1));

        Assertions.assertTrue(pessoa.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("Joao", LocalDate.of(2010, 1, 1));

        Assertions.assertFalse(joao.ehMaiorDeIdade());

    }

}
