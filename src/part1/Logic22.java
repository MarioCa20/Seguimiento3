/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part1;

public class Logic22 {
    
    static double salario;
    
    public static String filtro(String name, double shora, int horaef){
        salario = shora*horaef;
        if(salario>450000){
            return name + " devenga un salario de " + salario;
        }else{
            return name;
        }
    }
}
