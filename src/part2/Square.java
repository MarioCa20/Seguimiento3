
package part2;

public class Square {
    static int lado; 

    Square(int lado) {
        this.lado = lado;
    }
    
    public static String  calcularArea() {
        return String.valueOf(lado*lado);
    }
    
    public static String  calcularPerimetro() {
        return String.valueOf(4*lado);
    }
}
