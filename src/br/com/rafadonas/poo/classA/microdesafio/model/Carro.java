package br.com.rafadonas.poo.classA.microdesafio.model;

public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private String corDaLataria;
    private Motor motor;
    private int potenciaEmCV;
    private boolean motorEstaLigado;
    private int marchaAtual;
    private int numeroDeMarchas;
    private int velocidadeAtual;

    public Carro(String modelo, String marca, int ano, String corDaLataria, Motor motor, int potenciaEmCV, int numeroDeMarchas) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.corDaLataria = corDaLataria;
        this.motor = motor;
        this.potenciaEmCV = potenciaEmCV;
        this.numeroDeMarchas = numeroDeMarchas;

        this.motorEstaLigado = false;
        this.marchaAtual = 0;
        this.velocidadeAtual = 0;
    }

    public void ligaMotor() {
        if (motorEstaLigado) {
            System.out.println("Motor já ligado.");
            return;
        }
        motorEstaLigado = true;
        System.out.println("Motor ligado.");
    }

    public void desligaMotor() {
        if (velocidadeAtual > 0) {
            System.out.println("Não pode desligar em movimento.");
            return;
        }
        motorEstaLigado = false;
        marchaAtual = 0;
        System.out.println("Motor desligado.");
    }

    public void trocaMarcha(int novaMarcha) {
        if (!motorEstaLigado) {
            System.out.println("Ligue o motor primeiro.");
            return;
        }

        if (novaMarcha < 0 || novaMarcha > numeroDeMarchas) {
            System.out.println("Marcha inválida.");
            return;
        }

        marchaAtual = novaMarcha;
        System.out.println("Marcha atual: " + marchaAtual);
    }

    public void acelera() {
        if (!motorEstaLigado) {
            System.out.println("Motor desligado.");
            return;
        }

        if (marchaAtual == 0) {
            System.out.println("Ponto morto.");
            return;
        }

        velocidadeAtual += 10;
        System.out.println("Velocidade: " + velocidadeAtual + " km/h");
    }

    public void freia() {
        if (velocidadeAtual > 0) {
            velocidadeAtual -= 10;
            if (velocidadeAtual < 0) velocidadeAtual = 0;
        }
        System.out.println("Freando... " + velocidadeAtual + " km/h");
    }

    public void buzina() {
        System.out.println("BIIII BIIII 🚗");
    }

    public void ligaParabrisa() {
        System.out.println("Parabrisa ativado.");
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " (" + ano + ") | " + corDaLataria + "\nMotor: " + motor + "\nPotência: " + potenciaEmCV + " CV";
    }
}