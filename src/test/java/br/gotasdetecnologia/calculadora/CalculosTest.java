package br.gotasdetecnologia.calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculosTest {

    // CENARIO DE TESTE
    // Preparacao do Cenario
    // Execucao
    // Resultados / Verificacoes

    @Test
    public void retornarZeroQuandoNadaInformado() {

        Calculos numerosASomar = new Calculos();

        double esperado = 0;
        double atual = numerosASomar.soma();

        Assertions.assertEquals(esperado, atual);
    }

    @Test
    public void retornarSomaQuandoValoresInformados() {

        Calculos numerosASomar = new Calculos();

        double atual = numerosASomar.soma(6, 6);
        double esperado = 12;

        Assertions.assertEquals(esperado, atual);

    }

    @Test
    public void verificaNumeroPar() {

        Calculos paraVerificar = new Calculos();

        boolean informaPar = paraVerificar.informaNumePar(2);

        Assertions.assertTrue(informaPar);
    }

    @Test
    public void verificaRaizQuadrada(){

        Calculos raizQuadrada = new Calculos();

        double atual = raizQuadrada.raizQuadrada(144);
        double esperado = 12;

        Assertions.assertEquals(esperado, atual);
    }
}