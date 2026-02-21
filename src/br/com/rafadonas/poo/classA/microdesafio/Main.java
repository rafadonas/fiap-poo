package br.com.rafadonas.poo.classA.microdesafio;

import br.com.rafadonas.poo.classA.microdesafio.model.Carro;
import br.com.rafadonas.poo.classA.microdesafio.model.Motor;
import br.com.rafadonas.poo.classA.microdesafio.model.TipoCombustivel;
import br.com.rafadonas.poo.classA.microdesafio.model.TipoMotor;

public class Main {
    public static void main(String[] args) {

        Motor motor = new Motor(
                2.0,
                4,
                16,
                TipoCombustivel.FLEX,
                TipoMotor.TURBO,
                true
        );

        Carro carro = new Carro(
                "Civic",
                "Honda",
                2022,
                "Preto",
                motor,
                155,
                6
        );

        System.out.println(carro);
        System.out.println();
        System.out.println("============ TESTE ============");

        carro.ligaMotor();
        carro.trocaMarcha(1);
        carro.acelera();
        carro.acelera();
        carro.freia();
        carro.buzina();
        carro.desligaMotor();
        System.out.println("===============================");
    }
}
