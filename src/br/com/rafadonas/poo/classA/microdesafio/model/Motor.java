package br.com.rafadonas.poo.classA.microdesafio.model;

public class Motor {

    private double litros;
    private int numeroDeCilindros;
    private int numeroDeValvulas;
    private TipoCombustivel tipoCombustivel;
    private TipoMotor tipoMotor;

    public Motor(double litros,
                 int numeroDeCilindros,
                 int numeroDeValvulas,
                 TipoCombustivel tipoCombustivel,
                 TipoMotor tipoMotor,
                 boolean possuiTurbo) {

        if (litros <= 0) {
            throw new IllegalArgumentException("Litros do motor inválido.");
        }

        this.litros = litros;
        this.numeroDeCilindros = numeroDeCilindros;
        this.numeroDeValvulas = numeroDeValvulas;
        this.tipoCombustivel = tipoCombustivel;
        this.tipoMotor = tipoMotor;
    }

    public double getLitros() {
        return litros;
    }

    public int getNumeroDeCilindros() {
        return numeroDeCilindros;
    }

    public int getNumeroDeValvulas() {
        return numeroDeValvulas;
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }

    @Override
    public String toString() {
        return litros + "L, "
                + numeroDeCilindros + " cilindros, "
                + numeroDeValvulas + " válvulas, "
                + tipoMotor
                + ", " + tipoCombustivel;
    }
}
