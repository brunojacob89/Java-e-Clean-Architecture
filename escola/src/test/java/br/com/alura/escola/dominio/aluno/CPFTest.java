package br.com.alura.escola.dominio.aluno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CPFTest {

    @Test
    void naoDeveriaCriarCpfComNumeroInvalido(){
        assertThrows(IllegalArgumentException.class,
                () -> new CPF("076.34.354.543-345"));

        assertThrows(IllegalArgumentException.class,
                () -> new CPF(null));

        assertThrows(IllegalArgumentException.class,
                () -> new CPF(""));
    }

    @Test
    void deveriaPermitirCriarCPFComNumeroValido(){
        String numero = "123.456.789-00";
        CPF cpf = new CPF(numero);
        assertEquals(numero, cpf.getNumero());
    }
}
