package tortora.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTest {

    @Test
    void validarSomenteNoUsuarioFilipe() {
        Assumptions.assumeTrue("Filipe".equals(System.getProperty("user.name")));
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    void validarEmQualquerUsuarioExcetoFilipe() {
        Assumptions.assumeFalse("Tortora".equals(System.getProperty("user.name")));
        Assertions.assertEquals(10, 5 + 5);
    }

}
