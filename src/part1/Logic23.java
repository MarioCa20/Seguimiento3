/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part1;

public class Logic23 {
    
    
    public static String solver(double a, double b, double c){
        double sol[];
        double disc = (Math.pow(b, 2) - (4 * a * c));
        if (disc >= 0) {

            // Una solucion
            if(disc == 0){
                double s = ((-b) - (4 * a * c)) / (2 * a);
                return "La solucion es: " + s;

            // Dos soluciones
            }else{
                double s1 = ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
                double s2 = ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
                return "Las soluciones son: " + s1 + " y " + s2;
            }

            
        } else {
            // Sin solucion
            return "No tiene solucion";
        }
    }
}
