package com.mycompany.figurasgeometricaspoo;

public class Circulo extends FiguraGeometrica {
    private double radio;

    // Constructor para inicializar los atributos
    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }

    // Getter y Setter para el atributo 'radio'
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Implementación del método para calcular el área específica del círculo
    @Override
    public double obtenerArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    // Implementación del método para calcular el perímetro específico del círculo
    @Override
    public double obtenerPerimetro() {
        return 2 * Math.PI * radio;
    }
}
