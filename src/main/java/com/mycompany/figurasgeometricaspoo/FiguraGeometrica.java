package com.mycompany.figurasgeometricaspoo;

public class FiguraGeometrica {

    private String nombre;
    private String color;

    // Constructor para inicializar los atributos
    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    // Getter y Setter para el atributo 'nombre'
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter para el atributo 'color'
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Método para calcular el área (debe ser implementado en las subclases)
    public double obtenerArea() {
        // Implementa el cálculo del área aquí
        return 0.0; // Por ahora, devuelve un valor arbitrario
    }

    // Método para calcular el perímetro (debe ser implementado en las subclases)
    public double obtenerPerimetro() {
        // Implementa el cálculo del perímetro aquí
        return 0.0; // Por ahora, devuelve un valor arbitrario
    }
}

