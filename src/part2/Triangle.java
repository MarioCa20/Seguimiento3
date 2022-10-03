
package part2;

public class Triangle {
    static int base; 
    static int altura; 


    public Triangle(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public static String calcularArea() {
        return String.valueOf(base * altura / 2);
    }

    public static String calcularPerimetro() {
        return String.valueOf(base + altura +  calcularHipotenusa());
    }
    
    public static double calcularHipotenusa() {
        return Math.pow(base*base + altura*altura, 0.5);
    }

    public static String determinarTipoTriangulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa()))
            return "equilátero";
    else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa()))
        return "escaleno";
    else 
        return "isósceles";
    }
}
