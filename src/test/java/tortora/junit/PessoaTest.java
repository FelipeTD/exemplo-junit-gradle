package tortora.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void validarCalculoIdade() {
        Pessoa pessoa = new Pessoa("Tortora", LocalDate.of(1994, 1, 1));

        Assertions.assertEquals(30, pessoa.getIdade());

    }

}
