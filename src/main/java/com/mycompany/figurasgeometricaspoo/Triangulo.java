package com.mycompany.figurasgeometricaspoo;

public class Triangulo extends FiguraGeometrica {

    private double base;
    private double altura;

    public Triangulo(String nombre, String color, double base, double altura) {
    	
    	// Complejidad Temporal: O(1) Tiempo constante.
        // Complejidad Espacial: O(1) Espacio constante.
    	
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Implementación del método para calcular el área específica del triángulo
    @Override
    public double obtenerArea() {
    	
    	// Complejidad Temporal: O(1) Tiempo constante.
        // Complejidad Espacial: O(1) Espacio constante.
    	
        return (base * altura) / 2;
    }

    // Implementación del método para calcular el perímetro específico del triángulo
    @Override
    public double obtenerPerimetro() {
    	
    	// Complejidad Temporal: O(1) Tiempo constante.
        // Complejidad Espacial: O(1) Espacio constante.

        return 0.0; // 
    }
}
