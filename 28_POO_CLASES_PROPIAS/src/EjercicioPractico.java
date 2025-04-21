
package ClasesPropias28;

/**
 *
 * @author W11
 */
public class EjercicioPractico {
    public static void main(String[] args) {
        // Crear un objeto Rectangulo llamado suelo
        Rectangulo suelo = new Rectangulo();

        // Asignar base y altura
        suelo.setBase(30);
        suelo.setAltura(50);

        // Calcular área y perímetro
        double area = suelo.getArea();
        double peri = suelo.getPerimetro();

        // Mostrar resultados
        System.out.println("Base: " + suelo.getBase());
        System.out.println("Altura: " + suelo.getAltura());
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + peri);
    }
}




