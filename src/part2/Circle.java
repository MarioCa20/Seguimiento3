
package part2;

public class Circle {
    static int radio; 

    Circle(int radio){
        this.radio = radio;
    }

    public static String calcularArea() {
        return String.valueOf(Math.PI*Math.pow(radio,2));
    }

    public static String calcularPerimetro() {
        return String.valueOf(2*Math.PI*radio);
    }
}
