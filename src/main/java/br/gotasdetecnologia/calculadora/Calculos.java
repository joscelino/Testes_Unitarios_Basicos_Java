package br.gotasdetecnologia.calculadora;

public class Calculos {

    public double soma(double... numeros) {

        double soma = 0;

        if (numeros.length > 0) {

            for (double numeroASomar : numeros) {
                soma += numeroASomar;
            }
        }

        return soma;
    }

    public boolean informaNumePar(int numero) {

        return numero % 2 == 0;
    }

    public double raizQuadrada(double numero) {

        return Math.sqrt(numero);
    }
}
