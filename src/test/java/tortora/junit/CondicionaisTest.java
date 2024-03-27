package tortora.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "USERNAME", matches = "Filipe")
    void validarSomenteNoUsuarioFilipe() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "USERNAME", matches = "Tortora")
    void validarEmQualquerUsuarioExcetoFilipe() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void validarNoWindows() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnOs({ OS.WINDOWS, OS.LINUX})
    void validarNoWindowsELinux() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnJre({ JRE.JAVA_17 })
    void validarNoJava17() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_22)
    void validarNoJava8Ate22() {
        Assertions.assertEquals(10, 5 + 5);
    }

}
