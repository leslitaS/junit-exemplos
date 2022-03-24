import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveCalcularIdadeCorretamente(){
        Pessoa leslie = new Pessoa("Leslie", LocalDateTime.of(2000,1,1, 15,0,0));
        Assertions.assertEquals(22, leslie.getIdade());
    }

    @Test
    void deveRetornarSeEMaiorDeIdade(){
        Pessoa leslie = new Pessoa("Leslie", LocalDateTime.of(2000,1,1, 15,0,0));
        Assertions.assertTrue(leslie.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("Joao", LocalDateTime.now());
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }

}