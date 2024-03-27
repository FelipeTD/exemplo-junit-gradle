package tortora.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTest {

    @Test
    void validarTransferencia() {
        Conta conta = new Conta("123456", 0);
        Conta conta2 = new Conta("654321", 100);

        Transferencia transferencia = new Transferencia();

        Assertions.assertThrows(IllegalArgumentException.class, () -> transferencia.transfere(conta, conta2, 0));

        Assertions.assertDoesNotThrow(() -> transferencia.transfere(conta, conta2, 10));

    }

}
