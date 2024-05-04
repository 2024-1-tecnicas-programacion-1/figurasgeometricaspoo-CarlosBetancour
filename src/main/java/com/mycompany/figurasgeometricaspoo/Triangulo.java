package com.mycompany.figurasgeometricaspoo;

public class Triangulo extends FiguraGeometrica {

    private double base;
    private double altura;

    // Constructor para inicializar los atributos
    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    // Getter y Setter para el atributo 'base'
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    // Getter y Setter para el atributo 'altura'
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Implementación del método para calcular el área específica del triángulo
    @Override
    public double obtenerArea() {
        return (base * altura) / 2;
    }

    // Implementación del método para calcular el perímetro específico del triángulo
    @Override
    public double obtenerPerimetro() {
        // En un triángulo, el perímetro es la suma de las longitudes de sus tres lados.
        // Sin más información sobre los lados, no podemos calcularlo específicamente aquí.
        return 0.0; // Por ahora, devuelve un valor arbitrario
    }
}
