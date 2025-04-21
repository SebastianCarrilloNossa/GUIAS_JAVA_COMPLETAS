/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesPropias28;

/**
 *
 * @author W11
 */
public class Rectangulo {
    // Propiedades
    private double base;
    private double altura;

    // Constructor por defecto
    public Rectangulo() {
        base = 0;
        altura = 0;
    }

    // Métodos set
    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Métodos get
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getArea() {
        return base * altura;
    }

    public double getPerimetro() {
        return 2 * (base + altura);
    }
}