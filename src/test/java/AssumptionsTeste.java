import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;

public class AssumptionsTeste {
   /* @Test
    void validarAlgoSomenteNoUsuarioWillyan(){
        Assumptions.assumeTrue("willyan".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5 + 5);
    }*/
    @Test
   @EnabledIfEnvironmentVariable(named = "USER", matches = "sillyan")
    /*@EnabledOnOs(OS.MAC, OS.LINUX);*/
    void validarAlgoSomenteNoUsuarioWillyan(){
        Assertions.assertEquals(10, 5 + 5);
    }
}
