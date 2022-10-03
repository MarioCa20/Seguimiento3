/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part1;

public class Logic18 {
    
    static double salarioBruto;
    static double salarioNeto;
    
    
    public static double calcSalarioBruto(double vhora, double nhoras){
        
        salarioBruto = vhora*nhoras;
        return salarioBruto;
    }
    public static double calcSalarioNeto(double salarioBruto, double pRetencion){
        
        double dinRetenido = (salarioBruto*pRetencion)/100;
        salarioNeto = salarioBruto-dinRetenido;
        return salarioNeto;
                
    }
}
