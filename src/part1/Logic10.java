/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part1;

public class Logic10 {
    
    
    static double pagmat = 50000;
    
    public static String info_est(int pat, int est){
        
        if(pat>2000000 && est>3){
            pagmat = pagmat + (pat*0.003);
        }
        
        return String.valueOf(pagmat);
    }
}
