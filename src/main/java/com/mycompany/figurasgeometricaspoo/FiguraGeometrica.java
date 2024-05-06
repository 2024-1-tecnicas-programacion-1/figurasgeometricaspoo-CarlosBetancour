package com.mycompany.figurasgeometricaspoo;

public class FiguraGeometrica {

    private String nombre;
    private String color;

    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double obtenerArea() {
    	
    	// Complejidad Temporal: O(1) Tiempo constante.
        // Complejidad Espacial: O(1) Espacio constante.
    	
        return 0.0;
        
        
    }

    public double obtenerPerimetro() {
    	
    	// Complejidad Temporal: O(1) Tiempo constante.
        // Complejidad Espacial: O(1) Espacio constante.

        return 0.0;
    }
}
