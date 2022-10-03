
package part1;

public class Logic41 {
    
    private static double mayor = 0;
    
    public static String calcMayor(double[] a){
        
        for(double i:a){
            if(i > mayor){
                mayor = i;
            }
        }
        
        return String.valueOf(mayor);
    }
}
