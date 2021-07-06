package br.com.choronosacademy.media;

import org.junit.Test;

import javax.print.attribute.standard.Media;

import static org.junit.Assert.*;

public class mediaTest {
    @Test
    public void validaAprovado() {
        double n1 = 5;
        double n2 = 5;

        media mediA = new media();
        String resultado = mediA.resultadoMedia(n1, n2);

        assertEquals("Aprovado", resultado);
    }

    @Test
    public void validaReprovado() {
        double n1 = 4.9;
        double n2 = 5;

        media mediA = new media();
        String resultado = mediA.resultadoMedia(n1, n2);

        assertEquals("Reprovado", resultado);

    }
}