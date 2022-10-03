/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part1;

public class Logic19 {
    
    static double perimetro;
    static double area;
    static double altura;
    
    public static double calcPerimetro( double l){
        perimetro = l*3;
        return perimetro;
    }
    
    public static double caclAltura(double l){
        
        altura = (l*Math.sqrt(3))/2;
        return altura;
    }
    
    public static double calcArea(double l){
        
        area = (Math.pow(l,2) * Math.sqrt(4))/4;
        return area;
    }
  
}
