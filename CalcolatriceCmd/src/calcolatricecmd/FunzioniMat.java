/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcolatricecmd;
        
import static java.lang.Math.sqrt;


/**
 *
 * @author assun
 */
public class FunzioniMat {

    public FunzioniMat() {
    }
    
    //metodo che, date le lunghezze dei due cateti di un 
    //triangolo rettangolo, restituisce la lunghezza dell'ipotenusa
    public double pitagora(double a, double b) {
        return Math.sqrt((a*a) + (b*b));
    }
    
    public double seno(double angolo) {
        return Math.sin(angolo);
    }
    
    public double coseno(double angolo) {
        return Math.cos(angolo); 
    }
    
}
